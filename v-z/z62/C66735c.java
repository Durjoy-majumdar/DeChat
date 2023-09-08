package z62;

import gy3.C8480h;
import gy3.C87412m;
import p1081gi.C98127h;

/* renamed from: z62.c */
public class C66735c extends C66734b {

    /* renamed from: d */
    public static final C66736a f191767d = new C66736a((C8480h) null);

    /* renamed from: e */
    public static final int f191768e = Math.max(4, Runtime.getRuntime().availableProcessors());

    /* renamed from: f */
    public static final int f191769f = 4;

    /* renamed from: c */
    public final C98127h f191770c;

    /* renamed from: z62.c$a */
    public static final class C66736a {
        public C66736a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C98127h mo90768a(String str, String str2, String str3) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "url");
            C87412m.m108594g(str3, "path");
            C98127h hVar = new C98127h();
            hVar.f287660d = "task_FinderUtil";
            hVar.field_mediaId = str;
            hVar.f287705p0 = str2;
            hVar.f287673t = 60;
            hVar.f287674u = 60;
            hVar.f287689V = 1;
            hVar.f287655L = 8;
            hVar.f287698Z0 = 0;
            hVar.field_fullpath = str3;
            hVar.f287696Y0 = C66735c.f191768e;
            hVar.f287657N = C66735c.f191769f;
            hVar.f287688U0 = "finder-live-ad-video";
            return hVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66735c(String str, String str2, C98127h hVar) {
        super(str, str2);
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "downloadUrl");
        C87412m.m108594g(hVar, "taskInfo");
        this.f191770c = hVar;
    }

    public String toString() {
        return "OnlineCdnSource mediaId:" + this.f191765a + " url:" + this.f191766b;
    }
}
