package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import bl3.C0324s;
import com.tencent.p014mm.p136ui.component.UIComponent;
import dp1.C58375j;
import gy3.C24560g0;
import gy3.C87412m;
import ht1.C8757a2;
import ht1.C8766f5;
import ht1.C8768g2;
import ht1.C8773i2;
import ht1.C8776j2;
import ht1.C8780k2;
import ht1.C8787n2;
import ht1.C8789o2;
import ht1.C8791o4;
import ht1.C8792p1;
import ht1.C8796q4;
import ht1.C8800r1;
import ht1.C8803s2;
import ht1.C8804s4;
import ht1.C8817y2;
import ht1.C8818z1;
import ht1.C8820z3;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI */
public abstract class MMFinderFeedDetailUI extends MMFinderUI {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f161157i = true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8804s4.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8757a2.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8796q4.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8768g2.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8766f5.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8787n2.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8773i2.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8820z3.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8800r1.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8791o4.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8818z1.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8817y2.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8776j2.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8792p1.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8789o2.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8780k2.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8803s2.class)));
        hashSet.add(C58375j.class);
    }
}
