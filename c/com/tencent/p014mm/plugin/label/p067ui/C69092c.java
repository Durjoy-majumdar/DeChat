package com.tencent.p014mm.plugin.label.p067ui;

import a22.C27740g;
import a22.C67001a;
import b22.C28250a;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI;
import com.tencent.p014mm.plugin.label.p067ui.widget.MMLabelPanel;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import e22.C75499c0;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.label.ui.c */
public class C69092c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelUI f198678d;

    public C69092c(ContactLabelUI contactLabelUI) {
        this.f198678d = contactLabelUI;
    }

    public void run() {
        List<String> list;
        this.f198678d.f198642C = C27740g.vx0().mo100947TE();
        ContactLabelUI contactLabelUI = this.f198678d;
        if (!contactLabelUI.f198649J) {
            contactLabelUI.f198640A.addAll(contactLabelUI.f198667x);
            this.f198678d.f198649J = true;
        } else {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator<String> it = this.f198678d.f198643D.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!this.f198678d.f198642C.contains(next)) {
                    arrayList2.add(next);
                }
            }
            ContactLabelUI contactLabelUI2 = this.f198678d;
            if (contactLabelUI2.f198644E) {
                C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(contactLabelUI2.f198665v);
                if (Lo != null) {
                    contactLabelUI2.f198666w = Lo.field_contactLabels;
                    list = ((C67001a) C28250a.m38138a()).mo90969g(contactLabelUI2.f198666w);
                } else {
                    list = null;
                }
            } else {
                contactLabelUI2.f198666w = C97625j3.m125812b().mo105907v().get(contactLabelUI2.f198665v).mo73974r2();
                list = ((C67001a) C28250a.m38138a()).mo90972j(contactLabelUI2.f198666w);
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            ArrayList<String> arrayList4 = this.f198678d.f198667x;
            if (arrayList4 != null) {
                Iterator<String> it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    String next2 = it4.next();
                    if (!list.contains(next2)) {
                        arrayList3.add(next2);
                    }
                }
                this.f198678d.f198667x.clear();
                this.f198678d.f198667x.addAll(list);
            }
            Iterator<String> it5 = this.f198678d.f198656j.getSelectTagList().iterator();
            while (it5.hasNext()) {
                String next3 = it5.next();
                if (!arrayList2.contains(next3)) {
                    if (!arrayList.contains(next3) && !arrayList3.contains(next3)) {
                        arrayList.add(next3);
                    }
                    if (this.f198678d.f198669z.contains(next3)) {
                        hashSet.add(next3);
                    }
                }
            }
            for (String str : list) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            Iterator<String> it6 = this.f198678d.f198642C.iterator();
            while (it6.hasNext()) {
                String next4 = it6.next();
                if (!arrayList2.contains(next4) && this.f198678d.f198668y.contains(next4)) {
                    hashSet2.add(next4);
                }
            }
            this.f198678d.f198668y.clear();
            this.f198678d.f198668y.addAll(hashSet2);
            this.f198678d.f198669z.clear();
            this.f198678d.f198640A.clear();
            this.f198678d.f198669z.addAll(hashSet);
            this.f198678d.f198640A.addAll(arrayList);
            this.f198678d.f198643D.clear();
            ContactLabelUI contactLabelUI3 = this.f198678d;
            contactLabelUI3.f198643D.addAll(contactLabelUI3.f198642C);
        }
        ContactLabelUI contactLabelUI4 = this.f198678d;
        MMLabelPanel mMLabelPanel = contactLabelUI4.f198656j;
        ArrayList<String> arrayList5 = contactLabelUI4.f198640A;
        mMLabelPanel.mo95190q(arrayList5, arrayList5);
        ContactLabelUI contactLabelUI5 = this.f198678d;
        if (contactLabelUI5.f198661r != null) {
            ArrayList<String> arrayList6 = contactLabelUI5.f198642C;
            if (arrayList6 == null || arrayList6.size() <= 0) {
                ContactLabelUI contactLabelUI6 = this.f198678d;
                contactLabelUI6.f198661r.mo95190q(contactLabelUI6.f198640A, contactLabelUI6.f198642C);
                if (this.f198678d.f198648I) {
                    C115669n.INSTANCE.mo160131h(11346, 0, 0);
                    this.f198678d.f198648I = false;
                }
            } else {
                ContactLabelUI contactLabelUI7 = this.f198678d;
                if (contactLabelUI7.f198644E) {
                    contactLabelUI7.f198661r.mo95190q(contactLabelUI7.f198640A, contactLabelUI7.f198642C);
                } else {
                    contactLabelUI7.f198661r.mo95190q(contactLabelUI7.f198640A, contactLabelUI7.f198642C);
                }
                if (this.f198678d.f198648I) {
                    C115669n.INSTANCE.mo160131h(11346, 0, 1);
                    this.f198678d.f198648I = false;
                }
            }
        }
        ContactLabelUI contactLabelUI8 = this.f198678d;
        ArrayList<String> arrayList7 = contactLabelUI8.f198667x;
        contactLabelUI8.getClass();
        if (arrayList7 != null && arrayList7.size() > 0) {
            MMHandlerThread.postToMainThreadDelayed(new C75499c0(contactLabelUI8), 50);
        }
        this.f198678d.mo95160Q7(ContactLabelUI.C69089f.Normal);
    }
}
