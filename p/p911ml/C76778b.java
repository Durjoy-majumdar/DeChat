package p911ml;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.HashSet;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: ml.b */
public final class C76778b {

    /* renamed from: a */
    public static final C76778b f224582a = new C76778b();

    /* renamed from: b */
    public static final HashMap<Long, HashSet<C76777a>> f224583b = new HashMap<>();

    /* renamed from: ml.b$a */
    public static final class C76779a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f224584d;

        /* renamed from: e */
        public final /* synthetic */ boolean f224585e;

        /* renamed from: f */
        public final /* synthetic */ String f224586f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76779a(long j, boolean z, String str) {
            super(0);
            this.f224584d = j;
            this.f224585e = z;
            this.f224586f = str;
        }

        public Object invoke() {
            HashSet<C76777a> hashSet = C76778b.f224583b.get(Long.valueOf(this.f224584d));
            if (hashSet != null) {
                long j = this.f224584d;
                boolean z = this.f224585e;
                String str = this.f224586f;
                for (C76777a a : hashSet) {
                    a.mo95657a(j, z, str);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ml.b$b */
    public static final class C76780b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f224587d;

        /* renamed from: e */
        public final /* synthetic */ C76777a f224588e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76780b(long j, C76777a aVar) {
            super(0);
            this.f224587d = j;
            this.f224588e = aVar;
        }

        public Object invoke() {
            HashMap<Long, HashSet<C76777a>> hashMap = C76778b.f224583b;
            HashSet hashSet = hashMap.get(Long.valueOf(this.f224587d));
            if (hashSet != null) {
                C76777a aVar = this.f224588e;
                long j = this.f224587d;
                hashSet.remove(aVar);
                if (hashSet.isEmpty()) {
                    hashMap.remove(Long.valueOf(j));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo107030a(long j, boolean z, String str) {
        Log.m105924i("MicroMsg.EmojiCaptureCallbackDispatcher", "dispatch: " + j + ", " + z + ", " + str);
        C61926c.m72668M(new C76779a(j, z, str));
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            Intent intent = new Intent("com.tencent.mm.Emoji_Capture_Upload");
            intent.putExtra("upload_time_enter", j);
            intent.putExtra("upload_success", z);
            intent.putExtra("upload_md5", str);
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    /* renamed from: b */
    public final void mo107031b(long j, C76777a aVar) {
        C87412m.m108594g(aVar, "callback");
        C61926c.m72668M(new C76780b(j, aVar));
    }
}
