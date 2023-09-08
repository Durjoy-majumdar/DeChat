package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.C40266t1;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.chatroom.ui.s1 */
public final class C40265s1 extends RecyclerView.C16613e<C40266t1> {

    /* renamed from: d */
    public final ArrayList<C72996z1> f108276d;

    /* renamed from: e */
    public C44661m1 f108277e;

    /* renamed from: f */
    public final C40266t1.C40267a f108278f;

    public C40265s1(ArrayList<C72996z1> arrayList, C44661m1 m1Var, C40266t1.C40267a aVar) {
        C87412m.m108594g(arrayList, "memberList");
        this.f108276d = arrayList;
        this.f108277e = m1Var;
        this.f108278f = aVar;
    }

    public int getItemCount() {
        return this.f108276d.size();
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [android.text.SpannableString] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r7, int r8) {
        /*
            r6 = this;
            com.tencent.mm.chatroom.ui.t1 r7 = (com.tencent.p014mm.chatroom.p015ui.C40266t1) r7
            java.lang.String r0 = "viewHolder"
            gy3.C87412m.m108594g(r7, r0)
            java.util.ArrayList<com.tencent.mm.storage.z1> r0 = r6.f108276d
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r0 = "memberList[position]"
            gy3.C87412m.m108593f(r8, r0)
            com.tencent.mm.storage.z1 r8 = (com.tencent.p014mm.storage.C72996z1) r8
            android.widget.TextView r0 = r7.f108281C
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.f108281C
            java.lang.String r1 = r8.getUsername()
            android.widget.TextView r2 = r7.f108281C
            r3 = 0
            if (r2 != 0) goto L_0x0026
            goto L_0x0091
        L_0x0026:
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            com.tencent.mm.storage.z1 r4 = r4.get(r5)
            if (r4 != 0) goto L_0x0044
            java.lang.String r1 = "MicroMsg.RoomFollowMemberAdapter"
            java.lang.String r2 = "ct == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            goto L_0x0091
        L_0x0044:
            java.lang.String r5 = r4.mo73969n2()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0053
            java.lang.String r3 = r4.mo73969n2()
            goto L_0x005b
        L_0x0053:
            com.tencent.mm.storage.m1 r5 = r7.f108279A
            if (r5 == 0) goto L_0x005b
            java.lang.String r3 = r5.mo69789q2(r1)
        L_0x005b:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 == 0) goto L_0x0065
            java.lang.String r3 = r4.mo73969n2()
        L_0x0065:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 == 0) goto L_0x006f
            java.lang.String r3 = r4.mo62909j3()
        L_0x006f:
            java.lang.Class<sv.n> r1 = p239sv.C48466n.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            sv.n r1 = (p239sv.C48466n) r1
            java.lang.CharSequence r1 = r1.mo73118nZ(r4, r3)
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r4 = r7.f108282z
            if (r1 != 0) goto L_0x0089
            java.lang.String r1 = ""
        L_0x0089:
            float r2 = r2.getTextSize()
            android.text.SpannableString r3 = r3.yp0(r4, r1, r2)
        L_0x0091:
            r0.setText(r3)
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r7 = r7.f108280B
            java.lang.String r8 = r8.getUsername()
            r0.mo106849z(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.C40265s1.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "viewGroup.context");
        C44661m1 m1Var = this.f108277e;
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.f6813p9, viewGroup, false);
        C87412m.m108593f(inflate, "getInflater(viewGroup.co…r_item, viewGroup, false)");
        return new C40266t1(context, m1Var, inflate, this.f108278f);
    }
}
