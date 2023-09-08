package com.tencent.p014mm.plugin.finder.live.view;

import al1.C54130j;
import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.q */
public final class C56093q implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C56081l f159955d;

    public C56093q(C56081l lVar) {
        this.f159955d = lVar;
    }

    public void afterTextChanged(Editable editable) {
        int i;
        int i2;
        if (this.f159955d.f159932q.getVisibility() != 0) {
            int i3 = C56081l.f159917F;
            Log.m105924i("Finder.FinderLiveApplyLinkVisitorView", "skip search list, list is nil");
            return;
        }
        Editable text = this.f159955d.f159925g.getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null || obj.length() == 0) {
            this.f159955d.f159929n.setVisibility(8);
            return;
        }
        this.f159955d.f159929n.setVisibility(0);
        C56081l lVar = this.f159955d;
        lVar.getClass();
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<C54130j> arrayList2 = lVar.f159940y;
            ArrayList arrayList3 = new ArrayList();
            Iterator<C54130j> it = arrayList2.iterator();
            while (it.hasNext()) {
                C54130j next = it.next();
                String str = next.f152000d;
                if (str != null) {
                    i = -1;
                    i2 = C112550d0.m153769E(str, obj, 0, false, 6, (Object) null);
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 != i) {
                    arrayList3.add(next);
                }
            }
            arrayList.addAll(arrayList3);
            Log.m105924i("Finder.FinderLiveApplyLinkVisitorView", "loadSearchData keyword:" + obj + " size:" + arrayList.size());
            lVar.f159919B.mo88151O4(arrayList, obj);
            lVar.f159919B.notifyDataSetChanged();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
