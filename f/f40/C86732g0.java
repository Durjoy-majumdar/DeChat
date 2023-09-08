package f40;

import bp3.C79760s;
import g40.C87134f;
import j40.C46396a;
import junit.framework.Assert;
import mp3.C88819d;
import nr3.C89055a;

/* renamed from: f40.g0 */
public final class C86732g0<_Profile extends C46396a> {

    /* renamed from: h */
    public static C86732g0 f251788h;

    /* renamed from: a */
    public final C86738i f251789a = new C86738i();

    /* renamed from: b */
    public final C31884j<_Profile> f251790b;

    /* renamed from: c */
    public final byte[] f251791c = new byte[0];

    /* renamed from: d */
    public volatile boolean f251792d = false;

    /* renamed from: e */
    public long f251793e;

    /* renamed from: f */
    public C86733a f251794f;

    /* renamed from: g */
    public final C86734b f251795g = new C86734b();

    /* renamed from: f40.g0$a */
    public interface C86733a {
    }

    /* renamed from: f40.g0$b */
    public static class C86734b extends C89055a<C87134f> implements C87134f {

        /* renamed from: f40.g0$b$a */
        public class C86735a implements C89055a.C89056a<C87134f> {
            public C86735a(C86734b bVar) {
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                C87134f fVar = (C87134f) obj;
                try {
                    C79760s.m96908a("onStartupDone:" + fVar.getClass().getName());
                    fVar.mo1180e();
                } finally {
                    C79760s.m96909b();
                }
            }
        }

        /* renamed from: f40.g0$b$b */
        public class C86736b implements C89055a.C89056a<C87134f> {

            /* renamed from: a */
            public final /* synthetic */ boolean f251796a;

            public C86736b(C86734b bVar, boolean z) {
                this.f251796a = z;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C87134f) obj).mo1181g(this.f251796a);
            }
        }

        public C86734b() {
            super(C88819d.f256219UI);
        }

        /* renamed from: e */
        public void mo1180e() {
            mo123416n(new C86735a(this));
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
            mo123416n(new C86736b(this, z));
        }
    }

    public C86732g0(_Profile _profile) {
        this.f251790b = new C31884j<>(_profile);
    }

    /* renamed from: c */
    public static <_Profile extends C46396a> C86732g0<_Profile> m107592c() {
        Assert.assertNotNull("Skeleton not initialized!", f251788h);
        return f251788h;
    }

    /* renamed from: a */
    public C86738i mo121133a() {
        Assert.assertNotNull("mCorePlugins not initialized!", this.f251789a);
        return this.f251789a;
    }

    /* renamed from: b */
    public C31884j<_Profile> mo121134b() {
        Assert.assertNotNull("mCoreProcess not initialized!", this.f251790b);
        return this.f251790b;
    }
}
