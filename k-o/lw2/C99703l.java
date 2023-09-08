package lw2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryItemView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gw2.C98266k;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: lw2.l */
public final class C99703l extends RecyclerView.C16613e<C99704m> {

    /* renamed from: d */
    public final int f292218d;

    /* renamed from: e */
    public final int f292219e;

    /* renamed from: f */
    public final ArrayList<C98266k> f292220f = new ArrayList<>();

    /* renamed from: g */
    public boolean f292221g;

    public C99703l(int i, int i2) {
        this.f292218d = i;
        this.f292219e = i2;
    }

    public int getItemCount() {
        return this.f292220f.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x038f A[EDGE_INSN: B:151:0x038f->B:107:0x038f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0370  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r31, int r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            r2 = r31
            lw2.m r2 = (lw2.C99704m) r2
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r2, r3)
            java.util.ArrayList<gw2.k> r3 = r0.f292220f
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "flipItems[position]"
            gy3.C87412m.m108593f(r3, r4)
            gw2.k r3 = (gw2.C98266k) r3
            boolean r4 = r0.f292221g
            r2.f292226E = r3
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r5 = r2.f292227z
            r5.setPosition(r1)
            r2.mo139067y()
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r1 = r2.f292223B
            gw2.f r5 = r3.f288083f
            gw2.l r6 = r3.f288079b
            kw2.i r7 = r3.f288078a
            r1.getClass()
            java.lang.String r8 = "comment"
            gy3.C87412m.m108594g(r5, r8)
            java.lang.String r9 = "scene"
            gy3.C87412m.m108594g(r6, r9)
            java.lang.String r6 = "story"
            gy3.C87412m.m108594g(r7, r6)
            r1.f281979q = r5
            long r10 = r5.f288069b
            r1.f281985w = r10
            java.lang.String r10 = r5.f288068a
            r1.f281983u = r10
            java.util.LinkedList<ew2.a> r10 = r5.f288077j
            boolean r11 = r10 instanceof java.util.Collection
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            if (r11 == 0) goto L_0x005e
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x005e
            goto L_0x007e
        L_0x005e:
            java.util.Iterator r10 = r10.iterator()
        L_0x0062:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x007e
            java.lang.Object r11 = r10.next()
            ew2.a r11 = (ew2.C97757a) r11
            java.lang.String r11 = r11.f286808a
            com.tencent.mm.plugin.story.model.StoryCore$h r15 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            java.lang.String r15 = r15.mo134187e()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r11, (java.lang.String) r15)
            if (r11 == 0) goto L_0x0062
            r10 = 1
            goto L_0x007f
        L_0x007e:
            r10 = 0
        L_0x007f:
            r1.f281981s = r10
            lw2.o r10 = r1.f281977o
            if (r10 != 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r10.f292233i = r7
        L_0x0088:
            if (r10 == 0) goto L_0x0091
            java.util.ArrayList<ew2.a> r7 = r10.f292229e
            if (r7 == 0) goto L_0x0091
            r7.clear()
        L_0x0091:
            lw2.o r7 = r1.f281977o
            if (r7 == 0) goto L_0x009c
            java.util.ArrayList<ew2.a> r7 = r7.f292230f
            if (r7 == 0) goto L_0x009c
            r7.clear()
        L_0x009c:
            com.tencent.mm.plugin.story.model.StoryCore$h r7 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            java.lang.String r10 = r7.mo134187e()
            java.lang.String r11 = r5.f288068a
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r11)
            r1.f281980r = r10
            lw2.o r11 = r1.f281977o
            if (r11 != 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r11.f292228d = r10
        L_0x00b1:
            if (r11 == 0) goto L_0x00bc
            java.util.ArrayList<ew2.a> r10 = r11.f292229e
            if (r10 == 0) goto L_0x00bc
            java.util.LinkedList<ew2.a> r11 = r5.f288077j
            r10.addAll(r11)
        L_0x00bc:
            lw2.o r10 = r1.f281977o
            if (r10 == 0) goto L_0x00c9
            java.util.ArrayList<ew2.a> r10 = r10.f292230f
            if (r10 == 0) goto L_0x00c9
            java.util.LinkedList<ew2.a> r11 = r5.f288075h
            r10.addAll(r11)
        L_0x00c9:
            java.util.ArrayList<com.tencent.mm.plugin.story.ui.view.StoryMsgListView> r10 = r1.f281978p
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0120
            boolean r10 = r1.f281980r
            java.lang.String r11 = "context"
            if (r10 == 0) goto L_0x00fa
            java.util.ArrayList<com.tencent.mm.plugin.story.ui.view.StoryMsgListView> r10 = r1.f281978p
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView r15 = new com.tencent.mm.plugin.story.ui.view.StoryMsgListView
            android.content.Context r12 = r1.getContext()
            gy3.C87412m.m108593f(r12, r11)
            r15.<init>(r12)
            r10.add(r15)
            java.util.ArrayList<com.tencent.mm.plugin.story.ui.view.StoryMsgListView> r10 = r1.f281978p
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView r12 = new com.tencent.mm.plugin.story.ui.view.StoryMsgListView
            android.content.Context r15 = r1.getContext()
            gy3.C87412m.m108593f(r15, r11)
            r12.<init>(r15)
            r10.add(r12)
            goto L_0x010b
        L_0x00fa:
            java.util.ArrayList<com.tencent.mm.plugin.story.ui.view.StoryMsgListView> r10 = r1.f281978p
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView r12 = new com.tencent.mm.plugin.story.ui.view.StoryMsgListView
            android.content.Context r15 = r1.getContext()
            gy3.C87412m.m108593f(r15, r11)
            r12.<init>(r15)
            r10.add(r12)
        L_0x010b:
            lw2.o r10 = r1.f281977o
            if (r10 == 0) goto L_0x0118
            java.util.ArrayList<com.tencent.mm.plugin.story.ui.view.StoryMsgListView> r10 = r10.f292231g
            if (r10 == 0) goto L_0x0118
            java.util.ArrayList<com.tencent.mm.plugin.story.ui.view.StoryMsgListView> r11 = r1.f281978p
            r10.addAll(r11)
        L_0x0118:
            lw2.o r10 = r1.f281977o
            if (r10 == 0) goto L_0x014d
            r10.notifyDataSetChanged()
            goto L_0x014d
        L_0x0120:
            boolean r10 = r1.f281980r
            if (r10 == 0) goto L_0x0140
            java.util.ArrayList<com.tencent.mm.plugin.story.ui.view.StoryMsgListView> r10 = r1.f281978p
            java.lang.Object r10 = r10.get(r13)
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView r10 = (com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgListView) r10
            java.util.LinkedList<ew2.a> r11 = r5.f288077j
            r10.mo134292c(r11)
            java.util.ArrayList<com.tencent.mm.plugin.story.ui.view.StoryMsgListView> r10 = r1.f281978p
            r11 = 1
            java.lang.Object r10 = r10.get(r11)
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView r10 = (com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgListView) r10
            java.util.LinkedList<ew2.a> r11 = r5.f288075h
            r10.mo134292c(r11)
            goto L_0x014d
        L_0x0140:
            java.util.ArrayList<com.tencent.mm.plugin.story.ui.view.StoryMsgListView> r10 = r1.f281978p
            java.lang.Object r10 = r10.get(r13)
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView r10 = (com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgListView) r10
            java.util.LinkedList<ew2.a> r11 = r5.f288075h
            r10.mo134292c(r11)
        L_0x014d:
            com.tencent.mm.plugin.story.ui.view.StoryActionView r1 = r1.f281976n
            r1.setup(r5)
            com.tencent.mm.plugin.story.ui.view.StoryCommentView r1 = r2.f292222A
            gw2.f r5 = r3.f288083f
            gw2.l r10 = r3.f288079b
            kw2.i r11 = r3.f288078a
            r1.getClass()
            gy3.C87412m.m108594g(r5, r8)
            gy3.C87412m.m108594g(r10, r9)
            gy3.C87412m.m108594g(r11, r6)
            gw2.f r6 = r1.f281900s
            gy3.C87412m.m108589b(r6, r5)
            r1.f281900s = r5
            long r8 = r5.f288069b
            r1.f281901t = r8
            java.lang.String r6 = r5.f288068a
            r1.f281898q = r6
            java.lang.Class<f62.k0> r6 = f62.C75700k0.class
            k40.a r6 = f40.C86709a0.m107533q(r6)
            f62.k0 r6 = (f62.C75700k0) r6
            com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()
            java.lang.String r8 = r1.f281898q
            boolean r6 = r6.mo69724s3(r8)
            r1.f281896o = r6
            java.lang.String r6 = r7.mo134187e()
            java.lang.String r7 = r1.f281898q
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            r1.f281897p = r6
            r1.f281883I = r4
            int r4 = r10.ordinal()
            r6 = 2
            r7 = 0
            if (r4 == 0) goto L_0x01fb
            r8 = 1
            if (r4 == r8) goto L_0x01a4
            goto L_0x0245
        L_0x01a4:
            gw2.f r4 = r1.f281900s
            java.util.LinkedList<ew2.a> r4 = r4.f288074g
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b1:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x01c6
            java.lang.Object r9 = r4.next()
            r10 = r9
            ew2.a r10 = (ew2.C97757a) r10
            boolean r10 = r10.f286813f
            if (r10 == 0) goto L_0x01b1
            r8.add(r9)
            goto L_0x01b1
        L_0x01c6:
            boolean r4 = r8.isEmpty()
            r9 = 1
            r4 = r4 ^ r9
            if (r4 == 0) goto L_0x01e7
            com.tencent.mm.plugin.story.ui.view.CommentsContainer r4 = r1.f281888d
            r4.getClass()
            r4.f206308o = r9
            java.util.ArrayList<ew2.a> r6 = r4.f206301e
            r6.clear()
            java.util.ArrayList<ew2.a> r6 = r4.f206301e
            r6.addAll(r8)
            r6 = -1
            r4.f206302f = r6
            r8 = 4000(0xfa0, double:1.9763E-320)
            r4.f206304h = r8
            goto L_0x01f0
        L_0x01e7:
            com.tencent.mm.plugin.story.ui.view.CommentsContainer r4 = r1.f281888d
            gw2.f r8 = r1.f281900s
            java.util.LinkedList<ew2.a> r8 = r8.f288074g
            com.tencent.p014mm.plugin.story.p108ui.view.CommentsContainer.m83735d(r4, r8, r13, r6, r7)
        L_0x01f0:
            com.tencent.mm.plugin.story.ui.view.CommentsContainer r4 = r1.f281888d
            nw2.i r6 = new nw2.i
            r6.<init>(r1)
            r4.setOnLoop(r6)
            goto L_0x0245
        L_0x01fb:
            com.tencent.mm.plugin.story.ui.view.CommentsContainer r4 = r1.f281888d
            gw2.f r8 = r1.f281900s
            java.util.LinkedList<ew2.a> r8 = r8.f288074g
            com.tencent.p014mm.plugin.story.p108ui.view.CommentsContainer.m83735d(r4, r8, r13, r6, r7)
            gw2.f r4 = r1.f281900s
            java.util.LinkedList<ew2.a> r4 = r4.f288074g
            boolean r8 = r4 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0213
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L_0x0213
            goto L_0x0229
        L_0x0213:
            java.util.Iterator r4 = r4.iterator()
        L_0x0217:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0229
            java.lang.Object r8 = r4.next()
            ew2.a r8 = (ew2.C97757a) r8
            boolean r8 = r8.f286813f
            if (r8 == 0) goto L_0x0217
            r4 = 1
            goto L_0x022a
        L_0x0229:
            r4 = 0
        L_0x022a:
            if (r4 == 0) goto L_0x023a
            gw2.f r4 = r1.f281900s
            java.util.LinkedList<ew2.a> r4 = r4.f288074g
            boolean r4 = r4.isEmpty()
            r8 = 1
            r4 = r4 ^ r8
            if (r4 == 0) goto L_0x023a
            r4 = 1
            goto L_0x023b
        L_0x023a:
            r4 = 0
        L_0x023b:
            r5.f288071d = r4
            if (r4 == 0) goto L_0x0243
            r4 = 3
            r1.f281903v = r4
            goto L_0x0245
        L_0x0243:
            r1.f281903v = r6
        L_0x0245:
            java.lang.String r4 = r1.f281898q
            r1.f281877C = r4
            r1.f281878D = r13
            boolean r4 = r1.f281897p
            r6 = 8
            if (r4 == 0) goto L_0x02d6
            android.view.View r4 = r1.f281894j
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r8.mo10233c(r14)
            java.lang.Object[] r16 = r8.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r18 = "setup"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;Lcom/tencent/mm/plugin/story/storage/StoryInfo;Z)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r4
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r8 = r8.mo10231a(r13)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.setVisibility(r8)
            java.lang.String r16 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r17 = "setup"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;Lcom/tencent/mm/plugin/story/storage/StoryInfo;Z)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.View r4 = r1.f281895n
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8.mo10233c(r9)
            java.lang.Object[] r23 = r8.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r25 = "setup"
            java.lang.String r26 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;Lcom/tencent/mm/plugin/story/storage/StoryInfo;Z)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r4
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r8 = r8.mo10231a(r13)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.setVisibility(r8)
            java.lang.String r23 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r24 = "setup"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;Lcom/tencent/mm/plugin/story/storage/StoryInfo;Z)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0359
        L_0x02d6:
            android.view.View r4 = r1.f281895n
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r8.mo10233c(r14)
            java.lang.Object[] r15 = r8.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r17 = "setup"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;Lcom/tencent/mm/plugin/story/storage/StoryInfo;Z)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r4
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r8 = r8.mo10231a(r13)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.setVisibility(r8)
            java.lang.String r15 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r16 = "setup"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;Lcom/tencent/mm/plugin/story/storage/StoryInfo;Z)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.view.View r4 = r1.f281894j
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8.mo10233c(r9)
            java.lang.Object[] r22 = r8.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r24 = "setup"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;Lcom/tencent/mm/plugin/story/storage/StoryInfo;Z)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r4
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r8 = r8.mo10231a(r13)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.setVisibility(r8)
            java.lang.String r22 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r23 = "setup"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;Lcom/tencent/mm/plugin/story/storage/StoryInfo;Z)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
        L_0x0359:
            java.util.LinkedList<ew2.a> r4 = r5.f288074g
            boolean r8 = r4 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0366
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L_0x0366
            goto L_0x038f
        L_0x0366:
            java.util.Iterator r4 = r4.iterator()
        L_0x036a:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x038f
            java.lang.Object r8 = r4.next()
            ew2.a r8 = (ew2.C97757a) r8
            boolean r9 = r8.f286814g
            if (r9 == 0) goto L_0x038a
            java.lang.String r8 = r8.f286808a
            com.tencent.mm.plugin.story.model.StoryCore$h r9 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            java.lang.String r9 = r9.mo134187e()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r9)
            if (r8 == 0) goto L_0x038a
            r8 = 1
            goto L_0x038b
        L_0x038a:
            r8 = 0
        L_0x038b:
            if (r8 == 0) goto L_0x036a
            r4 = 1
            goto L_0x0390
        L_0x038f:
            r4 = 0
        L_0x0390:
            r1.f281904w = r4
            lw2.f r4 = r1.f281890f
            r4.f292191e = r11
            java.util.LinkedList<ew2.a> r5 = r5.f288074g
            r4.mo139061F4(r5)
            boolean r4 = r1.f281896o
            if (r4 == 0) goto L_0x03ad
            boolean r4 = r1.f281897p
            if (r4 != 0) goto L_0x03ad
            nw2.p r4 = r1.f281882H
            nw2.j r5 = new nw2.j
            r5.<init>(r1)
            r4.f293659c = r5
            goto L_0x03b1
        L_0x03ad:
            nw2.p r4 = r1.f281882H
            r4.f293659c = r7
        L_0x03b1:
            r1.f281875A = r7
            java.util.LinkedHashMap<java.lang.String, java.lang.CharSequence> r1 = r1.f281876B
            r1.clear()
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryPostTip r1 = r2.f292225D
            if (r1 == 0) goto L_0x0464
            java.lang.String r2 = "MicroMsg.StoryGalleryPostTip"
            java.lang.String r4 = "updatePostStatus"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r4)
            kw2.i r2 = r3.f288078a
            int r4 = r2.field_localFlag
            r5 = r4 & 6
            if (r5 != 0) goto L_0x03ce
            r11 = 1
            goto L_0x03cf
        L_0x03ce:
            r11 = 0
        L_0x03cf:
            if (r11 == 0) goto L_0x03d6
            r1.setVisibility(r6)
            goto L_0x0464
        L_0x03d6:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x03dc
            r11 = 1
            goto L_0x03dd
        L_0x03dc:
            r11 = 0
        L_0x03dd:
            if (r11 == 0) goto L_0x0444
            r1.setVisibility(r13)
            kw2.i r2 = r3.f288078a
            te3.cc4 r2 = r2.mo138655n2()
            int r2 = r2.f131658g
            r4 = 317(0x13d, float:4.44E-43)
            if (r2 != r4) goto L_0x03ff
            android.widget.TextView r2 = r1.f21294f
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131837553(0x7f114271, float:1.9308304E38)
            java.lang.String r1 = r1.getString(r3)
            r2.setText(r1)
            goto L_0x0464
        L_0x03ff:
            kw2.i r2 = r3.f288078a
            te3.cc4 r2 = r2.mo138655n2()
            int r2 = r2.f131658g
            r4 = 323(0x143, float:4.53E-43)
            if (r2 != r4) goto L_0x0433
            kw2.i r2 = r3.f288078a
            te3.cc4 r2 = r2.mo138655n2()
            java.lang.String r2 = r2.f131663o
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0425
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131837552(0x7f114270, float:1.9308302E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x042d
        L_0x0425:
            kw2.i r2 = r3.f288078a
            te3.cc4 r2 = r2.mo138655n2()
            java.lang.String r2 = r2.f131663o
        L_0x042d:
            android.widget.TextView r1 = r1.f21294f
            r1.setText(r2)
            goto L_0x0464
        L_0x0433:
            android.widget.TextView r2 = r1.f21294f
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131837554(0x7f114272, float:1.9308306E38)
            java.lang.String r1 = r1.getString(r3)
            r2.setText(r1)
            goto L_0x0464
        L_0x0444:
            te3.cc4 r2 = r2.mo138655n2()
            int r2 = r2.f131656e
            r3 = 1
            if (r2 < r3) goto L_0x0461
            r1.setVisibility(r13)
            android.widget.TextView r2 = r1.f21294f
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131837551(0x7f11426f, float:1.93083E38)
            java.lang.String r1 = r1.getString(r3)
            r2.setText(r1)
            goto L_0x0464
        L_0x0461:
            r1.setVisibility(r6)
        L_0x0464:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lw2.C99703l.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        Log.m105924i("MicroMsg.StoryGalleryAdapter", "onCreateViewHolder " + this);
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "parent.context");
        StoryGalleryItemView storyGalleryItemView = new StoryGalleryItemView(context, (AttributeSet) null, 0);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.width = this.f292218d;
        layoutParams.height = this.f292219e;
        storyGalleryItemView.setLayoutParams(layoutParams);
        return new C99704m(storyGalleryItemView);
    }

    public void onViewAttachedToWindow(RecyclerView.C16631z zVar) {
        C99704m mVar = (C99704m) zVar;
        C87412m.m108594g(mVar, "holder");
        Log.m105924i("MicroMsg.StoryGalleryAdapter", "onViewAttachedToWindow " + this);
        super.onViewAttachedToWindow(mVar);
        mVar.mo139067y();
    }
}
