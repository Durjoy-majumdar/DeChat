package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import di3.C86312j;
import hb2.C59822f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import la2.C99364n;
import nb2.C61646d;
import p529fv.C59331r;
import qc0.C101106m;
import te3.C64488kb1;
import te3.C64519lb1;
import te3.C64719t23;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.n */
public class C56978n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMainUINew f163186d;

    public C56978n(MusicMainUINew musicMainUINew) {
        this.f163186d = musicMainUINew;
    }

    public void onClick(View view) {
        LinkedList<FinderMedia> linkedList;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMainUINew musicMainUINew = this.f163186d;
        C64488kb1 b = musicMainUINew.f163159z.mo80430b(musicMainUINew.getContext());
        C64719t23 t232 = new C64719t23();
        String str = "";
        if (((ArrayList) musicMainUINew.f163147n).size() > 0) {
            C59822f fVar = ((C61646d) ((ArrayList) musicMainUINew.f163147n).get(0)).f175298d;
            C59822f.C59823a aVar = C59822f.f170752A;
            if (aVar.mo84779d(fVar) != null) {
                FinderObject d = aVar.mo84779d(fVar);
                t232.f185459d = String.valueOf(d.f164794id);
                t232.f185460e = d.objectNonceId;
                FinderObjectDesc finderObjectDesc = d.objectDesc;
                if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || linkedList.size() <= 0)) {
                    t232.f185461f = d.objectDesc.media.getFirst().thumbUrl + d.objectDesc.media.getFirst().thumb_url_token;
                }
                FinderContact finderContact = d.contact;
                t232.f185462g = finderContact != null ? finderContact.nickname : str;
            }
        }
        C101106m k = C99364n.m129616h().mo138832k();
        t232.f185463h = b.f183905e;
        t232.f185464i = b.f183911n;
        t232.f185466n = b.f183913p;
        t232.f185467o = b.f183915r;
        t232.f185468p = b.f183917t;
        t232.f185469q = b.f183918u;
        t232.f185465j = b.f183916s;
        C64519lb1 lb12 = b.f183921x;
        if (lb12 != null) {
            str = lb12.f184069d;
        }
        t232.f185471s = str;
        if (!TextUtils.isEmpty(b.f183922y) || k == null) {
            t232.f185470r = b.f183922y;
        } else {
            t232.f185470r = k.f295954P;
        }
        C56994w wVar = C56994w.f163218a;
        C56994w.f163219b.f156848q = 0;
        wVar.mo80436a(255);
        ((C59331r) C86312j.m106911c(C59331r.class)).hd0(k, b, musicMainUINew.getContext(), t232);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
