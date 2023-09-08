package p233s3;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p233s3.C101526p;
import sx3.C64186f0;

/* renamed from: s3.i */
public class C101517i extends C101524n {

    /* renamed from: b */
    public final WeakReference<View> f297239b;

    /* renamed from: c */
    public final Choreographer f297240c;

    /* renamed from: d */
    public final C101526p.C101527a f297241d;

    /* renamed from: e */
    public final C101518a f297242e;

    /* renamed from: s3.i$a */
    public static final class C101518a extends C101525o {

        /* renamed from: a */
        public final /* synthetic */ C101514g f297243a;

        /* renamed from: b */
        public final /* synthetic */ C101517i f297244b;

        public C101518a(C101514g gVar, C101517i iVar) {
            this.f297243a = gVar;
            this.f297244b = iVar;
        }

        /* renamed from: a */
        public void mo141005a(long j, long j2, long j3) {
            C101514g gVar = this.f297243a;
            C101517i iVar = this.f297244b;
            long j4 = (long) (((float) j3) * gVar.f297236d);
            C101526p pVar = iVar.f297241d.f297258a;
            gVar.f297233a.execute(new C101516h(gVar, new C101511d(j, j2, j2 > j4, pVar != null ? pVar.mo141012c(j, j + j2) : C64186f0.f181907d)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101517i(C101514g gVar, View view) {
        super(gVar);
        C87412m.m108594g(gVar, "jankStats");
        C87412m.m108594g(view, "view");
        this.f297239b = new WeakReference<>(view);
        Choreographer instance = Choreographer.getInstance();
        C87412m.m108593f(instance, "getInstance()");
        this.f297240c = instance;
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        Object tag = view.getTag(C0966R.C0970id.mtt);
        if (tag == null) {
            tag = new C101526p.C101527a();
            view.setTag(C0966R.C0970id.mtt, tag);
        }
        this.f297241d = (C101526p.C101527a) tag;
        this.f297242e = new C101518a(gVar, this);
    }

    /* renamed from: a */
    public void mo141003a(boolean z) {
        View view = this.f297239b.get();
        if (view == null) {
            return;
        }
        if (z) {
            C101507b bVar = (C101507b) view.getTag(C0966R.C0970id.mts);
            if (bVar == null) {
                bVar = mo141004b(view, this.f297240c, new ArrayList());
                view.getViewTreeObserver().addOnPreDrawListener(bVar);
                view.setTag(C0966R.C0970id.mts, bVar);
            }
            bVar.f297221e.add(this.f297242e);
            return;
        }
        C101518a aVar = this.f297242e;
        view.setTag(C0966R.C0970id.mts, (Object) null);
        C101507b bVar2 = (C101507b) view.getTag(C0966R.C0970id.mts);
        List<C101525o> list = bVar2 != null ? bVar2.f297221e : null;
        if (list != null) {
            list.remove(aVar);
        }
        boolean z2 = false;
        if (list != null && list.size() == 0) {
            z2 = true;
        }
        if (z2) {
            view.getViewTreeObserver().removeOnPreDrawListener(bVar2);
            view.setTag(C0966R.C0970id.mts, (Object) null);
        }
    }

    /* renamed from: b */
    public C101507b mo141004b(View view, Choreographer choreographer, List<C101525o> list) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(choreographer, "choreographer");
        C87412m.m108594g(list, "delegates");
        return new C101507b(view, choreographer, list);
    }
}
