package com.tencent.p014mm.plugin.story.p108ui.view;

import com.tencent.p014mm.sdk.platformtools.Util;
import ew2.C97757a;
import ew2.C97758b;
import gw2.C98261f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lw2.C99705o;
import qo3.C47883u;

/* renamed from: com.tencent.mm.plugin.story.ui.view.c */
public final class C96409c implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ StoryMsgView f282005a;

    /* renamed from: b */
    public final /* synthetic */ C97757a f282006b;

    public C96409c(StoryMsgView storyMsgView, C97757a aVar) {
        this.f282005a = storyMsgView;
        this.f282006b = aVar;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        Integer num;
        List list;
        List list2;
        ArrayList<C97757a> arrayList;
        LinkedList<C97757a> linkedList;
        LinkedList<C97757a> linkedList2;
        int i;
        if (z) {
            StoryMsgView storyMsgView = this.f282005a;
            C97757a aVar = this.f282006b;
            int i2 = StoryMsgView.f281961H;
            storyMsgView.getClass();
            C97758b.f286820d.mo137091e(aVar.f286811d, aVar.f286812e, storyMsgView.f281988z, aVar.f286809b);
            C98261f fVar = storyMsgView.f281979q;
            if (fVar == null || (linkedList2 = fVar.f288075h) == null) {
                num = null;
            } else {
                Iterator<C97757a> it = linkedList2.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    C97757a next = it.next();
                    int i4 = aVar.f286812e;
                    if ((i4 == 0 || (i = next.f286812e) == 0) ? Util.isEqual(next.f286809b, aVar.f286809b) : i == i4) {
                        break;
                    }
                    i3++;
                }
                num = Integer.valueOf(i3);
            }
            if (num != null && num.intValue() != -1) {
                C98261f fVar2 = storyMsgView.f281979q;
                if (!(fVar2 == null || (linkedList = fVar2.f288075h) == null)) {
                    C97757a remove = linkedList.remove(num.intValue());
                }
                C99705o oVar = storyMsgView.f281977o;
                if (!(oVar == null || (arrayList = oVar.f292230f) == null)) {
                    C97757a remove2 = arrayList.remove(num.intValue());
                }
                if (storyMsgView.f281980r) {
                    StoryMsgListView storyMsgListView = storyMsgView.f281978p.get(1);
                    C98261f fVar3 = storyMsgView.f281979q;
                    if (fVar3 == null || (list2 = fVar3.f288075h) == null) {
                        list2 = new ArrayList();
                    }
                    storyMsgListView.mo134292c(list2);
                } else {
                    StoryMsgListView storyMsgListView2 = storyMsgView.f281978p.get(0);
                    C98261f fVar4 = storyMsgView.f281979q;
                    if (fVar4 == null || (list = fVar4.f288075h) == null) {
                        list = new ArrayList();
                    }
                    storyMsgListView2.mo134292c(list);
                }
                C98261f fVar5 = storyMsgView.f281979q;
                if (fVar5 != null) {
                    storyMsgView.f281976n.mo134216e(fVar5);
                }
            }
        }
    }
}
