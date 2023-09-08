package ai2;

import android.graphics.Matrix;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import te3.C49306en;
import te3.C64368fm;
import te3.wr4;

/* renamed from: ai2.c */
public final class C92010c extends C92007a {

    /* renamed from: g */
    public ArrayList<C64368fm> f263432g;

    /* renamed from: h */
    public int f263433h;

    /* renamed from: i */
    public int f263434i;

    /* renamed from: j */
    public String f263435j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92010c(C92011d dVar) {
        super(dVar);
        C87412m.m108594g(dVar, "type");
        this.f263432g = new ArrayList<>();
    }

    /* renamed from: i */
    public final C64368fm mo125902i(long j) {
        for (C64368fm fmVar : this.f263432g) {
            if (fmVar.f183149e <= j && fmVar.f183150f >= j) {
                return fmVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    public C49306en toProtoBuf() {
        C49306en enVar = new C49306en();
        enVar.f133016d.addAll(this.f263432g);
        enVar.f133017e = mo125864f(this.f263407f);
        enVar.f133019g = this.f263434i;
        enVar.f133018f = this.f263433h;
        enVar.f133020h = this.f263435j;
        return enVar;
    }

    public String toString() {
        Iterator<C64368fm> it = this.f263432g.iterator();
        while (it.hasNext()) {
            C64368fm next = it.next();
            long j = next.f183149e;
            next.f183148d.mo123704g("UTF-8");
        }
        return "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92010c(C92011d dVar, ArrayList<C64368fm> arrayList, Matrix matrix) {
        super(dVar);
        C87412m.m108594g(dVar, "type");
        C87412m.m108594g(arrayList, "list");
        C87412m.m108594g(matrix, "matrix");
        ArrayList<C64368fm> arrayList2 = new ArrayList<>();
        this.f263432g = arrayList2;
        arrayList2.clear();
        this.f263432g.addAll(arrayList);
        this.f263407f.set(matrix);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92010c(C92011d dVar, byte[] bArr) {
        super(dVar);
        C87412m.m108594g(dVar, "type");
        C87412m.m108594g(bArr, "byteArray");
        this.f263432g = new ArrayList<>();
        try {
            C49306en enVar = new C49306en();
            try {
                enVar.parseFrom(bArr);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
                enVar = null;
            }
            if (enVar != null) {
                this.f263432g.clear();
                this.f263432g.addAll(enVar.f133016d);
                Matrix matrix = this.f263407f;
                wr4 wr4 = enVar.f133017e;
                C87412m.m108593f(wr4, "captionData.matrix");
                matrix.setValues(mo125865g(wr4));
                this.f263434i = enVar.f133019g;
                this.f263433h = enVar.f133018f;
                this.f263435j = enVar.f133020h;
                toString();
                Log.m105924i("MicroMsg.CaptionItem", "");
            }
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.CaptionItem", e2, "LocationItem parse error", new Object[0]);
        }
    }
}
