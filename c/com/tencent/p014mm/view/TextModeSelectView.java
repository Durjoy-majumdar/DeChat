package com.tencent.p014mm.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMImageView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;
import sx3.C90364q0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00015B\u0019\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102B!\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b1\u00104J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tJ\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010$\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00066"}, mo182094d2 = {"Lcom/tencent/mm/view/TextModeSelectView;", "Lcom/tencent/mm/ui/MMImageView;", "Landroid/view/View$OnClickListener;", "", "", "modes", "Lrx3/b0;", "setMode", "newMode", "", "map", "setModeResourceMap", "Landroid/view/View;", "v", "onClick", "", "d", "Ljava/util/List;", "getModeList", "()Ljava/util/List;", "modeList", "e", "Ljava/util/Map;", "getModeResource", "()Ljava/util/Map;", "setModeResource", "(Ljava/util/Map;)V", "modeResource", "f", "I", "getCurMode", "()I", "setCurMode", "(I)V", "getCurMode$annotations", "()V", "curMode", "Lcom/tencent/mm/view/TextModeSelectView$a;", "g", "Lcom/tencent/mm/view/TextModeSelectView$a;", "getModeChangeListener", "()Lcom/tencent/mm/view/TextModeSelectView$a;", "setModeChangeListener", "(Lcom/tencent/mm/view/TextModeSelectView$a;)V", "modeChangeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-photoedit-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.TextModeSelectView */
public final class TextModeSelectView extends MMImageView implements View.OnClickListener {

    /* renamed from: d */
    public final List<Integer> f285661d;

    /* renamed from: e */
    public Map<Integer, Integer> f285662e = C90364q0.m113147f(new C13604l(1, Integer.valueOf(C0966R.raw.text_bg_unselected)), new C13604l(2, Integer.valueOf(C0966R.raw.text_selected)), new C13604l(3, Integer.valueOf(C0966R.raw.text_bg_selected)));

    /* renamed from: f */
    public int f285663f = 1;

    /* renamed from: g */
    public C97327a f285664g;

    /* renamed from: com.tencent.mm.view.TextModeSelectView$a */
    public interface C97327a {
        /* renamed from: a */
        void mo136442a(int i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextModeSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        List<Integer> h = C64197v.m75539h(1, 3);
        this.f285661d = h;
        this.f285663f = ((Number) C110818d0.m150914L(h)).intValue();
        mo136430b();
        setOnClickListener(this);
    }

    public static /* synthetic */ void getCurMode$annotations() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r0 = r2.f285662e.get(1);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136430b() {
        /*
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r2.f285662e
            int r1 = r2.f285663f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0015
        L_0x0010:
            int r0 = r0.intValue()
            goto L_0x0028
        L_0x0015:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r2.f285662e
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0025
            goto L_0x0010
        L_0x0025:
            r0 = 2131757033(0x7f1007e9, float:1.914499E38)
        L_0x0028:
            r2.setImageResource(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.TextModeSelectView.mo136430b():void");
    }

    public final int getCurMode() {
        return this.f285663f;
    }

    public final C97327a getModeChangeListener() {
        return this.f285664g;
    }

    public final List<Integer> getModeList() {
        return this.f285661d;
    }

    public final Map<Integer, Integer> getModeResource() {
        return this.f285662e;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/TextModeSelectView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        setMode(this.f285661d.get((this.f285661d.indexOf(Integer.valueOf(this.f285663f)) + 1) % this.f285661d.size()).intValue());
        C117292a.m165361g(this, "com/tencent/mm/view/TextModeSelectView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setCurMode(int i) {
        this.f285663f = i;
    }

    public final void setMode(List<Integer> list) {
        C87412m.m108594g(list, "modes");
        this.f285661d.clear();
        this.f285661d.addAll(list);
        setMode(((Number) C110818d0.m150914L(this.f285661d)).intValue());
    }

    public final void setModeChangeListener(C97327a aVar) {
        this.f285664g = aVar;
    }

    public final void setModeResource(Map<Integer, Integer> map) {
        C87412m.m108594g(map, "<set-?>");
        this.f285662e = map;
    }

    public final void setModeResourceMap(Map<Integer, Integer> map) {
        C87412m.m108594g(map, "map");
        this.f285662e = map;
        mo136430b();
    }

    public final void setMode(int i) {
        if (this.f285663f != i) {
            this.f285663f = i;
            mo136430b();
            C97327a aVar = this.f285664g;
            if (aVar != null) {
                aVar.mo136442a(i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextModeSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        List<Integer> h = C64197v.m75539h(1, 3);
        this.f285661d = h;
        this.f285663f = ((Number) C110818d0.m150914L(h)).intValue();
        mo136430b();
        setOnClickListener(this);
    }
}
