package ez3;

import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;

/* renamed from: ez3.c */
public interface C24474c {

    /* renamed from: ez3.c$a */
    public static final class C24475a implements C24474c {

        /* renamed from: a */
        public static final C24475a f69990a = new C24475a();

        /* renamed from: a */
        public void mo51178a(String str, C7956e eVar, String str2, C31747f fVar, String str3) {
            C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            C87412m.m108594g(eVar, "position");
            C87412m.m108594g(str2, "scopeFqName");
            C87412m.m108594g(fVar, "scopeKind");
            C87412m.m108594g(str3, "name");
        }

        /* renamed from: b */
        public boolean mo51179b() {
            return false;
        }
    }

    /* renamed from: a */
    void mo51178a(String str, C7956e eVar, String str2, C31747f fVar, String str3);

    /* renamed from: b */
    boolean mo51179b();
}
