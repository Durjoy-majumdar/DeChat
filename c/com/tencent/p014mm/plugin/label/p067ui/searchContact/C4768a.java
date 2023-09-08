package com.tencent.p014mm.plugin.label.p067ui.searchContact;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.storage.C72996z1;
import f22.C58909a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import jq3.C60897k;
import jq3.C9493c;

/* renamed from: com.tencent.mm.plugin.label.ui.searchContact.a */
public final class C4768a implements C60897k<C58909a> {

    /* renamed from: a */
    public final /* synthetic */ ContactManagerUI f19809a;

    public C4768a(ContactManagerUI contactManagerUI) {
        this.f19809a = contactManagerUI;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C60897k.C9501a.m9192a(this, view, (C58909a) cVar, i);
        return false;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C58909a) cVar, i);
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        ArrayList<C58909a> arrayList;
        ArrayList<C58909a> arrayList2;
        C58909a aVar = (C58909a) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "data");
        ContactManagerUI contactManagerUI = this.f19809a;
        int i2 = ContactManagerUI.f19780z;
        contactManagerUI.getClass();
        if (view.getTag() instanceof C58909a.C58910a) {
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.searchContact.ContactDataItem.ContactViewHolder");
            if (((C58909a.C58910a) tag).f168577K != null) {
                Object tag2 = view.getTag();
                C87412m.m108592e(tag2, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.searchContact.ContactDataItem.ContactViewHolder");
                CheckBox checkBox = ((C58909a.C58910a) tag2).f168577K;
                if (checkBox != null) {
                    checkBox.setChecked(!checkBox.isChecked());
                }
                String str = null;
                if (checkBox.isChecked()) {
                    ContactDataItemList I7 = contactManagerUI.mo5663I7();
                    C87412m.m108591d(I7);
                    List<String> list = I7.f19778x;
                    C72996z1 z1Var = aVar.f168570n;
                    if (z1Var != null) {
                        str = z1Var.getUsername();
                    }
                    list.add(String.valueOf(str));
                    ContactDataItemList I72 = contactManagerUI.mo5663I7();
                    if (!(I72 == null || (arrayList2 = I72.f19779y) == null)) {
                        arrayList2.add(aVar);
                    }
                } else {
                    ContactDataItemList I73 = contactManagerUI.mo5663I7();
                    C87412m.m108591d(I73);
                    List<String> list2 = I73.f19778x;
                    C72996z1 z1Var2 = aVar.f168570n;
                    if (z1Var2 != null) {
                        str = z1Var2.getUsername();
                    }
                    list2.remove(String.valueOf(str));
                    ContactDataItemList I74 = contactManagerUI.mo5663I7();
                    if (!(I74 == null || (arrayList = I74.f19779y) == null)) {
                        arrayList.remove(aVar);
                    }
                }
                contactManagerUI.mo5664J7();
            }
        }
    }
}
