package n61;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import n61.C100084d;
import te3.C101800k70;

/* renamed from: n61.e */
public final class C100087e extends RecyclerView.C16631z {

    /* renamed from: A */
    public C100084d.C100085a f293207A;

    /* renamed from: B */
    public final ImageView f293208B;

    /* renamed from: C */
    public C101800k70 f293209C;

    /* renamed from: z */
    public final View f293210z;

    /* renamed from: n61.e$a */
    public static final class C100088a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100087e f293211d;

        public C100088a(C100087e eVar) {
            this.f293211d = eVar;
        }

        public final void onClick(View view) {
            C100084d.C100085a aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreDesignerSingleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100087e eVar = this.f293211d;
            C101800k70 k702 = eVar.f293209C;
            if (!(k702 == null || (aVar = eVar.f293207A) == null)) {
                C87412m.m108591d(k702);
                aVar.mo94740a(k702, this.f293211d.mo17364k());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreDesignerSingleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100087e(View view, C100084d.C100085a aVar) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f293210z = view;
        this.f293207A = aVar;
        this.f293208B = (ImageView) view.findViewById(C0966R.C0970id.cxe);
        view.setOnClickListener(new C100088a(this));
    }
}
