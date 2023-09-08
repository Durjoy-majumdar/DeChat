package zv2;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import di3.C86312j;
import gy3.C8480h;
import h81.C32735h;
import xv2.C79004h;
import yv2.C102968a;

/* renamed from: zv2.c */
public final class C103109c extends C102968a<C39457a> implements C79004h {

    /* renamed from: b */
    public static final C103109c f304232b = new C103109c();

    /* renamed from: zv2.c$a */
    public static final class C39457a {

        /* renamed from: a */
        public boolean f105974a;

        public C39457a() {
            this(false, 1, (C8480h) null);
        }

        public C39457a(boolean z, int i, C8480h hVar) {
            this.f105974a = (i & 1) != 0 ? false : z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C39457a) && this.f105974a == ((C39457a) obj).f105974a;
        }

        public int hashCode() {
            boolean z = this.f105974a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "StoryNewFeatureConfig(visitorEnable=" + this.f105974a + ')';
        }
    }

    /* renamed from: a */
    public boolean mo108963a() {
        return ((C39457a) mo138761d()).f105974a;
    }

    /* renamed from: g */
    public Object mo137402g() {
        return new C39457a(false, 1, (C8480h) null);
    }

    /* renamed from: h */
    public void mo137403h() {
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_story_visitor_enable;
        Class cls = C32735h.class;
        if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
            ((C39457a) mo138762e()).f105974a = ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, false);
            return;
        }
        ((C39457a) mo138762e()).f105974a = ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, false);
    }
}
