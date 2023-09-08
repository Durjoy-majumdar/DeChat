package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import com.tencent.p014mm.plugin.record.p094ui.C94356i;
import com.tencent.p014mm.plugin.record.p094ui.viewWrappers.ImageViewWrapper;
import java.util.LinkedList;
import java.util.List;
import og2.C100339h;
import og2.C100344n;
import sg2.C101617b;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.record.ui.f */
public class C94353f extends C94356i implements C100339h {

    /* renamed from: y */
    public int f272707y = 0;

    public C94353f(Context context, C94356i.C94359c cVar) {
        super(context, cVar);
    }

    /* renamed from: b */
    public int mo129739b() {
        return this.f272707y;
    }

    /* renamed from: g */
    public void mo129740g(C101617b bVar) {
        bVar.f297468e = 0;
        bVar.f297469f = this.f272707y;
        bVar.f297470g = this.f272724u;
        C94346a aVar = this.f272721r;
        bVar.f297466c = ((C94354g) aVar).f272708c;
        bVar.f297467d = ((C94354g) aVar).f272709d;
    }

    /* renamed from: h */
    public void mo129741h(C94346a aVar) {
        if (aVar != null) {
            this.f272721r = aVar;
            ((LinkedList) this.f272720q).clear();
            List<C101834rc0> list = aVar.f272698a;
            if (list != null) {
                ((LinkedList) this.f272720q).addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: i */
    public ImageViewWrapper mo129744i(ImageViewWrapper imageViewWrapper) {
        imageViewWrapper.f272766i = this.f272707y;
        return imageViewWrapper;
    }

    /* renamed from: i1 */
    public void mo128649i1(int i, C100344n nVar) {
        this.f272713g.post(this.f272727x);
    }
}
