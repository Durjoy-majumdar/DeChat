package yz1;

import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.picker.CustomDatePicker;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import yz1.C23385k;

/* renamed from: yz1.t */
public class C23387t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GroupSolitatireEditUI f67147d;

    /* renamed from: yz1.t$a */
    public class C23388a implements C23385k.C23386a {
        public C23388a() {
        }
    }

    public C23387t(GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f67147d = groupSolitatireEditUI;
    }

    public void onClick(View view) {
        CustomDatePicker customDatePicker;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        GroupSolitatireEditUI groupSolitatireEditUI = this.f67147d;
        int i = GroupSolitatireEditUI.f198377U;
        groupSolitatireEditUI.mo95047Q7();
        View view2 = this.f67147d.f198412v;
        if ((view2 instanceof MMEditText) && (view2.getParent() instanceof RelativeLayout)) {
            ((RelativeLayout) this.f67147d.f198412v.getParent()).setTag(1);
        }
        C23385k kVar = new C23385k(this.f67147d);
        CustomDatePicker customDatePicker2 = kVar.f67145i;
        int year = customDatePicker2 != null ? customDatePicker2.getYear() : 0;
        CustomDatePicker customDatePicker3 = kVar.f67145i;
        int month = customDatePicker3 != null ? customDatePicker3.getMonth() : 0;
        CustomDatePicker customDatePicker4 = kVar.f67145i;
        int dayOfMonth = customDatePicker4 != null ? customDatePicker4.getDayOfMonth() : 0;
        kVar.f67146j = new C23388a();
        if (year >= 0 && month >= 0 && dayOfMonth >= 0 && (customDatePicker = kVar.f67145i) != null) {
            customDatePicker.mo26460a(year, month, dayOfMonth);
        }
        Locale locale = Locale.US;
        Calendar instance = Calendar.getInstance(locale);
        instance.set(2009, 0, 1);
        CustomDatePicker customDatePicker5 = kVar.f67145i;
        if (customDatePicker5 != null) {
            customDatePicker5.setMinDate(instance.getTimeInMillis());
        }
        Calendar instance2 = Calendar.getInstance(locale);
        instance2.set(2029, 11, 31);
        CustomDatePicker customDatePicker6 = kVar.f67145i;
        if (customDatePicker6 != null) {
            customDatePicker6.setMaxDate(instance2.getTimeInMillis());
        }
        if (kVar.f67140d != null) {
            CustomDatePicker customDatePicker7 = kVar.f67145i;
            if (customDatePicker7 != null) {
                customDatePicker7.mo26462c();
            }
            kVar.f67140d.show();
        }
        this.f67147d.mo95042L7(0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
