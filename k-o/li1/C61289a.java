package li1;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.ratio.RatioLayout;
import d60.C58124b;
import gi1.C59463a;
import gy3.C87412m;
import iq3.C60600b;
import java.util.HashMap;
import java.util.LinkedList;
import ni1.C61753b;
import qj1.C62660c;

/* renamed from: li1.a */
public abstract class C61289a extends C60600b<C59463a> {

    /* renamed from: b */
    public final Context f174397b;

    /* renamed from: c */
    public final C62660c f174398c;

    /* renamed from: d */
    public final C61753b f174399d;

    /* renamed from: e */
    public final HashMap<String, View> f174400e = new HashMap<>();

    /* renamed from: f */
    public LinkedList<C59463a> f174401f = new LinkedList<>();

    /* renamed from: g */
    public Rect f174402g = new Rect();

    /* renamed from: h */
    public boolean f174403h;

    /* renamed from: i */
    public boolean f174404i;

    /* renamed from: li1.a$a */
    public /* synthetic */ class C61290a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f174405a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[169] = 1;
            f174405a = iArr;
        }
    }

    public C61289a(Context context, C62660c cVar, C61753b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
        this.f174397b = context;
        this.f174398c = cVar;
        this.f174399d = bVar;
    }

    /* renamed from: a */
    public int mo85553a() {
        return this.f174401f.size();
    }

    /* renamed from: c */
    public View mo85555c(int i, Object obj) {
        C59463a aVar = (C59463a) obj;
        C87412m.m108594g(aVar, "data");
        int l = mo86272l(aVar);
        String j = mo86270j(aVar);
        String m = mo86273m();
        Log.m105924i(m, "getItemView pos: " + i + " key: " + j + " viewCache: " + this.f174400e);
        View view = this.f174400e.get(j);
        if (view == null) {
            view = mo86269i(aVar, l);
        }
        C87412m.m108593f(view, "viewCache[key] ?: createItemView(data, micType)");
        this.f174400e.put(j, view);
        return view;
    }

    /* renamed from: e */
    public RatioLayout.C57914a mo85557e(int i) {
        return this.f174401f.get(i).f169895b;
    }

    /* renamed from: i */
    public abstract View mo86269i(C59463a aVar, int i);

    /* renamed from: j */
    public final String mo86270j(C59463a aVar) {
        String a = aVar.mo84561a();
        int l = mo86272l(aVar);
        return a + '_' + l + '_' + aVar.f169895b.f169901e;
    }

    /* renamed from: k */
    public C59463a mo85554b(int i) {
        C59463a aVar = this.f174401f.get(i);
        C87412m.m108593f(aVar, "audienceLinkMicUserList[pos]");
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo86272l(gi1.C59463a r5) {
        /*
            r4 = this;
            al1.j r0 = r5.f169894a
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = r0.f151997a
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            qj1.c r1 = r4.f174398c
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r2)
            cl1.u r1 = (cl1.C55001u) r1
            te3.bq2 r1 = r1.f154419p
            java.lang.String r1 = r1.f182319n
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x001f
            r1 = 3
            goto L_0x005d
        L_0x001f:
            al1.j r0 = r5.f169894a
            if (r0 == 0) goto L_0x0054
            gi1.f r2 = r5.f169895b
            boolean r2 = r2.f169904h
            if (r2 != 0) goto L_0x0054
            qj1.c r0 = r4.f174398c
            java.lang.Class<cl1.c0> r2 = cl1.C54949c0.class
            androidx.lifecycle.i0 r0 = r0.mo87696x0(r2)
            cl1.c0 r0 = (cl1.C54949c0) r0
            boolean r0 = r0.mo75864e3()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0047
            gi1.f r5 = r5.f169895b
            int r5 = r5.f169905i
            boolean r5 = o40.C61926c.m72696u(r5, r2)
            if (r5 == 0) goto L_0x0053
        L_0x0045:
            r2 = 1
            goto L_0x0053
        L_0x0047:
            al1.j r5 = r5.f169894a
            if (r5 == 0) goto L_0x0050
            int r5 = r5.f152001e
            if (r5 != r3) goto L_0x0050
            r1 = 1
        L_0x0050:
            if (r1 == 0) goto L_0x0053
            goto L_0x0045
        L_0x0053:
            return r2
        L_0x0054:
            if (r0 != 0) goto L_0x005d
            gi1.f r5 = r5.f169895b
            boolean r5 = r5.f169904h
            if (r5 == 0) goto L_0x005d
            r1 = 4
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: li1.C61289a.mo86272l(gi1.a):int");
    }

    /* renamed from: m */
    public abstract String mo86273m();
}
