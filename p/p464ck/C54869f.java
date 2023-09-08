package p464ck;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import p001ak.C54053a;
import p001ak.C54057e;
import p006bk.C54479b;
import p850ek.C58610a;
import sx3.C64175a0;

/* renamed from: ck.f */
public abstract class C54869f extends C54866a<C54057e> {

    /* renamed from: ck.f$a */
    public static class C54870a {

        /* renamed from: a */
        public final View f153799a;

        /* renamed from: b */
        public RectF f153800b = new RectF();

        /* renamed from: c */
        public Paint f153801c = new Paint();

        public C54870a(View view) {
            if (view != null) {
                this.f153799a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: a */
        public int mo75814a() {
            return this.f153799a.getMeasuredHeight();
        }

        /* renamed from: b */
        public int mo75815b() {
            return this.f153799a.getMeasuredWidth();
        }

        /* renamed from: c */
        public final View mo75816c(View view, float f, float f2) {
            RectF rectF = new RectF();
            Iterator<View> it = view.getTouchables().iterator();
            boolean z = false;
            View view2 = null;
            while (it.hasNext()) {
                View next = it.next();
                float x = next.getX();
                float y = next.getY();
                rectF.set(x, y, ((float) next.getMeasuredWidth()) + x, ((float) next.getMeasuredWidth()) + y);
                if (rectF.contains(f, f2)) {
                    if (next.equals(view)) {
                        z = true;
                    } else if (!(next instanceof ViewGroup)) {
                        return next;
                    } else {
                        view2 = mo75816c(view, f - x, f2 - f);
                    }
                }
            }
            return (!z || view2 != null) ? view2 : view;
        }

        /* renamed from: d */
        public void mo14335d(int i, int i2) {
            this.f153799a.measure(i, i2);
        }
    }

    public C54869f() {
        new SparseArray();
    }

    /* renamed from: a */
    public boolean mo75810a(C54053a aVar) {
        return aVar instanceof C54057e;
    }

    /* renamed from: b */
    public C58610a mo75811b(C54053a aVar) {
        C54870a aVar2;
        C54057e eVar = (C54057e) aVar;
        int e = mo14332e(eVar.f151367x);
        C28602d dVar = C28602d.f78490a;
        ArrayList arrayList = dVar.mo56079a().get(e);
        if (arrayList == null) {
            arrayList = new ArrayList();
            dVar.mo56079a().put(e, arrayList);
        }
        if (arrayList.isEmpty()) {
            aVar2 = mo14334g(e);
            C87412m.m108593f(aVar2, "{\n            render.onC…older(itemType)\n        }");
        } else {
            aVar2 = (C54870a) C64175a0.m75513u(arrayList);
        }
        mo14333f(e, aVar2, eVar);
        aVar2.mo14335d(View.MeasureSpec.makeMeasureSpec(eVar.mo74716g(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(C54479b.m61196c().f152764k, Integer.MIN_VALUE));
        aVar2.f153799a.layout(0, 0, aVar2.mo75815b(), aVar2.mo75814a());
        eVar.f151373E = aVar2;
        eVar.f151363t = (float) aVar2.mo75815b();
        eVar.f151364u = (float) aVar2.mo75814a();
        Log.m105925i("ViewDanmakuRender", "measure: width = %d, height = %d", Integer.valueOf(aVar2.mo75815b()), Integer.valueOf(aVar2.mo75814a()));
        return new C58610a((float) aVar2.mo75815b(), (float) aVar2.mo75814a());
    }

    /* renamed from: c */
    public void mo75812c(Canvas canvas, C54053a aVar, C54479b bVar, float f, float f2) {
        C54057e eVar = (C54057e) aVar;
        C54870a aVar2 = eVar.f151373E;
        if (aVar2 != null) {
            if (!eVar.f151374F) {
                aVar2.mo14335d(View.MeasureSpec.makeMeasureSpec(aVar2.mo75815b(), 1073741824), View.MeasureSpec.makeMeasureSpec(aVar2.mo75814a(), 1073741824));
                aVar2.f153799a.layout(0, 0, aVar2.mo75815b(), aVar2.mo75814a());
                eVar.f151374F = true;
            }
            canvas.save();
            canvas.translate(f, f2);
            aVar2.f153800b.set(0.0f, 0.0f, (float) aVar2.f153799a.getMeasuredWidth(), (float) aVar2.f153799a.getMeasuredHeight());
            aVar2.f153801c.setAlpha((int) (aVar2.f153799a.getAlpha() * 255.0f));
            int saveLayer = canvas.saveLayer(aVar2.f153800b, aVar2.f153801c, 31);
            aVar2.f153799a.draw(canvas);
            canvas.restoreToCount(saveLayer);
            canvas.restore();
        }
    }

    /* renamed from: d */
    public void mo75813d(C54053a aVar) {
        C54057e eVar = (C54057e) aVar;
        C54870a aVar2 = eVar.f151373E;
        if (aVar2 != null) {
            int e = mo14332e(eVar.f151367x);
            C28602d dVar = C28602d.f78490a;
            ArrayList arrayList = dVar.mo56079a().get(e);
            if (arrayList == null) {
                arrayList = new ArrayList();
                dVar.mo56079a().put(e, arrayList);
            }
            arrayList.add(aVar2);
            Log.m105924i("DanmakuHolderPool", "recycleDanamku: size = " + arrayList.size());
            eVar.f151373E = null;
        }
    }

    /* renamed from: e */
    public abstract int mo14332e(Object obj);

    /* renamed from: f */
    public abstract void mo14333f(int i, C54870a aVar, C54057e eVar);

    /* renamed from: g */
    public abstract C54870a mo14334g(int i);
}
