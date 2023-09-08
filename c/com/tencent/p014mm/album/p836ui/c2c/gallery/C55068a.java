package com.tencent.p014mm.album.p836ui.c2c.gallery;

import androidx.recyclerview.widget.GridLayoutManager;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gj3.C59469a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import p181kg.C61089d;
import p181kg.C61091f;
import p181kg.C61093i;
import p434ig.C98671a;
import p434ig.C98672d;
import p434ig.C98674g;
import p434ig.C98676j;

/* renamed from: com.tencent.mm.album.ui.c2c.gallery.a */
public class C55068a extends WxRecyclerAdapter<C61089d> {

    /* renamed from: N */
    public static final C55069a f154624N = new C55069a((C8480h) null);

    /* renamed from: G */
    public final C72963f4 f154625G;

    /* renamed from: H */
    public final C98674g f154626H;

    /* renamed from: I */
    public final C59469a f154627I;

    /* renamed from: J */
    public int f154628J;

    /* renamed from: K */
    public int f154629K;

    /* renamed from: L */
    public int f154630L;

    /* renamed from: M */
    public GridLayoutManager f154631M;

    /* renamed from: com.tencent.mm.album.ui.c2c.gallery.a$a */
    public static final class C55069a {
        public C55069a(C8480h hVar) {
        }

        /* renamed from: a */
        public final ArrayList<C61089d> mo76189a(C72963f4 f4Var, C98674g gVar, int i) {
            C87412m.m108594g(gVar, "albumInfoItem");
            ArrayList<C61089d> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C61093i());
            }
            for (C98672d dVar : gVar.mo55348A()) {
                arrayList.add(new C61089d(f4Var, gVar, dVar, false, false));
            }
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(new C61091f());
            }
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r5.mo55348A();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo76190b(p434ig.C98674g r5) {
            /*
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L_0x000e
                java.util.List r1 = r5.mo55348A()
                if (r1 == 0) goto L_0x000e
                int r1 = r1.size()
                goto L_0x000f
            L_0x000e:
                r1 = 0
            L_0x000f:
                r2 = 5
                r3 = 2
                if (r1 >= r2) goto L_0x0023
                if (r5 == 0) goto L_0x001f
                java.util.List r5 = r5.mo55348A()
                if (r5 == 0) goto L_0x001f
                int r0 = r5.size()
            L_0x001f:
                if (r0 >= r3) goto L_0x0024
                r3 = 1
                goto L_0x0024
            L_0x0023:
                r3 = 3
            L_0x0024:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a.C55069a.mo76190b(ig.g):int");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C55068a(com.tencent.p014mm.storage.C72963f4 r4, p434ig.C98674g r5, gj3.C59469a r6) {
        /*
            r3 = this;
            java.lang.String r0 = "albumInfoItem"
            gy3.C87412m.m108594g(r5, r0)
            com.tencent.mm.album.ui.c2c.gallery.a$a r0 = f154624N
            r0.mo76190b(r5)
            com.tencent.mm.album.ui.c2c.gallery.AlbumGalleryAdapter$Companion$buildItemConverts$1 r1 = new com.tencent.mm.album.ui.c2c.gallery.AlbumGalleryAdapter$Companion$buildItemConverts$1
            r1.<init>()
            int r2 = r0.mo76190b(r5)
            java.util.ArrayList r0 = r0.mo76189a(r4, r5, r2)
            r2 = 1
            r3.<init>(r1, r0, r2)
            r3.f154625G = r4
            r3.f154626H = r5
            r3.f154627I = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a.<init>(com.tencent.mm.storage.f4, ig.g, gj3.a):void");
    }

    /* renamed from: B6 */
    public static final C98674g m62186B6(C72963f4 f4Var) {
        String U;
        C98674g gVar = new C98674g();
        C98676j jVar = new C98676j();
        String content = f4Var != null ? f4Var.getContent() : null;
        String str = "";
        if (content == null) {
            content = str;
        }
        jVar.mo141099d(content);
        C98671a aVar = jVar.f289368f;
        if (!(aVar == null || (U = aVar.mo55242U()) == null)) {
            str = U;
        }
        gVar.mo141099d(str);
        return gVar;
    }

    /* renamed from: C6 */
    public final boolean mo76188C6() {
        Object obj;
        Iterator it = getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C61089d) obj).f173954g) {
                break;
            }
        }
        return obj != null;
    }
}
