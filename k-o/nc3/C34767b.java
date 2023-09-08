package nc3;

import di3.C7335d;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: nc3.b */
public interface C34767b extends C7335d {

    /* renamed from: nc3.b$a */
    public interface C21622a {
        /* renamed from: a */
        void mo17997a(boolean z);

        void onResume();

        void onStop();
    }

    /* renamed from: nc3.b$c */
    public interface C34768c {
        /* renamed from: a */
        boolean mo34198a();

        /* renamed from: b */
        C34769b mo34199b();
    }

    /* renamed from: nc3.b$b */
    public static abstract class C34769b {

        /* renamed from: a */
        public final String f93451a;

        /* renamed from: b */
        public final int f93452b;

        /* renamed from: nc3.b$b$a */
        public static final class C34770a extends C34769b {

            /* renamed from: c */
            public static final C34770a f93453c = new C34770a();

            public C34770a() {
                super("app_brand_video_live_full", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$d */
        public static final class C34771d extends C34769b {

            /* renamed from: c */
            public static final C34771d f93454c = new C34771d();

            public C34771d() {
                super("finder_live_full", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$e */
        public static final class C34772e extends C34769b {

            /* renamed from: c */
            public static final C34772e f93455c = new C34772e();

            public C34772e() {
                super("finder_video_full", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$f */
        public static final class C34773f extends C34769b {

            /* renamed from: c */
            public static final C34773f f93456c = new C34773f();

            public C34773f() {
                super("finder_video_mini", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$j */
        public static final class C34774j extends C34769b {

            /* renamed from: c */
            public static final C34774j f93457c = new C34774j();

            public C34774j() {
                super("text_status", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$p */
        public static final class C34775p extends C34769b {

            /* renamed from: c */
            public static final C34775p f93458c = new C34775p();

            public C34775p() {
                super("voice_message_recorder", 5, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$b */
        public static final class C34776b extends C34769b {

            /* renamed from: c */
            public static final C34776b f93459c = new C34776b();

            public C34776b() {
                super("biz_h5_video_full", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$c */
        public static final class C34777c extends C34769b {

            /* renamed from: c */
            public static final C34777c f93460c = new C34777c();

            public C34777c() {
                super("c2c_video", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$g */
        public static final class C34778g extends C34769b {

            /* renamed from: c */
            public static final C34778g f93461c = new C34778g();

            public C34778g() {
                super("multitalk", 5, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$h */
        public static final class C34779h extends C34769b {

            /* renamed from: c */
            public static final C34779h f93462c = new C34779h();

            public C34779h() {
                super("wechat_grobal_music", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$i */
        public static final class C34780i extends C34769b {

            /* renamed from: c */
            public static final C34780i f93463c = new C34780i();

            public C34780i() {
                super("sns_video", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$k */
        public static final class C34781k extends C34769b {

            /* renamed from: c */
            public static final C34781k f93464c = new C34781k();

            public C34781k() {
                super("text_to_voice_message", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$l */
        public static final class C34782l extends C34769b {

            /* renamed from: c */
            public static final C34782l f93465c = new C34782l();

            public C34782l() {
                super("top_story_video_full", 4, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$m */
        public static final class C34783m extends C34769b {

            /* renamed from: c */
            public static final C34783m f93466c = new C34783m();

            public C34783m() {
                super("voip", 5, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$n */
        public static final class C34784n extends C34769b {

            /* renamed from: c */
            public static final C34784n f93467c = new C34784n();

            public C34784n() {
                super("video_recorder", 5, (C8480h) null);
            }
        }

        /* renamed from: nc3.b$b$o */
        public static final class C34785o extends C34769b {

            /* renamed from: c */
            public static final C34785o f93468c = new C34785o();

            public C34785o() {
                super("voice_message", 4, (C8480h) null);
            }
        }

        public C34769b(String str, int i, C8480h hVar) {
            this.f93451a = str;
            this.f93452b = i;
        }

        public boolean equals(Object obj) {
            C34769b bVar = obj instanceof C34769b ? (C34769b) obj : null;
            return bVar != null && C87412m.m108589b(bVar.f93451a, this.f93451a) && bVar.f93452b == this.f93452b;
        }

        public int hashCode() {
            return this.f93451a.hashCode() + this.f93452b;
        }

        public String toString() {
            return "IPluginAudioFocusManager.RequestScene(requestScene:" + this.f93451a + ",featureFlag:" + this.f93452b + ')';
        }
    }

    boolean b20(C34768c cVar);

    /* renamed from: el */
    C34768c mo34192el(C34769b bVar, C21622a aVar);
}
