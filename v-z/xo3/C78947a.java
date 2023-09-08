package xo3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.p136ui.C85975v4;
import j20.C117292a;
import java.util.ArrayList;
import xo3.C78950d;
import yr3.C79150a;

/* renamed from: xo3.a */
public class C78947a implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78950d f231823d;

    public C78947a(C78950d dVar) {
        this.f231823d = dVar;
    }

    public boolean onLongClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/textview/SelectableTextHelper$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C85975v4.m106304a("SelectableTextHelper", "onLongClick.", new Object[0]);
        C78950d dVar = this.f231823d;
        dVar.f231864z = false;
        if (dVar.f231845g != null) {
            dVar.f231830E = true;
            dVar.f231831F = false;
            dVar.f231832G = false;
            CharSequence j = C78967g.m95477j(dVar.f231844f);
            if (j instanceof SpannableString) {
                C78950d dVar2 = this.f231823d;
                SpannableString spannableString = (SpannableString) j;
                dVar2.getClass();
                dVar2.f231838M = new ArrayList<>();
                int i2 = 0;
                while (i2 < spannableString.length()) {
                    int nextSpanTransition = spannableString.nextSpanTransition(i2, spannableString.length(), ImageSpan.class);
                    ImageSpan[] imageSpanArr = (ImageSpan[]) spannableString.getSpans(i2, nextSpanTransition, ImageSpan.class);
                    if (1 == imageSpanArr.length) {
                        C78950d.C78960j jVar = new C78950d.C78960j(dVar2);
                        jVar.f231897a = i2;
                        jVar.f231898b = nextSpanTransition;
                        dVar2.f231838M.add(jVar);
                    } else {
                        C85975v4.m106305b("SelectableTextHelper", "other situation occur! length: %d.", Integer.valueOf(imageSpanArr.length));
                    }
                    C85975v4.m106304a("SelectableTextHelper", "spans from %d to %d.", Integer.valueOf(i2), Integer.valueOf(nextSpanTransition));
                    i2 = nextSpanTransition;
                }
                C85975v4.m106304a("SelectableTextHelper", dVar2.f231838M.toString(), new Object[0]);
            }
            this.f231823d.mo108921e();
            C78950d dVar3 = this.f231823d;
            int i3 = dVar3.f231858t;
            if (i3 <= 0 || i3 >= C78967g.m95477j(dVar3.f231844f).length()) {
                C78950d dVar4 = this.f231823d;
                dVar4.mo108928l(0, C78967g.m95477j(dVar4.f231844f).length());
                C78950d dVar5 = this.f231823d;
                dVar5.f231828C = true;
                dVar5.f231829D = false;
                dVar5.mo108924h();
                this.f231823d.f231845g.mo103118c(view);
            } else {
                C78950d dVar6 = this.f231823d;
                dVar6.mo108928l(0, dVar6.f231858t);
                C78950d dVar7 = this.f231823d;
                dVar7.f231828C = false;
                dVar7.f231829D = false;
                dVar7.mo108926j();
                this.f231823d.mo108924h();
            }
        } else {
            dVar.f231830E = false;
            int i4 = dVar.f231851m;
            int i5 = dVar.f231852n;
            View view2 = dVar.f231844f;
            if (view2 instanceof NeatTextView) {
                C79150a layout = ((NeatTextView) view2).getLayout();
                if (layout != null) {
                    i = layout.mo109126j0(i4, i5);
                    dVar.mo108928l(i, i + 1);
                    this.f231823d.mo108921e();
                    C78950d dVar8 = this.f231823d;
                    dVar8.f231828C = false;
                    dVar8.f231829D = false;
                    dVar8.mo108926j();
                    this.f231823d.mo108924h();
                }
            } else if (view2 instanceof TextView) {
                Layout layout2 = ((TextView) view2).getLayout();
                if (layout2 != null) {
                    int offsetForHorizontal = layout2.getOffsetForHorizontal(layout2.getLineForVertical(i5), (float) i4);
                    i = ((int) layout2.getPrimaryHorizontal(offsetForHorizontal)) > i4 ? layout2.getOffsetToLeftOf(offsetForHorizontal) : offsetForHorizontal;
                } else {
                    i = -1;
                }
                dVar.mo108928l(i, i + 1);
                this.f231823d.mo108921e();
                C78950d dVar82 = this.f231823d;
                dVar82.f231828C = false;
                dVar82.f231829D = false;
                dVar82.mo108926j();
                this.f231823d.mo108924h();
            }
            i = 0;
            dVar.mo108928l(i, i + 1);
            this.f231823d.mo108921e();
            C78950d dVar822 = this.f231823d;
            dVar822.f231828C = false;
            dVar822.f231829D = false;
            dVar822.mo108926j();
            this.f231823d.mo108924h();
        }
        C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
