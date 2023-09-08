package m61;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiCustomUI$$u;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import p171il.C98707c;
import p171il.C98734m;
import p171il.C98744t;
import p171il.C98748z;
import p260wk.C102457e;
import p813fl.C97904g;
import p813fl.C97906h;
import p813fl.C97927q0;
import p813fl.C97938w;

/* renamed from: m61.a */
public final class C99793a extends C98734m {

    /* renamed from: g */
    public EmojiCustomUI$$u f292471g = EmojiCustomUI$$u.NORMAL;

    /* renamed from: h */
    public final LinkedList<String> f292472h = new LinkedList<>();

    /* renamed from: m61.a$a */
    public static final class C99794a extends C98748z<C97938w> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99794a(View view, C98744t tVar) {
            super(view, tVar);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: m61.a$b */
    public static final class C99795b extends C98748z<C97927q0> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99795b(View view, C98744t tVar) {
            super(view, tVar);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: m61.a$c */
    public final class C99796c extends C98748z<C97904g> {

        /* renamed from: B */
        public ImageView f292473B;

        /* renamed from: C */
        public CheckBox f292474C;

        /* renamed from: D */
        public final /* synthetic */ C99793a f292475D;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99796c(C99793a aVar, View view, C98744t tVar) {
            super(view, tVar);
            C87412m.m108594g(view, "itemView");
            this.f292475D = aVar;
            View findViewById = view.findViewById(C0966R.C0970id.f39);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.f292473B = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.bal);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.checked)");
            this.f292474C = (CheckBox) findViewById2;
        }

        /* renamed from: y */
        public void mo136856y(C97927q0 q0Var) {
            C87412m.m108594g(q0Var, "item");
            this.f289539A = q0Var;
            if (this.f292475D.f292471g == EmojiCustomUI$$u.EDIT) {
                this.f292474C.setVisibility(0);
            } else {
                this.f292474C.setVisibility(8);
            }
            CheckBox checkBox = this.f292474C;
            LinkedList<String> linkedList = this.f292475D.f292472h;
            I i = this.f289539A;
            C87412m.m108591d(i);
            checkBox.setChecked(linkedList.contains(((C97904g) i).f287200b.getMd5()));
            C97904g gVar = (C97904g) this.f289539A;
            if (gVar == null) {
                return;
            }
            if (gVar.f287201c != 3) {
                C102457e eVar = C102457e.f301712a;
                IEmojiInfo iEmojiInfo = gVar.f287200b;
                C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
                eVar.mo142072d((EmojiInfo) iEmojiInfo, this.f292473B, (Drawable) null);
                return;
            }
            C102457e.f301712a.mo142070b(this.f292473B);
            this.f292473B.setImageResource(C0966R.C0969drawable.emoji_download_icon);
        }
    }

    public C99793a() {
        super((C97906h) null, 1, (C8480h) null);
    }

    /* renamed from: O4 */
    public C98748z<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 3) {
            View inflate = from.inflate(C0966R.C0971layout.a1g, viewGroup, false);
            C87412m.m108593f(inflate, "inflater.inflate(R.layou…ustom_add, parent, false)");
            return new C99794a(inflate, this.f289521f);
        } else if (i == 8) {
            View inflate2 = from.inflate(C0966R.C0971layout.a1y, viewGroup, false);
            C87412m.m108593f(inflate2, "inflater.inflate(com.ten…load_more, parent, false)");
            return new C98707c(inflate2, this.f289521f);
        } else if (i != 100) {
            View inflate3 = from.inflate(C0966R.C0971layout.a1h, viewGroup, false);
            C87412m.m108593f(inflate3, "inflater.inflate(R.layou…grid_item, parent, false)");
            return new C99796c(this, inflate3, this.f289521f);
        } else {
            View inflate4 = from.inflate(C0966R.C0971layout.a1j, viewGroup, false);
            C87412m.m108593f(inflate4, "inflater.inflate(R.layou…m_syncing, parent, false)");
            return new C99795b(inflate4, this.f289521f);
        }
    }
}
