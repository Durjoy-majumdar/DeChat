package com.tencent.p014mm.view.popview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.gif.MMGIFException;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.smiley.C96931e;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import p1048uk.C102048b;
import p1048uk.C102051g;
import p207nl.C89008j;
import p490dl.C58320u;
import qz1.C22187h;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/view/popview/SmileyPopView;", "Lcom/tencent/mm/view/popview/AbstractPopView;", "Ldl/u;", "item", "Lrx3/b0;", "setSmileyItem", "Landroid/view/WindowManager$LayoutParams;", "getWindowLayoutParams", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.popview.SmileyPopView */
public final class SmileyPopView extends AbstractPopView {

    /* renamed from: f */
    public View f285775f;

    /* renamed from: g */
    public ImageView f285776g;

    /* renamed from: h */
    public TextView f285777h;

    /* renamed from: i */
    public C22187h f285778i;

    /* renamed from: j */
    public int f285779j;

    /* renamed from: n */
    public final WindowManager.LayoutParams f285780n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SmileyPopView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SmileyPopView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: d */
    public void mo104703d(View view) {
        C87412m.m108594g(view, "anchor");
        mo104702c(view.getContext());
        view.setPressed(false);
        view.setSelected(false);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = getResources().getDisplayMetrics().widthPixels;
        int measuredWidth = iArr[0] + (view.getMeasuredWidth() / 2);
        WindowManager.LayoutParams layoutParams = this.f285780n;
        int i2 = (layoutParams.width - this.f285779j) / 2;
        layoutParams.y = ((iArr[1] - layoutParams.height) + view.getMeasuredHeight()) - this.f220883e;
        int i3 = this.f285780n.width;
        if (measuredWidth < i3 / 2) {
            View view2 = this.f285775f;
            C87412m.m108591d(view2);
            view2.setBackground(C74942w4.m89785b(getContext(), C0966R.attr.f2811l9));
            this.f285780n.x = (measuredWidth + i2) - (i / 2);
        } else if ((i3 / 2) + measuredWidth > i) {
            View view3 = this.f285775f;
            C87412m.m108591d(view3);
            view3.setBackground(C74942w4.m89785b(getContext(), C0966R.attr.f2812l_));
            this.f285780n.x = (measuredWidth - i2) - (i / 2);
        } else {
            View view4 = this.f285775f;
            C87412m.m108591d(view4);
            view4.setBackground(C74942w4.m89785b(getContext(), C0966R.attr.f2810l8));
            this.f285780n.x = measuredWidth - (i / 2);
        }
    }

    public WindowManager.LayoutParams getWindowLayoutParams() {
        return this.f285780n;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            mo104700a();
        }
    }

    public final void setSmileyItem(C58320u uVar) {
        T t;
        String str;
        C87412m.m108594g(uVar, "item");
        String d = C96926b0.m124490b().mo135519d(uVar.f166996a);
        String c = C96931e.m124499a().mo135523c(d);
        Log.m105925i("MicroMsg.SmileyPopView", "pop smiley %s, %s, %s", uVar.f166996a, d, c);
        C87412m.m108593f(c, "desc");
        String str2 = c;
        int E = C112550d0.m153769E(str2, "[", 0, false, 6, (Object) null);
        int E2 = C112550d0.m153769E(str2, "]", 0, false, 6, (Object) null);
        if (E2 == -1) {
            E2 = c.length();
        }
        String substring = c.substring(E + 1, E2);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        TextView textView = this.f285777h;
        if (textView != null) {
            textView.setText(substring);
        }
        C102051g.C102052a aVar = C102051g.f300534a;
        Iterator<T> it = C102051g.f300538e.f300528c.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C102048b.C102049a) t).f300529b, uVar.f166996a)) {
                break;
            }
        }
        C102048b.C102049a aVar2 = (C102048b.C102049a) t;
        if (aVar2 == null) {
            str = null;
        } else {
            str = C89008j.f256613a.mo123384c() + aVar2.f300530c;
        }
        C22187h hVar = this.f285778i;
        if (hVar != null) {
            hVar.mo35280b();
        }
        this.f285778i = null;
        if (C86013q1.m106450k(str)) {
            try {
                this.f285778i = new C22187h(C86013q1.m106433O(str, 0, -1));
            } catch (Exception e) {
                if (e instanceof MMGIFException) {
                    C115669n.INSTANCE.mo175911u(711, 22);
                }
            }
            ImageView imageView = this.f285776g;
            if (imageView != null) {
                imageView.setImageDrawable(this.f285778i);
            }
            C22187h hVar2 = this.f285778i;
            if (hVar2 != null) {
                hVar2.mo35282d();
                return;
            }
            return;
        }
        ImageView imageView2 = this.f285776g;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C96926b0.m124490b().mo135518c(uVar.f166996a));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setSmileyItem: ");
        sb.append(uVar.f166996a);
        sb.append(", ");
        C102051g.C102052a aVar3 = C102051g.f300534a;
        sb.append(C102051g.f300538e.f300528c.size());
        Log.m105924i("MicroMsg.SmileyPopView", sb.toString());
        if (aVar2 != null) {
            aVar3.mo141550a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmileyPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.a29, this);
        this.f285775f = findViewById(C0966R.C0970id.jns);
        this.f285776g = (ImageView) findViewById(C0966R.C0970id.cgy);
        this.f285777h = (TextView) findViewById(C0966R.C0970id.cgx);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2, CdnLogic.kGroupNoticeCDNAppType, 1);
        this.f285780n = layoutParams;
        this.f285779j = getResources().getDimensionPixelOffset(C0966R.dimen.anf);
        layoutParams.width = context.getResources().getDimensionPixelSize(C0966R.dimen.ane);
        layoutParams.height = context.getResources().getDimensionPixelSize(C0966R.dimen.anc);
        layoutParams.gravity = 49;
    }
}
