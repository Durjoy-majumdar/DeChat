package d42;

import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import e42.C7594e;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: d42.z */
public interface C86195z<T extends C7594e> {

    /* renamed from: d42.z$a */
    public static final class C86196a {
        /* renamed from: a */
        public static /* synthetic */ void m106752a(C86195z zVar, String str, C32226l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    lVar = null;
                }
                zVar.mo120605o(str, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: evaluate");
        }
    }

    int currentStatus();

    /* renamed from: d */
    void mo120601d(String str, String str2);

    void destroy();

    /* renamed from: h */
    String mo120603h();

    /* renamed from: m */
    void mo120604m(MBBuildConfig<T> mBBuildConfig);

    /* renamed from: o */
    void mo120605o(String str, C32226l<? super String, C13598b0> lVar);

    void pause();

    /* renamed from: r */
    void mo120607r(C86183k kVar);

    void resume();

    void setMute(boolean z);

    void start();
}
