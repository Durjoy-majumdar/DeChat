package p61;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import p61.C100684y;

/* renamed from: p61.j */
public class C100657j<I extends C100684y> extends RecyclerView.C16631z {

    /* renamed from: A */
    public I f294874A;

    /* renamed from: z */
    public C100685z f294875z;

    /* renamed from: p61.j$a */
    public static final class C100658a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100657j<I> f294876d;

        public C100658a(C100657j<I> jVar) {
            this.f294876d = jVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3BaseHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100657j<I> jVar = this.f294876d;
            C100685z zVar = jVar.f294875z;
            if (zVar != null) {
                zVar.mo127715b(jVar, jVar.mo17363j(), this.f294876d.f294874A);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3BaseHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100657j(View view, C100685z zVar) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f294875z = zVar;
        view.setOnClickListener(new C100658a(this));
    }

    /* renamed from: y */
    public void mo140091y(C100684y yVar, List<Object> list) {
        C87412m.m108594g(yVar, "item");
        C87412m.m108594g(list, "payloads");
        this.f294874A = yVar;
    }
}
