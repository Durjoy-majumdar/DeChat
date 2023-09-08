package uh0;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.widget.album.AlbumContainerViewBase;
import gj3.C59476i;
import gy3.C87412m;
import ho3.C76238a;
import p434ig.C98672d;
import p434ig.C98674g;
import sx3.C110818d0;
import sx3.C64197v;
import th0.C101880a;

/* renamed from: uh0.a */
public class C102037a implements C76238a {

    /* renamed from: a */
    public final long f300486a;

    /* renamed from: b */
    public final String f300487b;

    /* renamed from: c */
    public final C98674g f300488c;

    /* renamed from: d */
    public final boolean f300489d;

    public C102037a(long j, String str, C98674g gVar, boolean z, boolean z2) {
        C87412m.m108594g(str, "talker");
        C87412m.m108594g(gVar, "albumInfoItem");
        this.f300486a = j;
        this.f300487b = str;
        this.f300488c = gVar;
        this.f300489d = z2;
    }

    /* renamed from: a */
    public boolean mo106487a(AlbumContainerViewBase albumContainerViewBase) {
        C87412m.m108594g(albumContainerViewBase, "albumContainer");
        if (!this.f300489d) {
            int i = 0;
            for (T next : albumContainerViewBase.getFilterItemViews()) {
                int i2 = i + 1;
                if (i >= 0) {
                    String a = C74928u.C57854a.m66842a(i, this.f300486a);
                    C87412m.m108593f(a, "getShareElementName(index, msgId)");
                    C59476i.m69400b((View) next, a, (Object) null, 2, (Object) null);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        int i3 = 0;
        for (T next2 : this.f300488c.mo55348A()) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C98672d dVar = (C98672d) next2;
                Object O = C110818d0.m150917O(albumContainerViewBase.getFilterItemViews(), i3);
                ImageView imageView = O instanceof ImageView ? (ImageView) O : null;
                if (imageView != null) {
                    C101880a.f299976a.mo141349f(1, dVar, this.f300487b, this.f300486a, imageView, i3, false, true);
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return true;
    }
}
