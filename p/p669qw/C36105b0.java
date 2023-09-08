package p669qw;

import android.content.Context;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import dh2.C31182a;
import dh2.C31183b;
import di3.C86301e;
import ei3.C86522b;
import f40.C31887k0;
import f40.C86709a0;
import f40.C86718e;
import gh2.C75918b;
import gh2.C98116a;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p232rw.C77573p;
import zg2.C103014f;
import zg2.C103020m;
import zg2.C103021n;
import zg2.C39357g;
import zh3.C91753f;

@C86522b
/* renamed from: qw.b0 */
public final class C36105b0 extends C86301e implements C77573p {

    /* renamed from: d */
    public C39357g f96223d;

    /* renamed from: e */
    public final HashSet<Class<? extends MMBaseAccessibilityConfig>> f96224e = new HashSet<>();

    /* renamed from: f */
    public final C36109b f96225f = new C36109b();

    /* renamed from: qw.b0$a */
    public static final class C36106a implements C31887k0.C31890c {

        /* renamed from: qw.b0$a$a */
        public static final class C36107a implements C91753f.C66827b {

            /* renamed from: a */
            public static final C36107a f96226a = new C36107a();

            /* renamed from: a */
            public final String[] mo6410a() {
                String[] strArr = C39357g.f105780e;
                return C39357g.f105780e;
            }
        }

        /* renamed from: qw.b0$a$b */
        public static final class C36108b implements C91753f.C66827b {

            /* renamed from: a */
            public static final C36108b f96227a = new C36108b();

            /* renamed from: a */
            public final String[] mo6410a() {
                String[] strArr = C31182a.f83573e;
                return C31182a.f83573e;
            }
        }

        /* renamed from: Rg */
        public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
            HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C103014f.f303968y0;
            hashMap.put(Integer.valueOf(C103014f.f303966Q0.hashCode()), C36107a.f96226a);
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C31183b.f83575p;
            hashMap.put(Integer.valueOf(C31183b.f83576q.hashCode()), C36108b.f96227a);
            return hashMap;
        }
    }

    /* renamed from: qw.b0$b */
    public static final class C36109b extends C114668z.C104589a {
        public void onAppBackground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86718e.m107551r();
            }
        }

        public void onAppForeground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p && !C86718e.m107551r()) {
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_VIDEO_RECORD_CLEAN_BG_MIX_TASK_TIME_LONG;
                Object f = i.mo119685f(aVar, 0L);
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Long");
                if (Util.secondsToNow(Util.nullAsNil((Long) f)) > 86400) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(Util.nowSecond()));
                    C103020m mVar = C103020m.f303985a;
                    ISQLiteDatabase iSQLiteDatabase = C103020m.f303986b.f105782d;
                    String str2 = C39357g.f105781f;
                    int delete = iSQLiteDatabase.delete(str2, "timeStamp< ?-expiredTime", new String[]{"" + System.currentTimeMillis()});
                    Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "clean expired task, num:" + delete);
                }
            }
        }
    }

    /* renamed from: Ks */
    public void mo60533Ks(Class<? extends MMBaseAccessibilityConfig> cls) {
        if (cls != null) {
            this.f96224e.add(cls);
        }
    }

    public Set<Class<? extends MMBaseAccessibilityConfig>> Z00() {
        return this.f96224e;
    }

    /* renamed from: jv */
    public void mo60535jv() {
        int delete = vx0().f105782d.delete(C39357g.f105781f, (String) null, (String[]) null);
        Log.m105924i("MicroMsg.VideoEditDataStorage", "dropTable " + delete);
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        C91753f fVar = C86709a0.m107535s().f251811i;
        C87412m.m108593f(fVar, "storage().dataDB");
        this.f96223d = new C39357g(fVar);
        this.f96225f.alive();
        C103021n.f303991a.mo142741b();
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        this.f96225f.dead();
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
    }

    public C75918b uc0() {
        return C98116a.f287596b;
    }

    public final C39357g vx0() {
        if (C86709a0.m107522a()) {
            if (this.f96223d == null) {
                C91753f fVar = C86709a0.m107535s().f251811i;
                C87412m.m108593f(fVar, "storage().dataDB");
                this.f96223d = new C39357g(fVar);
            }
            C39357g gVar = this.f96223d;
            C87412m.m108591d(gVar);
            return gVar;
        }
        throw new IllegalStateException("getVideoEditorDataStorage() was called when account is not ready.");
    }
}
