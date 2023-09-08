package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.util.AttributeSet;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import je1.C9377s4;
import kotlin.Metadata;
import p749xh.C102658n6;
import pe3.C89349b;
import te3.C49712hj1;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabMyPostFragment;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment;", "Lob0/n;", "", "getFeedFrom", "getType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment */
public final class MusicMvTabMyPostFragment extends MusicMvTabFragment {

    /* renamed from: w */
    public C89349b f163656w;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicMvTabMyPostFragment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo80601c(C102658n6 n6Var, String str) {
        this.f163633g = n6Var;
        this.f163634h = str;
        String O5 = C66785b.f191882e.mo90662O5();
        C49712hj1 hj12 = r1;
        C49712hj1 hj13 = new C49712hj1();
        hj13.f134675i = 93;
        hj13.f134677n = 93;
        C86709a0.m107524d().mo123460f(new C9377s4(O5, 0, this.f163656w, 0, hj12, 0, 0, false, (String) null, 0, (Integer) null, (Long) null, (String) null, false, false, (Long) null, 65408, (C8480h) null));
    }

    public int getFeedFrom() {
        return 4;
    }

    public int getType() {
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r13 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) sx3.C110818d0.m150916N((r13 = r13.media));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r12, int r13, java.lang.String r14, ob0.C117747y r15) {
        /*
            r11 = this;
            boolean r14 = r15 instanceof je1.C9377s4
            r0 = 1
            r1 = 0
            if (r14 == 0) goto L_0x0097
            if (r12 != 0) goto L_0x0097
            if (r13 != 0) goto L_0x0097
            je1.s4 r15 = (je1.C9377s4) r15
            pe3.b r12 = r15.getLastBuffer()
            r11.f163656w = r12
            ob0.c r12 = r15.f29282o
            ob0.c$d r12 = r12.f127056b
            pe3.a r12 = r12.f127083a
            java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse"
            gy3.C87412m.m108592e(r12, r13)
            com.tencent.mm.protocal.protobuf.FinderUserPageResponse r12 = (com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse) r12
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r12 = r12.object
            if (r12 == 0) goto L_0x0092
            java.util.Iterator r12 = r12.iterator()
        L_0x0028:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0082
            java.lang.Object r13 = r12.next()
            r6 = r13
            com.tencent.mm.protocal.protobuf.FinderObject r6 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r6
            lb2.h r13 = lb2.C61275h.f174381a
            r13.mo86259a(r6)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r13 = r6.objectDesc
            if (r13 == 0) goto L_0x0051
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r13 = r13.media
            if (r13 == 0) goto L_0x0051
            java.lang.Object r13 = sx3.C110818d0.m150916N(r13)
            com.tencent.mm.protocal.protobuf.FinderMedia r13 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r13
            if (r13 == 0) goto L_0x0051
            int r13 = r13.mediaType
            r14 = 2
            if (r13 != r14) goto L_0x0051
            r13 = 0
            goto L_0x0052
        L_0x0051:
            r13 = 1
        L_0x0052:
            int r14 = r6.privateFlag
            if (r14 != r0) goto L_0x0057
            r13 = 0
        L_0x0057:
            if (r13 == 0) goto L_0x0028
            long r3 = r6.f164794id
            java.lang.String r5 = r6.objectNonceId
            java.util.ArrayList r13 = r11.getFeedIdMap()
            java.lang.Long r14 = java.lang.Long.valueOf(r3)
            boolean r13 = r13.contains(r14)
            if (r13 != 0) goto L_0x0028
            java.util.ArrayList r13 = r11.getDataList()
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$c r14 = new com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$c
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$e r10 = new com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$e
            r7 = 0
            r8 = 8
            r9 = 0
            r2 = r10
            r2.<init>(r3, r5, r6, r7, r8, r9)
            r14.<init>(r10)
            r13.add(r14)
            goto L_0x0028
        L_0x0082:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r12 = r11.getAdapter()
            r12.notifyDataSetChanged()
            fy3.a r12 = r11.getOnSceneEndListener()
            if (r12 == 0) goto L_0x0092
            r12.invoke()
        L_0x0092:
            boolean r12 = r15.f29285r
            r11.setHasMore(r12)
        L_0x0097:
            com.tencent.mm.view.RefreshLoadMoreLayout r12 = r11.getRlLayout()
            r12.mo82440F(r1)
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$b r12 = r11.getResultListener()
            if (r12 == 0) goto L_0x00af
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r13 = r11.getAdapter()
            int r13 = r13.getItemCount()
            r12.mo80635a(r0, r13)
        L_0x00af:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r12 = r11.getAdapter()
            if (r12 == 0) goto L_0x00bc
            int r12 = r12.getItemCount()
            if (r12 != 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r12 = 8
            if (r0 == 0) goto L_0x00cc
            android.widget.LinearLayout r13 = r11.getEmptyLL()
            if (r13 != 0) goto L_0x00c8
            goto L_0x00d6
        L_0x00c8:
            r13.setVisibility(r1)
            goto L_0x00d6
        L_0x00cc:
            android.widget.LinearLayout r13 = r11.getEmptyLL()
            if (r13 != 0) goto L_0x00d3
            goto L_0x00d6
        L_0x00d3:
            r13.setVisibility(r12)
        L_0x00d6:
            android.widget.TextView r13 = r11.getLoadingTv()
            if (r13 != 0) goto L_0x00dd
            goto L_0x00e0
        L_0x00dd:
            r13.setVisibility(r12)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMyPostFragment.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvTabMyPostFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C87412m.m108594g(context, "context");
        C86709a0.m107524d().mo123455a(3736, this);
    }
}
