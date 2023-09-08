package com.tencent.p014mm.sticker.p1079ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import ol3.C100367a;
import rh3.C101381e;
import rh3.C101382f;
import rh3.C101383g;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/sticker/ui/view/CaptureStickerHint;", "Landroid/widget/LinearLayout;", "", "Lrh3/g;", "stickerPack", "Lrx3/b0;", "setStickerPack", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sticker_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sticker.ui.view.CaptureStickerHint */
public final class CaptureStickerHint extends LinearLayout implements C111847h {

    /* renamed from: j */
    public static final SparseArray<int[]> f284107j;

    /* renamed from: n */
    public static final SparseArray<int[]> f284108n;

    /* renamed from: d */
    public final ImageView f284109d;

    /* renamed from: e */
    public final TextView f284110e;

    /* renamed from: f */
    public C101383g f284111f;

    /* renamed from: g */
    public LinkedList<Integer> f284112g;

    /* renamed from: h */
    public int f284113h;

    /* renamed from: i */
    public final Runnable f284114i;

    /* renamed from: com.tencent.mm.sticker.ui.view.CaptureStickerHint$a */
    public static final class C96979a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CaptureStickerHint f284115d;

        public C96979a(CaptureStickerHint captureStickerHint) {
            this.f284115d = captureStickerHint;
        }

        public final void run() {
            this.f284115d.mo135563a();
        }
    }

    static {
        SparseArray<int[]> sparseArray = new SparseArray<>();
        f284107j = sparseArray;
        SparseArray<int[]> sparseArray2 = new SparseArray<>();
        f284108n = sparseArray2;
        sparseArray.put(10, new int[]{C0966R.C0969drawable.f357363br0, C0966R.C0969drawable.f357364br1});
        sparseArray.put(11, new int[]{C0966R.C0969drawable.bqy, C0966R.C0969drawable.bqz});
        sparseArray.put(12, new int[]{C0966R.C0969drawable.bqw, C0966R.C0969drawable.bqx});
        sparseArray.put(13, new int[]{C0966R.C0969drawable.f357365br2, C0966R.C0969drawable.f357366br3});
        sparseArray.put(14, new int[]{C0966R.C0969drawable.bqo, C0966R.C0969drawable.bqp});
        sparseArray.put(15, new int[]{C0966R.C0969drawable.bqq, C0966R.C0969drawable.bqr});
        sparseArray.put(16, new int[]{C0966R.C0969drawable.bqu, C0966R.C0969drawable.bqv});
        sparseArray.put(17, new int[]{C0966R.C0969drawable.bqs, C0966R.C0969drawable.bqt});
        sparseArray.put(100, new int[]{C0966R.C0969drawable.br_, C0966R.C0969drawable.bra});
        sparseArray.put(101, new int[]{C0966R.C0969drawable.brj, C0966R.C0969drawable.brk});
        sparseArray.put(102, new int[]{C0966R.C0969drawable.brn, C0966R.C0969drawable.bro});
        sparseArray.put(103, new int[]{C0966R.C0969drawable.br6, C0966R.C0969drawable.br7});
        sparseArray.put(104, new int[]{C0966R.C0969drawable.brh, C0966R.C0969drawable.bri});
        sparseArray.put(105, new int[]{C0966R.C0969drawable.brd, C0966R.C0969drawable.bre});
        sparseArray.put(106, new int[]{C0966R.C0969drawable.brb, C0966R.C0969drawable.brc});
        sparseArray.put(107, new int[]{C0966R.C0969drawable.brf, C0966R.C0969drawable.brg});
        sparseArray.put(108, new int[]{C0966R.C0969drawable.brl, C0966R.C0969drawable.brm});
        sparseArray.put(109, new int[]{C0966R.C0969drawable.brp, C0966R.C0969drawable.brq});
        sparseArray.put(110, new int[]{C0966R.C0969drawable.br4, C0966R.C0969drawable.br5});
        sparseArray.put(112, new int[]{C0966R.C0969drawable.br8, C0966R.C0969drawable.br9});
        sparseArray2.put(10, new int[]{C0966R.string.jnf, C0966R.string.jng});
        sparseArray2.put(11, new int[]{C0966R.string.jnd, C0966R.string.jne});
        sparseArray2.put(12, new int[]{C0966R.string.jnb, C0966R.string.jnc});
        sparseArray2.put(13, new int[]{C0966R.string.jnh, C0966R.string.jni});
        sparseArray2.put(14, new int[]{C0966R.string.jn4, C0966R.string.jn5});
        sparseArray2.put(15, new int[]{C0966R.string.jn6, C0966R.string.jn7});
        sparseArray2.put(16, new int[]{C0966R.string.jn_, C0966R.string.jna});
        sparseArray2.put(17, new int[]{C0966R.string.jn8, C0966R.string.jn9});
        sparseArray2.put(100, new int[]{C0966R.string.jnp, C0966R.string.jnq});
        sparseArray2.put(101, new int[]{C0966R.string.jnz, C0966R.string.f361409jo0});
        sparseArray2.put(102, new int[]{C0966R.string.f361412jo3, C0966R.string.jo4});
        sparseArray2.put(103, new int[]{C0966R.string.jnl, C0966R.string.jnm});
        sparseArray2.put(104, new int[]{C0966R.string.jnx, C0966R.string.jny});
        sparseArray2.put(105, new int[]{C0966R.string.jnt, C0966R.string.jnu});
        sparseArray2.put(106, new int[]{C0966R.string.jnr, C0966R.string.jns});
        sparseArray2.put(107, new int[]{C0966R.string.jnv, C0966R.string.jnw});
        sparseArray2.put(108, new int[]{C0966R.string.f361410jo1, C0966R.string.f361411jo2});
        sparseArray2.put(109, new int[]{C0966R.string.jo5, C0966R.string.jo6});
        sparseArray2.put(110, new int[]{C0966R.string.jnj, C0966R.string.jnk});
        sparseArray2.put(112, new int[]{C0966R.string.jnn, C0966R.string.jno});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptureStickerHint(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f284112g = new LinkedList<>();
        this.f284114i = new C96979a(this);
        View.inflate(context, C0966R.C0971layout.c5p, this);
        View findViewById = findViewById(C0966R.C0970id.k2a);
        C87412m.m108593f(findViewById, "findViewById(R.id.sticker_preview_hint_icon)");
        this.f284109d = (ImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k2b);
        C87412m.m108593f(findViewById2, "findViewById(R.id.sticker_preview_hint_text)");
        this.f284110e = (TextView) findViewById2;
    }

    /* renamed from: a */
    public final void mo135563a() {
        if (this.f284113h >= this.f284112g.size()) {
            this.f284109d.setImageDrawable((Drawable) null);
            setVisibility(8);
            return;
        }
        setVisibility(0);
        SparseArray<int[]> sparseArray = f284108n;
        Integer num = this.f284112g.get(this.f284113h);
        C87412m.m108593f(num, "actions[actionIndex]");
        int[] iArr = sparseArray.get(num.intValue());
        if (iArr == null) {
            this.f284110e.setText((CharSequence) null);
        } else if (this.f284113h == 0) {
            this.f284110e.setText(iArr[0]);
        } else {
            this.f284110e.setText(iArr[1]);
        }
        SparseArray<int[]> sparseArray2 = f284107j;
        Integer num2 = this.f284112g.get(this.f284113h);
        C87412m.m108593f(num2, "actions[actionIndex]");
        int[] iArr2 = sparseArray2.get(num2.intValue());
        if (iArr2 != null) {
            C100367a aVar = new C100367a();
            for (int drawable : iArr2) {
                Drawable drawable2 = getContext().getDrawable(drawable);
                C87412m.m108591d(drawable2);
                aVar.addFrame(drawable2, 300);
            }
            this.f284109d.setImageDrawable(aVar);
            aVar.start();
        } else {
            this.f284109d.setImageDrawable((Drawable) null);
        }
        this.f284113h++;
        postDelayed(this.f284114i, 2000);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(1);
        setGravity(17);
    }

    public final void setStickerPack(C101383g gVar) {
        HashMap<String, C101381e> hashMap;
        Collection<C101381e> values;
        HashMap<String, C101381e> hashMap2;
        Collection<C101381e> values2;
        HashMap<String, C101381e> hashMap3;
        Collection<C101381e> values3;
        if (!C87412m.m108589b(this.f284111f, gVar)) {
            removeCallbacks(this.f284114i);
            this.f284111f = gVar;
            this.f284112g.clear();
            if (gVar != null) {
                LinkedList<Integer> linkedList = this.f284112g;
                LinkedList<C101381e> linkedList2 = new LinkedList<>();
                C101382f fVar = gVar.f296983h;
                if (!(fVar == null || (hashMap3 = fVar.f296974f) == null || (values3 = hashMap3.values()) == null)) {
                    linkedList2.addAll(values3);
                }
                C101382f fVar2 = gVar.f296984i;
                if (!(fVar2 == null || (hashMap2 = fVar2.f296974f) == null || (values2 = hashMap2.values()) == null)) {
                    linkedList2.addAll(values2);
                }
                C101382f fVar3 = gVar.f296985j;
                if (!(fVar3 == null || (hashMap = fVar3.f296974f) == null || (values = hashMap.values()) == null)) {
                    linkedList2.addAll(values);
                }
                ArrayList arrayList = new ArrayList();
                for (C101381e eVar : linkedList2) {
                    int i = eVar.f296964b;
                    Integer valueOf = i > 0 ? Integer.valueOf(i) : null;
                    if (valueOf != null) {
                        arrayList.add(valueOf);
                    }
                }
                linkedList.addAll(arrayList);
            }
            if (this.f284112g.size() > 0) {
                this.f284113h = 0;
                mo135563a();
                return;
            }
            this.f284109d.setImageDrawable((Drawable) null);
            setVisibility(8);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CaptureStickerHint(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
