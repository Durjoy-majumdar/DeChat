package gh2;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fh2.C97885k;
import gy3.C8480h;
import h81.C32735h;
import kg3.C76577a;

/* renamed from: gh2.a */
public final class C98116a extends C97885k<C98117a> implements C75918b {

    /* renamed from: b */
    public static final C98116a f287596b = new C98116a();

    /* renamed from: gh2.a$a */
    public static final class C98117a {

        /* renamed from: a */
        public int f287597a;

        /* renamed from: b */
        public boolean f287598b;

        /* renamed from: c */
        public int f287599c;

        /* renamed from: d */
        public int f287600d;

        /* renamed from: e */
        public boolean f287601e;

        /* renamed from: f */
        public boolean f287602f;

        /* renamed from: g */
        public boolean f287603g;

        /* renamed from: h */
        public boolean f287604h;

        /* renamed from: i */
        public int f287605i;

        public C98117a() {
            this(0, false, 0, 0, 15, (C8480h) null);
        }

        public C98117a(int i, boolean z, int i2, int i3, int i4, C8480h hVar) {
            i = (i4 & 1) != 0 ? 2 : i;
            z = (i4 & 2) != 0 ? true : z;
            i2 = (i4 & 4) != 0 ? 0 : i2;
            i3 = (i4 & 8) != 0 ? 0 : i3;
            this.f287597a = i;
            this.f287598b = z;
            this.f287599c = i2;
            this.f287600d = i3;
            this.f287604h = true;
            this.f287605i = 10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C98117a)) {
                return false;
            }
            C98117a aVar = (C98117a) obj;
            return this.f287597a == aVar.f287597a && this.f287598b == aVar.f287598b && this.f287599c == aVar.f287599c && this.f287600d == aVar.f287600d;
        }

        public int hashCode() {
            int i = this.f287597a * 31;
            boolean z = this.f287598b;
            if (z) {
                z = true;
            }
            return ((((i + (z ? 1 : 0)) * 31) + this.f287599c) * 31) + this.f287600d;
        }

        public String toString() {
            return "StoryBasicConfig(repeatMD5=" + this.f287597a + ", showMusicIcon=" + this.f287598b + ", albumThumbHeight=" + this.f287599c + ", albumThumbWidth=" + this.f287600d + ')';
        }
    }

    /* renamed from: b */
    public int mo106175b() {
        return ((C98117a) mo138761d()).f287605i;
    }

    /* renamed from: g */
    public Object mo137402g() {
        return new C98117a(0, false, 0, 0, 15, (C8480h) null);
    }

    /* renamed from: h */
    public void mo137403h() {
        Class cls = C32735h.class;
        boolean z = true;
        ((C98117a) mo138762e()).f287598b = mo138763f("StoryEditVideoBgmSwitch", 1) == 1;
        int b = C76577a.m92151b(MMApplicationContext.getContext(), 1) * 100;
        ((C98117a) mo138762e()).f287599c = b;
        ((C98117a) mo138762e()).f287600d = b;
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
            C98117a aVar = (C98117a) mo138762e();
            ((C98117a) mo138762e()).f287601e = true;
            C98117a aVar2 = (C98117a) mo138762e();
            ((C98117a) mo138762e()).f287603g = true;
            C98117a aVar3 = (C98117a) mo138762e();
            C98117a aVar4 = (C98117a) mo138762e();
        } else {
            C98117a aVar5 = (C98117a) mo138762e();
            ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_favorite_enable, 0);
            ((C98117a) mo138762e()).f287601e = true;
            C98117a aVar6 = (C98117a) mo138762e();
            ((C98117a) mo138762e()).f287603g = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_image_2_video_enable, 1) == 1;
            C98117a aVar7 = (C98117a) mo138762e();
            ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_edit_tip_enable, 1);
        }
        C98117a aVar8 = (C98117a) mo138762e();
        mo138763f("StoryFeaturedExpiredTime", 15552000);
        ((C98117a) mo138762e()).f287605i = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_album_duration, 10);
        ((C98117a) mo138762e()).f287602f = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_edit_lyrics_enable, 1) == 1;
        C98117a aVar9 = (C98117a) mo138762e();
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_add_music_enable, 1) != 1) {
            z = false;
        }
        aVar9.f287604h = z;
    }
}
