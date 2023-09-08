package tg2;

import android.widget.ImageView;
import com.tencent.p014mm.p136ui.widget.album.AlbumContainerViewBase;
import gy3.C87412m;
import ho3.C76238a;
import p434ig.C98672d;
import p434ig.C98680m;
import sx3.C110818d0;
import sx3.C64197v;
import th0.C101880a;

/* renamed from: tg2.a */
public final class C101878a implements C76238a {

    /* renamed from: a */
    public final C98680m f299970a;

    /* renamed from: b */
    public final String f299971b;

    /* renamed from: c */
    public final long f299972c;

    public C101878a(C98680m mVar, String str, long j) {
        C87412m.m108594g(mVar, "albumRecordInfo");
        C87412m.m108594g(str, "talker");
        this.f299970a = mVar;
        this.f299971b = str;
        this.f299972c = j;
    }

    /* renamed from: a */
    public boolean mo106487a(AlbumContainerViewBase albumContainerViewBase) {
        C87412m.m108594g(albumContainerViewBase, "albumContainer");
        int i = 0;
        for (T next : this.f299970a.mo138092A()) {
            int i2 = i + 1;
            if (i >= 0) {
                C98672d dVar = (C98672d) next;
                if (i >= 9) {
                    return true;
                }
                Object O = C110818d0.m150917O(albumContainerViewBase.getFilterItemViews(), i);
                ImageView imageView = O instanceof ImageView ? (ImageView) O : null;
                if (imageView != null) {
                    C101880a.f299976a.mo141349f(6, dVar, this.f299971b, this.f299972c, imageView, i, true, true);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return true;
    }
}
