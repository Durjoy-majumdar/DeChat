package p201lz;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o13.C11329e;
import o13.C11342g;
import p617mz.C76813e;
import rx3.C13598b0;
import zt3.C119157j;

@C86522b
/* renamed from: lz.e */
public final class C10695e extends C86301e implements C76813e {

    /* renamed from: lz.e$a */
    public static final class C10696a implements Runnable {

        /* renamed from: d */
        public static final C10696a f32136d = new C10696a();

        /* renamed from: lz.e$a$a */
        public static final class C10697a implements Runnable {

            /* renamed from: d */
            public static final C10697a f32137d = new C10697a();

            public final void run() {
                C13598b0 b0Var;
                C11342g gVar = C11342g.f33303d;
                gVar.getClass();
                boolean z = MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_COMM_KV").getBoolean("MMKV_KEY_NeedNotifyFlag", false);
                Log.m105924i("MicroMsg.XUpdate.XUpdateManager", "tryNotifyUpdateWithRedDotAndDialog " + z);
                if (z) {
                    String string = MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_COMM_KV").getString("MMKV_KEY_LastNotifyMd5", "");
                    Log.m105924i("MicroMsg.XUpdate.XUpdateManager", "notifyChangeIfNeed " + string + ' ' + gVar.mo11368q().f259799g);
                    if (!C87412m.m108589b(string, gVar.mo11368q().f259799g)) {
                        MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_COMM_KV").putString("MMKV_KEY_LastNotifyMd5", gVar.mo11368q().f259799g);
                        Iterator it = ((ArrayList) C11342g.f33311o).iterator();
                        while (it.hasNext()) {
                            C32226l lVar = (C32226l) ((WeakReference) it.next()).get();
                            if (lVar != null) {
                                lVar.invoke(gVar.mo11368q());
                                b0Var = C13598b0.f38549a;
                            } else {
                                b0Var = null;
                            }
                            if (b0Var == null) {
                                it.remove();
                            }
                        }
                    }
                    gVar.mo11366O(false, "notify success");
                }
            }
        }

        public final void run() {
            if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                ((C119157j) C119157j.f356862d).mo183895z(C10697a.f32137d);
            }
        }
    }

    /* renamed from: NP */
    public boolean mo10946NP(Context context) {
        return C11329e.f33285a.mo11359h();
    }

    public String kt0() {
        return C11329e.f33285a.mo11355d();
    }

    /* renamed from: mU */
    public void mo10948mU() {
        ((C119157j) C119157j.f356862d).mo183875f(C10696a.f32136d);
    }

    public void t00(Context context) {
        if (context != null) {
            C11329e.f33285a.mo11361j(context);
        }
    }
}
