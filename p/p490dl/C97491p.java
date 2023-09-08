package p490dl;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import lc3.C10485b;
import rx3.C13598b0;
import u61.C101964h;

/* renamed from: dl.p */
public final class C97491p {

    /* renamed from: a */
    public static final C97491p f286143a = new C97491p();

    /* renamed from: b */
    public static final Boolean[] f286144b = {Boolean.FALSE};

    /* renamed from: c */
    public static final C97492a f286145c = new C97492a();

    /* renamed from: dl.p$a */
    public static final class C97492a extends ThreadLocal<Boolean> {
        public Object initialValue() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m125606b(C97491p pVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        pVar.mo136773a(z);
    }

    /* renamed from: a */
    public final void mo136773a(boolean z) {
        Boolean[] boolArr = f286144b;
        boolean z2 = false;
        if (!boolArr[0].booleanValue() || z) {
            synchronized (boolArr) {
                if (!boolArr[0].booleanValue() || z) {
                    C97492a aVar = f286145c;
                    Object obj = aVar.get();
                    Boolean bool = Boolean.TRUE;
                    if (!C87412m.m108589b(obj, bool)) {
                        try {
                            aVar.set(bool);
                            ArrayList<EmojiInfo> a = C97489o.m125592g().mo136760a();
                            C87412m.m108593f(a, "customList");
                            ArrayList arrayList = new ArrayList();
                            for (T next : a) {
                                if (true ^ C101964h.m134228j((EmojiInfo) next)) {
                                    arrayList.add(next);
                                }
                            }
                            int size = arrayList.size();
                            boolean z3 = size >= C97496s.m125613a();
                            C97491p pVar = f286143a;
                            pVar.mo136774c().putInt("normal_custom_size", size);
                            pVar.mo136774c().putBoolean("custom_full", z3);
                            int size2 = C97489o.m125592g().mo136761b(false).size();
                            if (size2 >= Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("CaptureEmojiMaxSize"), 300)) {
                                z2 = true;
                            }
                            pVar.mo136774c().putInt("capture_custom_size", size2);
                            pVar.mo136774c().putBoolean("capture_full", z2);
                            Log.m105924i("MicroMsg.EmojiStorageState", "init: normal size is " + size + ' ' + z3 + "; capture size is " + size2 + ' ' + z2);
                        } finally {
                            f286145c.set(Boolean.FALSE);
                        }
                    } else {
                        return;
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: c */
    public final MultiProcessMMKV mo136774c() {
        m125606b(this, false, 1, (Object) null);
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("emoji_stg");
        C87412m.m108593f(mmkv, "getMMKV(KVName)");
        return mmkv;
    }

    /* renamed from: d */
    public final boolean mo136775d() {
        if (!MMApplicationContext.isMainProcess()) {
            return true;
        }
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_EMOJI_STORE_IP_INTRO_SHOWN_BOOLEAN, false);
        Log.m105924i("MicroMsg.EmojiStorageState", "hasShowIpIntro: " + g);
        return g;
    }

    /* renamed from: e */
    public final void mo136776e() {
        if (MMApplicationContext.isMainProcess()) {
            Log.m105924i("MicroMsg.EmojiStorageState", "setIpIntroShow: ");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_STORE_IP_INTRO_SHOWN_BOOLEAN, Boolean.TRUE);
        }
    }
}
