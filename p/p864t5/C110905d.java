package p864t5;

import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.tencent.xweb.file.XVFSFile;
import d24.C20419r;
import gy3.C87412m;
import p1132m5.C109528s;
import p1144q5.C110366b;
import p1144q5.C110367c;
import p632o5.C109959i;
import p643p5.C110168e;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: t5.d */
public final class C110905d {

    /* renamed from: a */
    public static final C20419r f331711a = new C20419r(new C20419r.C20420a());

    /* renamed from: a */
    public static final String m151205a(MimeTypeMap mimeTypeMap, String str) {
        C87412m.m108594g(mimeTypeMap, "<this>");
        if (str == null || C112551y.m153811k(str)) {
            return null;
        }
        String h0 = C112550d0.m153798h0(C112550d0.m153798h0(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null);
        return mimeTypeMap.getMimeTypeFromExtension(C112550d0.m153793c0(C112550d0.m153793c0(h0, XVFSFile.SEPARATOR_CHAR, h0), '.', ""));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: m5.t} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p1132m5.C109529t m151206b(android.view.View r4) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r4, r0)
            r0 = 2131299779(0x7f090dc3, float:1.821757E38)
            java.lang.Object r1 = r4.getTag(r0)
            boolean r2 = r1 instanceof p1132m5.C109529t
            r3 = 0
            if (r2 == 0) goto L_0x0014
            m5.t r1 = (p1132m5.C109529t) r1
            goto L_0x0015
        L_0x0014:
            r1 = r3
        L_0x0015:
            if (r1 != 0) goto L_0x0037
            monitor-enter(r4)
            java.lang.Object r1 = r4.getTag(r0)     // Catch:{ all -> 0x0034 }
            boolean r2 = r1 instanceof p1132m5.C109529t     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0023
            r3 = r1
            m5.t r3 = (p1132m5.C109529t) r3     // Catch:{ all -> 0x0034 }
        L_0x0023:
            if (r3 != 0) goto L_0x0031
            m5.t r1 = new m5.t     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            r4.addOnAttachStateChangeListener(r1)     // Catch:{ all -> 0x0034 }
            r4.setTag(r0, r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0031:
            r1 = r3
        L_0x0032:
            monitor-exit(r4)
            goto L_0x0037
        L_0x0034:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p864t5.C110905d.m151206b(android.view.View):m5.t");
    }

    /* renamed from: c */
    public static final C110168e m151207c(ImageView imageView) {
        C87412m.m108594g(imageView, "<this>");
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : d$$b.f331713a[scaleType.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4) ? C110168e.FIT : C110168e.FILL;
    }

    /* renamed from: d */
    public static final void m151208d(C109528s sVar, C109959i.C109960a aVar) {
        C87412m.m108594g(sVar, "<this>");
        C110366b c = sVar.mo160741c();
        View view = null;
        C110367c cVar = c instanceof C110367c ? (C110367c) c : null;
        if (cVar != null) {
            view = cVar.getView();
        }
        if (view != null) {
            m151206b(view);
        }
    }
}
