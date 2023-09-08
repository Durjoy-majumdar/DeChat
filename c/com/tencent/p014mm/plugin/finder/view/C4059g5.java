package com.tencent.p014mm.plugin.finder.view;

import android.text.TextPaint;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import de3.C75359b0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.g5 */
public class C4059g5 extends C75359b0 {

    /* renamed from: p */
    public static final int f18178p = MMApplicationContext.getResources().getColor(C0966R.color.f3573y5);

    /* renamed from: d */
    public final String f18179d;

    /* renamed from: e */
    public boolean f18180e;

    /* renamed from: f */
    public boolean f18181f;

    /* renamed from: g */
    public C32226l<? super String, C13598b0> f18182g;

    /* renamed from: h */
    public boolean f18183h;

    /* renamed from: i */
    public float f18184i;

    /* renamed from: j */
    public boolean f18185j;

    /* renamed from: n */
    public boolean f18186n;

    /* renamed from: o */
    public boolean f18187o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4059g5(String str, int i, int i2, boolean z, boolean z2, C32226l lVar, int i3, C8480h hVar) {
        this(str, i, i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, lVar);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        if (this.f18183h) {
            this.f18182g.invoke(this.f18179d);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void setColor(int i, int i2) {
        super.setColor(i, i2);
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        super.updateDrawState(textPaint);
        if (this.f18180e) {
            C85875k4.m106189j0(textPaint, 0.8f);
        }
        float f = this.f18184i;
        if (f > 0.0f) {
            textPaint.setShadowLayer(f, 0.0f, 0.0f, f18178p);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4059g5(String str, int i, int i2, boolean z, boolean z2, C32226l<? super String, C13598b0> lVar) {
        super(i, i2);
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(lVar, "onClick");
        this.f18179d = str;
        this.f18180e = z;
        this.f18181f = z2;
        this.f18182g = lVar;
        this.f18183h = true;
    }
}
