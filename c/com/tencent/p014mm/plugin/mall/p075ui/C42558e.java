package com.tencent.p014mm.plugin.mall.p075ui;

import b63.C67197o;
import com.tencent.p014mm.plugin.mall.p075ui.MallFunctionSettingsUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import pe3.C89349b;
import te3.C51676vb3;
import te3.C52221z52;

/* renamed from: com.tencent.mm.plugin.mall.ui.e */
public class C42558e implements C87581a<Object, C89132b.C89134c<C52221z52>> {

    /* renamed from: a */
    public final /* synthetic */ MallFunctionSettingsUI f115159a;

    public C42558e(MallFunctionSettingsUI mallFunctionSettingsUI) {
        this.f115159a = mallFunctionSettingsUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.MallFunctionSettingsUI", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            MallFunctionSettingsUI mallFunctionSettingsUI = this.f115159a;
            C52221z52 z522 = (C52221z52) cVar.f256796d;
            int i = MallFunctionSettingsUI.f115100o;
            mallFunctionSettingsUI.getClass();
            C89349b bVar = z522.f145711e;
            if (bVar != null) {
                mallFunctionSettingsUI.f115103f.setText(bVar.mo123705h());
            }
            C89349b bVar2 = z522.f145712f;
            if (bVar2 != null) {
                mallFunctionSettingsUI.f115104g.setText(bVar2.mo123705h());
            }
            MallFunctionSettingsUI mallFunctionSettingsUI2 = this.f115159a;
            LinkedList<C51676vb3> linkedList = ((C52221z52) cVar.f256796d).f145710d;
            mallFunctionSettingsUI2.getClass();
            if (linkedList != null) {
                int i2 = -1;
                for (C51676vb3 next : linkedList) {
                    if (i2 != next.f143422i) {
                        MallFunctionSettingsUI.C42544b bVar3 = new MallFunctionSettingsUI.C42544b();
                        bVar3.f115110a = 0;
                        bVar3.f115112c = next.f143423j;
                        ((ArrayList) mallFunctionSettingsUI2.f115107j).add(bVar3);
                        if (((ArrayList) mallFunctionSettingsUI2.f115107j).size() - 2 >= 0) {
                            ArrayList arrayList = (ArrayList) mallFunctionSettingsUI2.f115107j;
                            ((MallFunctionSettingsUI.C42544b) arrayList.get(arrayList.size() - 2)).f115113d = true;
                        }
                    }
                    MallFunctionSettingsUI.C42544b bVar4 = new MallFunctionSettingsUI.C42544b();
                    bVar4.f115110a = 1;
                    bVar4.f115111b = next;
                    ((ArrayList) mallFunctionSettingsUI2.f115107j).add(bVar4);
                    i2 = next.f143422i;
                }
                if (!((ArrayList) mallFunctionSettingsUI2.f115107j).isEmpty()) {
                    ArrayList arrayList2 = (ArrayList) mallFunctionSettingsUI2.f115107j;
                    ((MallFunctionSettingsUI.C42544b) arrayList2.get(arrayList2.size() - 1)).f115113d = true;
                }
            }
            this.f115159a.f115105h.notifyDataSetChanged();
            return null;
        }
        C67197o.m79488c(cVar.f256794b, cVar.f256795c).mo91297a(this.f115159a.getContext(), true);
        return null;
    }
}
