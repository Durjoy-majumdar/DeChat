package cw2;

import com.tencent.p014mm.plugin.story.model.StoryCore;
import gy3.C87412m;
import kw2.C99264e;
import kw2.C99265f;

/* renamed from: cw2.n */
public final class C97390n {

    /* renamed from: a */
    public static final C97390n f285891a = new C97390n();

    /* renamed from: a */
    public final void mo136647a(String str, long j, int i, String str2, String str3, long j2) {
        String str4 = str;
        long j3 = j;
        int i2 = i;
        C87412m.m108594g(str, "username");
        C99265f g = StoryCore.f281736t.mo134189g();
        String str5 = str2 == null ? "" : str2;
        String str6 = str3 == null ? "" : str3;
        C99264e Yt = g.mo138643Yt(str);
        if (Yt == null) {
            Yt = g.mo138640Ow(str);
        }
        boolean l2 = Yt.mo138638l2();
        boolean isValid = Yt.isValid();
        if (((Boolean) ((C99264e.C61176a) C99264e.f291059X).invoke(Long.valueOf(Yt.field_syncId), Long.valueOf(j))).booleanValue()) {
            Yt.field_updateTime = ((long) i2) * 1000;
        }
        Yt.field_syncId = j3;
        if (Yt.field_preloadStoryId != j3) {
            Yt.field_preloadStoryId = 0;
            Yt.field_preloadMediaId = "";
            Yt.field_preLoadResource = 0;
        }
        Yt.field_storyPostTime = i2;
        Yt.field_newThumbUrl = str5;
        Yt.field_newVideoUrl = str6;
        Yt.field_duration = j2;
        boolean SE = g.mo138641SE(Yt);
        boolean l25 = Yt.mo138638l2();
        boolean isValid2 = Yt.isValid();
        if (SE && isValid && !isValid2) {
            g.doNotify("notify_story_invalid", 4, Yt);
        } else if (SE && !l2 && l25) {
            g.doNotify("notify_story_unread", 2, Yt);
        } else if (SE && l2 && !l25) {
            g.doNotify("notify_story_read", 1, Yt);
        } else if (SE && !isValid && isValid2) {
            g.doNotify("notify_story_valid", 5, Yt);
        } else if (SE && l2 && l25) {
            g.doNotify("notify_story_unread", 2, Yt);
        }
    }
}
