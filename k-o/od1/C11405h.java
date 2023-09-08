package od1;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: od1.h */
public interface C11405h {

    /* renamed from: od1.h$a */
    public static final class C11406a {
        /* renamed from: a */
        public static boolean m11253a(C11405h hVar) {
            return !Util.isNullOrNil(hVar.getCoverImgUrl());
        }

        /* renamed from: b */
        public static void m11254b(C11405h hVar) {
            if (hVar.mo11416i0()) {
                hVar.mo513c2();
            } else {
                hVar.setNormalStyle();
            }
        }
    }

    /* renamed from: c2 */
    void mo513c2();

    String getCoverImgUrl();

    /* renamed from: i0 */
    boolean mo11416i0();

    void setNormalStyle();
}
