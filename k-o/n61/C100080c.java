package n61;

import android.content.Context;
import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreDesignerPackFragment;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreDesignerSingleFragment;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiStoreDesignerPackList;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import p61.C35378f;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49103d62;

/* renamed from: n61.c */
public final class C100080c extends C112968x {

    /* renamed from: i */
    public final Context f293192i;

    /* renamed from: j */
    public final int f293193j;

    /* renamed from: n */
    public final LiveData<C49103d62> f293194n;

    /* renamed from: o */
    public final C54219z<EmojiStoreDesignerPackList> f293195o;

    /* renamed from: p */
    public final C54219z<C35378f> f293196p;

    /* renamed from: q */
    public final LinkedList<Fragment> f293197q = new LinkedList<>();

    /* renamed from: r */
    public final C13601g f293198r = C36568h.m40985a(new C100081a(this));

    /* renamed from: s */
    public final C13601g f293199s = C36568h.m40985a(new C100082b(this));

    /* renamed from: n61.c$a */
    public static final class C100081a extends C87413o implements C32224a<EmojiStoreDesignerPackFragment> {

        /* renamed from: d */
        public final /* synthetic */ C100080c f293200d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100081a(C100080c cVar) {
            super(0);
            this.f293200d = cVar;
        }

        public Object invoke() {
            C100080c cVar = this.f293200d;
            return new EmojiStoreDesignerPackFragment(cVar.f293193j, cVar.f293194n, cVar.f293195o);
        }
    }

    /* renamed from: n61.c$b */
    public static final class C100082b extends C87413o implements C32224a<EmojiStoreDesignerSingleFragment> {

        /* renamed from: d */
        public final /* synthetic */ C100080c f293201d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100082b(C100080c cVar) {
            super(0);
            this.f293201d = cVar;
        }

        public Object invoke() {
            C100080c cVar = this.f293201d;
            return new EmojiStoreDesignerSingleFragment(cVar.f293193j, cVar.f293196p);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100080c(Context context, FragmentManager fragmentManager, int i, LiveData<C49103d62> liveData, C54219z<EmojiStoreDesignerPackList> zVar, C54219z<C35378f> zVar2) {
        super(fragmentManager, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(fragmentManager, "fm");
        C87412m.m108594g(liveData, "designerData");
        C87412m.m108594g(zVar, "emotionPackList");
        C87412m.m108594g(zVar2, "emojiList");
        this.f293192i = context;
        this.f293193j = i;
        this.f293194n = liveData;
        this.f293195o = zVar;
        this.f293196p = zVar2;
    }

    public int getCount() {
        return this.f293197q.size();
    }

    public Fragment getItem(int i) {
        Fragment fragment = this.f293197q.get(i);
        C87412m.m108593f(fragment, "fragments[position]");
        return fragment;
    }

    public CharSequence getPageTitle(int i) {
        Fragment item = getItem(i);
        return item instanceof EmojiStoreDesignerPackFragment ? this.f293192i.getString(C0966R.string.c_e) : item instanceof EmojiStoreDesignerSingleFragment ? this.f293192i.getString(C0966R.string.c98) : super.getPageTitle(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r0 = r0.getDataList();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void notifyDataSetChanged() {
        /*
            r4 = this;
            java.util.LinkedList<androidx.fragment.app.Fragment> r0 = r4.f293197q
            r0.clear()
            androidx.lifecycle.z<com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreDesignerPackList> r0 = r4.f293195o
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreDesignerPackList r0 = (com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiStoreDesignerPackList) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0020
            java.util.List r0 = r0.getDataList()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 == 0) goto L_0x0032
            java.util.LinkedList<androidx.fragment.app.Fragment> r0 = r4.f293197q
            rx3.g r3 = r4.f293198r
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment r3 = (com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreDesignerPackFragment) r3
            r0.add(r3)
        L_0x0032:
            androidx.lifecycle.z<p61.f> r0 = r4.f293196p
            java.lang.Object r0 = r0.getValue()
            p61.f r0 = (p61.C35378f) r0
            if (r0 == 0) goto L_0x0048
            java.util.List<te3.k70> r0 = r0.f94720a
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x0048
            r1 = 1
        L_0x0048:
            if (r1 == 0) goto L_0x0059
            java.util.LinkedList<androidx.fragment.app.Fragment> r0 = r4.f293197q
            rx3.g r1 = r4.f293199s
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerSingleFragment r1 = (com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreDesignerSingleFragment) r1
            r0.add(r1)
        L_0x0059:
            super.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n61.C100080c.notifyDataSetChanged():void");
    }
}
