package dz0;

import com.tencent.p014mm.plugin.card.base.CardBaseUI;
import f40.C86709a0;
import hz0.C46156r;
import java.util.LinkedList;
import wz0.C53248d;

/* renamed from: dz0.a */
public class C45496a extends C53248d.C53257i {

    /* renamed from: a */
    public final /* synthetic */ String f123145a;

    /* renamed from: b */
    public final /* synthetic */ CardBaseUI f123146b;

    public C45496a(CardBaseUI cardBaseUI, String str) {
        this.f123146b = cardBaseUI;
        this.f123145a = str;
    }

    /* renamed from: b */
    public void mo23409b(String str) {
        CardBaseUI cardBaseUI = this.f123146b;
        String str2 = this.f123145a;
        int i = CardBaseUI.f109698v;
        cardBaseUI.getClass();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str2);
        cardBaseUI.f109705j = false;
        cardBaseUI.mo63761W7(true);
        C86709a0.m107529k().f251779b.mo123460f(new C46156r(linkedList));
    }
}
