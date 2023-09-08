package p813fl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k60.C99099a;
import k60.C99101e;
import kg3.C76577a;
import l60.C99342a;
import l60.C99344b;
import n60.C100075f;
import p171il.C98744t;
import p171il.C98748z;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: fl.v */
public final class C97935v extends C98748z<C97933u> {

    /* renamed from: B */
    public final C97906h f287266B;

    /* renamed from: C */
    public final Guideline f287267C;

    /* renamed from: D */
    public final List<ImageView> f287268D;

    /* renamed from: E */
    public final ImageView f287269E;

    /* renamed from: F */
    public final View f287270F;

    /* renamed from: fl.v$a */
    public static final class C97936a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C97935v f287271d;

        public C97936a(C97935v vVar) {
            this.f287271d = vVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/model/panel/EmojiPanelSetIntroViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C98744t tVar = this.f287271d.f289540z;
            if (tVar != null) {
                Context context = view.getContext();
                C87412m.m108593f(context, "it.context");
                tVar.mo127711c(view, context, this.f287271d.mo17363j(), (C97933u) this.f287271d.f289539A);
            }
            C117292a.m165361g(this, "com/tencent/mm/emoji/model/panel/EmojiPanelSetIntroViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97935v(android.view.ViewGroup r4, p171il.C98744t r5, p813fl.C97906h r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            gy3.C87412m.m108594g(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131494154(0x7f0c050a, float:1.8611808E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "from(parent.context)\n   …set_intro, parent, false)"
            gy3.C87412m.m108593f(r4, r0)
            r3.<init>(r4, r5)
            r3.f287266B = r6
            r5 = 2131301519(0x7f09148f, float:1.8221098E38)
            android.view.View r5 = r4.findViewById(r5)
            androidx.constraintlayout.widget.Guideline r5 = (androidx.constraintlayout.widget.Guideline) r5
            r3.f287267C = r5
            r5 = 2131301514(0x7f09148a, float:1.8221088E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 2131301515(0x7f09148b, float:1.822109E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 2131301516(0x7f09148c, float:1.8221092E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1 = 3
            android.widget.ImageView[] r1 = new android.widget.ImageView[r1]
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            r5 = 2
            r1[r5] = r0
            java.util.List r5 = sx3.C64197v.m75537f(r1)
            r3.f287268D = r5
            r5 = 2131301517(0x7f09148d, float:1.8221094E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r3.f287269E = r5
            r5 = 2131301512(0x7f091488, float:1.8221084E38)
            android.view.View r5 = r4.findViewById(r5)
            r3.f287270F = r5
            r6 = 0
            r4.setOnClickListener(r6)
            fl.v$a r4 = new fl.v$a
            r4.<init>(r3)
            r5.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p813fl.C97935v.<init>(android.view.ViewGroup, il.t, fl.h):void");
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
        ViewGroup.LayoutParams layoutParams = this.f287267C.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = this.f287270F.getLayoutParams();
        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        C97906h hVar = this.f287266B;
        if (hVar != null && hVar.f287217n) {
            layoutParams2.f44435a = C76577a.m92151b(this.f287267C.getContext(), 120);
            layoutParams4.f44455k = 0;
            layoutParams4.f44451i = -1;
        } else {
            layoutParams2.f44435a = C76577a.m92151b(this.f287267C.getContext(), 48);
            layoutParams4.f44455k = -1;
            layoutParams4.f44451i = C0966R.C0970id.o6i;
        }
        this.f287267C.setLayoutParams(layoutParams2);
        C97933u uVar = (C97933u) this.f289539A;
        if (uVar != null) {
            C100075f.C100076a aVar = new C100075f.C100076a();
            aVar.f293176b = true;
            C100075f a = aVar.mo139398a();
            C99101e eVar = C99101e.f290570a;
            C99344b<String, Bitmap> e = C99101e.f290571b.mo85955a(uVar.f287263b.f287262c.mo137250d());
            e.f291319c = a;
            ImageView imageView = this.f287269E;
            C87412m.m108593f(imageView, "setIcon");
            ((C99342a) e).mo85954d(imageView);
            int i = 0;
            for (T next : this.f287268D) {
                int i2 = i + 1;
                if (i >= 0) {
                    ImageView imageView2 = (ImageView) next;
                    EmojiGroupInfo emojiGroupInfo = (EmojiGroupInfo) C110818d0.m150917O(uVar.f287263b.f287262c.f287258c, i);
                    if (emojiGroupInfo != null) {
                        imageView2.setVisibility(0);
                        C99101e eVar2 = C99101e.f290570a;
                        C99099a aVar2 = C99101e.f290571b;
                        String str = emojiGroupInfo.field_packGrayIconUrl;
                        C87412m.m108593f(str, "group.grayPackIconUrl");
                        C99344b<String, Bitmap> e2 = aVar2.mo85955a(str);
                        e2.f291319c = a;
                        ((C99342a) e2).mo85954d(imageView2);
                    } else {
                        imageView2.setVisibility(8);
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }
}
