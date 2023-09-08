package w51;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C93108e0;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import gc0.C20828a;
import i61.C98601f;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C101824o80;
import x51.C102554b;
import x51.C102561f;
import x51.C102562g;

/* renamed from: w51.d */
public class C102332d extends C102554b {

    /* renamed from: w51.d$a */
    public class C102333a extends C102330b {
        public C102333a(C102332d dVar, Context context, View view) {
            super(context, view);
        }

        /* renamed from: b */
        public void mo141883b() {
            this.f301388h.setVisibility(8);
            this.f301395o.setVisibility(8);
            this.f301393m.setVisibility(0);
            this.f301397q.setVisibility(8);
            this.f301401u.setVisibility(8);
            View view = this.f301402v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/EmojiPaidAdapter$EmojiPaidHolder", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/adapter/EmojiPaidAdapter$EmojiPaidHolder", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f301387g.setVisibility(0);
            this.f301389i.setVisibility(0);
            View view3 = this.f301399s;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/EmojiPaidAdapter$EmojiPaidHolder", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/adapter/EmojiPaidAdapter$EmojiPaidHolder", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f301398r.setVisibility(0);
            this.f301398r.setBackgroundDrawable((Drawable) null);
            this.f301400t.setVisibility(0);
            this.f301392l.setVisibility(0);
        }

        /* renamed from: c */
        public int[] mo141884c() {
            int h = C76577a.m92157h(this.f301379C, C0966R.dimen.a4_);
            return new int[]{h, h};
        }

        /* renamed from: d */
        public int mo141885d() {
            return C76577a.m92157h(this.f301379C, C0966R.dimen.a4a);
        }

        /* renamed from: h */
        public boolean mo141889h() {
            return true;
        }
    }

    public C102332d(Context context) {
        super(context);
    }

    /* renamed from: b */
    public int mo141896b() {
        return 0;
    }

    /* renamed from: f */
    public int mo141897f() {
        return 0;
    }

    /* renamed from: h */
    public View mo141898h(int i, View view, ViewGroup viewGroup) {
        C102333a aVar = (C102333a) view.getTag();
        C102562g g = getItem(i);
        if (!(aVar == null || g == null)) {
            g.f301989h = false;
            g.f301990i = false;
            C101824o80 o802 = g.f301983b;
            if (o802 != null) {
                aVar.f301389i.setText(o802.f298996f);
                int i2 = o802.f299000j;
                if (aVar.f301392l != null && !C102561f.m135424d(i2)) {
                    aVar.f301392l.setText(aVar.f301379C.getString(C0966R.string.j8q));
                }
                C20828a b = C20828a.m22825b();
                String str = o802.f298995e;
                b.mo32519h(str, aVar.f301387g, C98601f.m128139d(o802.f298994d, str));
                aVar.f301393m.setText(C72715f.m85114g("yyyy-MM-dd", ((long) o802.f299005r) * 1000));
            }
        }
        return view;
    }

    /* renamed from: i */
    public int mo141899i() {
        return 0;
    }

    /* renamed from: j */
    public C102330b mo141900j(Context context, View view) {
        C102333a aVar = new C102333a(this, context, view);
        C93108e0.C93110b bVar = this.f301967f;
        View view2 = aVar.f301399s;
        if (view2 != null) {
            view2.setOnClickListener(new C102329a(aVar, bVar));
        }
        return aVar;
    }

    /* renamed from: n */
    public void mo141901n(int i) {
    }

    /* renamed from: o */
    public void mo141902o(int i) {
    }

    /* renamed from: p */
    public void mo141903p(int i) {
    }
}
