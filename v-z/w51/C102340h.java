package w51;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2BaseFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96984r2;
import gc0.C20828a;
import i61.C98601f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C101824o80;
import x51.C102554b;
import x51.C102556d;
import x51.C102562g;

/* renamed from: w51.h */
public class C102340h extends C102554b {

    /* renamed from: n */
    public Context f301427n;

    /* renamed from: o */
    public int f301428o = 3;

    /* renamed from: p */
    public int f301429p = 0;

    /* renamed from: q */
    public int f301430q;

    /* renamed from: r */
    public int f301431r;

    /* renamed from: s */
    public int f301432s;

    /* renamed from: t */
    public boolean f301433t;

    /* renamed from: u */
    public C102342b f301434u;

    /* renamed from: v */
    public HashMap<String, C102331c> f301435v;

    /* renamed from: w51.h$a */
    public class C102341a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C102331c f301436d;

        /* renamed from: e */
        public final /* synthetic */ int f301437e;

        public C102341a(C102331c cVar, int i) {
            this.f301436d = cVar;
            this.f301437e = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102342b bVar = C102340h.this.f301434u;
            if (bVar != null) {
                View view2 = this.f301436d.f301409c;
                int i = this.f301437e;
                EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = (EmojiStoreV2BaseFragment) bVar;
                if (i < 0) {
                    emojiStoreV2BaseFragment.getClass();
                } else if (i < ((C102340h) emojiStoreV2BaseFragment.f268806u).mo141912s()) {
                    emojiStoreV2BaseFragment.mo127819N(emojiStoreV2BaseFragment.f268806u.getItem(i), i);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: w51.h$b */
    public interface C102342b {
    }

    /* renamed from: w51.h$c */
    public class C102343c {

        /* renamed from: a */
        public LinearLayout f301439a;

        public C102343c(C102340h hVar) {
        }
    }

    public C102340h(Context context, boolean z) {
        super(context);
        this.f301427n = context;
        this.f301433t = z;
        context.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
        this.f301430q = this.f301427n.getResources().getDimensionPixelSize(C0966R.dimen.f3627k);
        this.f301431r = this.f301427n.getResources().getDimensionPixelSize(C0966R.dimen.a3r);
        int A = C76577a.m92145A(this.f301427n);
        int i = this.f301428o;
        this.f301432s = (int) (((float) (A - (this.f301431r * i))) / (((float) i) + 1.0f));
    }

    /* renamed from: b */
    public int mo141896b() {
        return 0;
    }

    /* renamed from: f */
    public int mo141897f() {
        return this.f301429p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r0 = mo141912s();
        r1 = r3.f301429p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCount() {
        /*
            r3 = this;
            boolean r0 = r3.f301433t
            r1 = 0
            if (r0 == 0) goto L_0x002f
            int r0 = r3.f301429p
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            if (r0 <= 0) goto L_0x0020
            int r0 = r3.mo141912s()
            int r1 = r3.f301429p
            if (r0 <= r1) goto L_0x0020
            float r0 = (float) r1
            int r1 = r3.f301428o
            float r1 = (float) r1
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
        L_0x001e:
            int r0 = (int) r0
            return r0
        L_0x0020:
            int r0 = r3.mo141912s()
            float r0 = (float) r0
            int r1 = r3.f301428o
            float r1 = (float) r1
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            goto L_0x001e
        L_0x002f:
            int r0 = r3.mo141912s()
            int r2 = r3.f301429p
            if (r0 > r2) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r3.f301428o
            float r1 = (float) r1
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r1 = (int) r0
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w51.C102340h.getCount():int");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C102343c cVar;
        LinearLayout linearLayout;
        if (view == null || view.getTag() == null) {
            LinearLayout linearLayout2 = new LinearLayout(this.f301427n);
            AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2);
            linearLayout2.setBackgroundResource(C0966R.C0969drawable.ayq);
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.setPadding(0, 0, 0, this.f301430q);
            cVar = new C102343c(this);
            cVar.f301439a = linearLayout2;
            linearLayout2.setTag(cVar);
            for (int i2 = 0; i2 < this.f301428o; i2++) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.leftMargin = this.f301432s;
                cVar.f301439a.addView(new C102331c(this.f301427n, (int) C0966R.C0971layout.a2w).f301409c, i2, layoutParams2);
            }
            linearLayout = linearLayout2;
        } else {
            cVar = (C102343c) view.getTag();
            linearLayout = view;
        }
        int i3 = 0;
        while (true) {
            int i4 = this.f301428o;
            if (i3 >= i4) {
                return linearLayout;
            }
            int i5 = (this.f301433t ? i4 * i : (i4 * i) + this.f301429p) + i3;
            Context context = this.f301427n;
            View childAt = cVar.f301439a.getChildAt(i3);
            C102331c cVar2 = new C102331c(context, childAt);
            childAt.setOnClickListener(new C102341a(cVar2, i5));
            C102562g g = getItem(i5);
            if (i5 > mo141912s() - 1 || g == null) {
                cVar2.f301409c.setClickable(false);
                View view2 = cVar2.f301409c;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                cVar2.f301412f.setBackgroundDrawable((Drawable) null);
            } else {
                if (this.f301435v == null) {
                    this.f301435v = new HashMap<>();
                }
                if (this.f301435v.containsValue(cVar2)) {
                    this.f301435v.remove(cVar2.f301408b);
                }
                cVar2.f301408b = mo142173d(g);
                this.f301435v.put(mo142173d(g), cVar2);
                View view3 = cVar2.f301409c;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                cVar2.f301411e.setText(g.f301983b.f298996f);
                C20828a b = C20828a.m22825b();
                C101824o80 o802 = g.f301983b;
                String str = o802.f298995e;
                b.mo32519h(str, cVar2.f301410d, C98601f.m128139d(o802.f298994d, str));
                cVar2.f301412f.setBackgroundResource(C0966R.C0969drawable.emoji_grid_item_fg);
                cVar2.f301409c.setClickable(true);
                mo141913t(cVar2, g.f301987f);
            }
            i3++;
        }
    }

    /* renamed from: h */
    public View mo141898h(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: i */
    public int mo141899i() {
        return 0;
    }

    /* renamed from: j */
    public C102330b mo141900j(Context context, View view) {
        return null;
    }

    /* renamed from: n */
    public void mo141901n(int i) {
    }

    /* renamed from: o */
    public void mo141902o(int i) {
        this.f301429p = i;
    }

    /* renamed from: p */
    public void mo141903p(int i) {
    }

    /* renamed from: r */
    public void mo141911r(String str, int i) {
        HashMap<String, C102331c> hashMap = this.f301435v;
        if (hashMap == null) {
            Log.m105928w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "updateStatus mCacheHolder is nulll.");
            return;
        }
        C102331c cVar = hashMap.get(str);
        C102562g l = this.f301966e.mo142184l(str);
        if (l != null) {
            mo142176l(l, str, i);
        }
        if (!(l == null || this.f301966e == null || l.f301987f != -1)) {
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "force refresh status");
            C102556d dVar = this.f301966e;
            boolean z = dVar.f301975g;
            C96984r2 r2Var = dVar.f301973e.get(str);
            HashMap<String, C96984r2> hashMap2 = this.f301966e.f301974f;
            l.mo142188a(z, r2Var, hashMap2 == null ? false : hashMap2.containsKey(str));
        }
        if (cVar == null) {
            Log.m105928w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "updateStatus viewHolder is nulll.");
        } else {
            mo141913t(cVar, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r0 = super.getCount();
        r1 = r2.f301429p;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo141912s() {
        /*
            r2 = this;
            boolean r0 = r2.f301433t
            if (r0 == 0) goto L_0x001a
            int r0 = r2.f301429p
            if (r0 != 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            if (r0 <= 0) goto L_0x0015
            int r0 = super.getCount()
            int r1 = r2.f301429p
            if (r0 <= r1) goto L_0x0015
            return r1
        L_0x0015:
            int r0 = super.getCount()
            return r0
        L_0x001a:
            int r0 = super.getCount()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w51.C102340h.mo141912s():int");
    }

    /* renamed from: t */
    public final void mo141913t(C102331c cVar, int i) {
        if (i != 7) {
            cVar.f301411e.setTextColor(this.f301965d.getResources().getColor(C0966R.color.a7f));
            cVar.f301411e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            Log.m105929w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "unknow product status:%d", Integer.valueOf(i));
            return;
        }
        cVar.f301411e.setTextColor(this.f301965d.getResources().getColor(C0966R.color.f3552xi));
        Drawable drawable = this.f301965d.getResources().getDrawable(C0966R.raw.emoji_download_finish);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        cVar.f301411e.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }
}
