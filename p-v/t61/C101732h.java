package t61;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k60.C99101e;
import l60.C99342a;
import l60.C99344b;
import n60.C100075f;
import u61.C101963g;

/* renamed from: t61.h */
public final class C101732h extends C101727b<C101735i> {

    /* renamed from: A */
    public final C101738m f297809A;

    /* renamed from: B */
    public final ImageView f297810B = ((ImageView) this.f44854d.findViewById(C0966R.C0970id.o6_));

    /* renamed from: C */
    public final TextView f297811C = ((TextView) this.f44854d.findViewById(C0966R.C0970id.o6a));

    /* renamed from: t61.h$a */
    public static final class C101733a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101732h f297812d;

        public C101733a(C101732h hVar) {
            this.f297812d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemSimpleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101732h hVar = this.f297812d;
            C101735i iVar = (C101735i) hVar.f297802z;
            if (iVar != null) {
                hVar.f297809A.mo141167a(iVar, hVar.mo17363j());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemSimpleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: t61.h$b */
    public static final class C101734b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101732h f297813d;

        public C101734b(C101732h hVar) {
            this.f297813d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemSimpleViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101732h hVar = this.f297813d;
            C101735i iVar = (C101735i) hVar.f297802z;
            if (iVar != null) {
                hVar.f297809A.mo141168b(iVar, hVar.mo17363j());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemSimpleViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101732h(ViewGroup viewGroup, C101738m mVar) {
        super(viewGroup, C0966R.C0971layout.d7p);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(mVar, "clickListener");
        this.f297809A = mVar;
        this.f44854d.setOnClickListener(new C101733a(this));
        ((Button) this.f44854d.findViewById(C0966R.C0970id.o69)).setOnClickListener(new C101734b(this));
    }

    /* renamed from: y */
    public void mo141163y(C101728d dVar) {
        C87412m.m108594g(dVar, "item");
        this.f297802z = dVar;
        C101735i iVar = (C101735i) dVar;
        if (C101963g.m134217b(dVar.mo141165b())) {
            this.f297810B.setImageResource(C0966R.C0969drawable.icon_002_cover);
        } else {
            C99101e eVar = C99101e.f290570a;
            C99344b<String, Bitmap> e = C99101e.f290571b.mo85955a(iVar.mo141164a());
            C100075f.C100076a aVar = new C100075f.C100076a();
            aVar.f293176b = true;
            e.f291319c = aVar.mo139398a();
            ImageView imageView = this.f297810B;
            C87412m.m108593f(imageView, "icon");
            ((C99342a) e).mo85954d(imageView);
        }
        this.f297811C.setText(iVar.mo141166c());
    }
}
