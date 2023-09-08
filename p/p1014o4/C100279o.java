package p1014o4;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import p1014o4.C100281w;

/* renamed from: o4.o */
public final class C100279o extends C100281w {

    /* renamed from: o4.o$a */
    public static final class C100280a extends C100281w.C100282a<C100280a, C100279o> {
        public C100280a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f293790b.f355544d = OverwritingInputMerger.class.getName();
        }
    }

    public C100279o(C100280a aVar) {
        super(aVar.f293789a, aVar.f293790b, aVar.f293791c);
    }
}
