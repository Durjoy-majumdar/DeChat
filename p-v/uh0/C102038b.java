package uh0;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.widget.album.AlbumContainerViewBase;
import com.tencent.p014mm.storage.C72963f4;
import gj3.C59476i;
import gy3.C87412m;
import p434ig.C98672d;
import sx3.C110818d0;
import sx3.C64197v;
import th0.C101880a;

/* renamed from: uh0.b */
public final class C102038b extends C102037a {

    /* renamed from: e */
    public final C72963f4 f300490e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C102038b(com.tencent.p014mm.storage.C72963f4 r8, p434ig.C98674g r9, boolean r10, boolean r11, int r12, gy3.C8480h r13) {
        /*
            r7 = this;
            r12 = r12 & 8
            if (r12 == 0) goto L_0x0007
            r11 = 0
            r6 = 0
            goto L_0x0008
        L_0x0007:
            r6 = r11
        L_0x0008:
            java.lang.String r11 = "albumInfoItem"
            gy3.C87412m.m108594g(r9, r11)
            if (r8 == 0) goto L_0x0014
            long r11 = r8.getMsgId()
            goto L_0x0016
        L_0x0014:
            r11 = 0
        L_0x0016:
            r1 = r11
            if (r8 == 0) goto L_0x001e
            java.lang.String r11 = r8.mo108768t()
            goto L_0x001f
        L_0x001e:
            r11 = 0
        L_0x001f:
            if (r11 != 0) goto L_0x0023
            java.lang.String r11 = ""
        L_0x0023:
            r3 = r11
            r0 = r7
            r4 = r9
            r5 = r10
            r0.<init>(r1, r3, r4, r5, r6)
            r7.f300490e = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uh0.C102038b.<init>(com.tencent.mm.storage.f4, ig.g, boolean, boolean, int, gy3.h):void");
    }

    /* renamed from: a */
    public boolean mo106487a(AlbumContainerViewBase albumContainerViewBase) {
        C87412m.m108594g(albumContainerViewBase, "albumContainer");
        if (!this.f300489d) {
            int i = 0;
            for (T next : albumContainerViewBase.getFilterItemViews()) {
                int i2 = i + 1;
                if (i >= 0) {
                    View view = (View) next;
                    C72963f4 f4Var = this.f300490e;
                    String a = C74928u.C57854a.m66842a(i, f4Var != null ? f4Var.getMsgId() : 0);
                    C87412m.m108593f(a, "getShareElementName(index, msgInfo?.msgId ?: 0L)");
                    C59476i.m69400b(view, a, (Object) null, 2, (Object) null);
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
                    C101880a.f299976a.mo141348e(1, dVar, this.f300490e, imageView, i3, false, true);
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
