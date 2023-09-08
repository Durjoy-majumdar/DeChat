package rf0;

import com.tencent.p014mm.C0966R;
import jf0.C21234c;
import jf0.C87961b;
import lf0.C21425b;
import p385u2.C111105a;
import qf0.C22081a;

/* renamed from: rf0.h */
public class C22234h implements C21425b {

    /* renamed from: a */
    public final /* synthetic */ C22236j f62991a;

    public C22234h(C22236j jVar) {
        this.f62991a = jVar;
    }

    public void onItemSelected(int i) {
        int i2;
        C22236j jVar = this.f62991a;
        int i3 = jVar.f63007k + i;
        if (jVar.f63019w) {
            i3--;
        }
        int i4 = i3;
        int intValue = ((Integer) jVar.f62999c.getAdapter().getItem(this.f62991a.f62999c.getCurrentItem())).intValue();
        C22236j jVar2 = this.f62991a;
        jVar2.f63017u = i4;
        if (!jVar2.f63019w || i != -1) {
            jVar2.f62999c.mo22032e(C111105a.m151500b(jVar2.f62996B, C0966R.color.BW_0_Alpha_0_9));
            C22236j jVar3 = this.f62991a;
            jVar3.f63000d.mo22032e(C111105a.m151500b(jVar3.f62996B, C0966R.color.BW_0_Alpha_0_9));
            this.f62991a.f62999c.invalidate();
            this.f62991a.f63000d.invalidate();
            int currentItem = this.f62991a.f62999c.getCurrentItem();
            C22236j jVar4 = this.f62991a;
            int i5 = jVar4.f63007k;
            int i6 = jVar4.f63008l;
            if (i5 == i6) {
                jVar4.f62999c.setAdapter(new C21234c(jVar4.f63009m, jVar4.f63010n, new C87961b(jVar4.f62996B)));
                if (currentItem > this.f62991a.f62999c.getAdapter().getItemsCount() - 1) {
                    currentItem = this.f62991a.f62999c.getAdapter().getItemsCount() - 1;
                    this.f62991a.f62999c.setCurrentItem(currentItem);
                }
                C22236j jVar5 = this.f62991a;
                int i7 = jVar5.f63009m;
                int i8 = currentItem + i7;
                int i9 = jVar5.f63010n;
                if (i7 == i9) {
                    C22236j.m25765a(jVar5, i4, i8, jVar5.f63011o, jVar5.f63012p, jVar5.f63022z, jVar5.f62995A);
                } else if (i8 == i7) {
                    C22236j.m25765a(jVar5, i4, i8, jVar5.f63011o, 31, jVar5.f63022z, jVar5.f62995A);
                } else if (i8 == i9) {
                    C22236j.m25765a(jVar5, i4, i8, 1, jVar5.f63012p, jVar5.f63022z, jVar5.f62995A);
                } else {
                    C22236j.m25765a(jVar5, i4, i8, 1, 31, jVar5.f63022z, jVar5.f62995A);
                }
            } else if (i4 == i5) {
                jVar4.f62999c.setAdapter(new C21234c(jVar4.f63009m, 12, new C87961b(jVar4.f62996B)));
                C22236j jVar6 = this.f62991a;
                int i15 = jVar6.f63009m;
                if (intValue <= i15) {
                    jVar6.f62999c.setCurrentItem(0);
                    i2 = this.f62991a.f63009m;
                } else {
                    jVar6.f62999c.setCurrentItem(intValue - i15);
                    i2 = intValue;
                }
                C22236j jVar7 = this.f62991a;
                if (i2 == jVar7.f63009m) {
                    C22236j.m25765a(jVar7, i4, i2, jVar7.f63011o, 31, jVar7.f63022z, jVar7.f62995A);
                } else {
                    C22236j.m25765a(jVar7, i4, i2, 1, 31, jVar7.f63022z, jVar7.f62995A);
                }
            } else if (i4 == i6) {
                jVar4.f62999c.setAdapter(new C21234c(1, jVar4.f63010n, new C87961b(jVar4.f62996B)));
                if (currentItem > this.f62991a.f62999c.getAdapter().getItemsCount() - 1) {
                    currentItem = this.f62991a.f62999c.getAdapter().getItemsCount() - 1;
                    this.f62991a.f62999c.setCurrentItem(currentItem);
                }
                C22236j jVar8 = this.f62991a;
                int i16 = jVar8.f63010n;
                if (intValue >= i16) {
                    jVar8.f62999c.setCurrentItem(i16 - 1);
                } else {
                    jVar8.f62999c.setCurrentItem(intValue - 1);
                }
                int i17 = currentItem + 1;
                C22236j jVar9 = this.f62991a;
                if (i17 == jVar9.f63010n) {
                    C22236j.m25765a(jVar9, i4, i17, 1, jVar9.f63012p, jVar9.f63022z, jVar9.f62995A);
                } else {
                    C22236j.m25765a(jVar9, i4, i17, 1, 31, jVar9.f63022z, jVar9.f62995A);
                }
            } else {
                jVar4.f62999c.setAdapter(new C21234c(1, 12, new C87961b(jVar4.f62996B)));
                this.f62991a.f62999c.setCurrentItem(intValue - 1);
                C22236j jVar10 = this.f62991a;
                int currentItem2 = jVar10.f62999c.getCurrentItem() + 1;
                C22236j jVar11 = this.f62991a;
                C22236j.m25765a(jVar10, i4, currentItem2, 1, 31, jVar11.f63022z, jVar11.f62995A);
            }
        } else {
            jVar2.f62999c.mo22032e(0);
            this.f62991a.f63000d.mo22032e(0);
            this.f62991a.f62999c.invalidate();
            this.f62991a.f63000d.invalidate();
        }
        C22081a aVar = this.f62991a.f63020x;
        if (aVar != null) {
            ((C22229c) aVar).mo35388a();
        }
    }
}
