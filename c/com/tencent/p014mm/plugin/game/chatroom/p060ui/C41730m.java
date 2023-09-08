package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import cx1.C45221c;
import dx1.C45489f;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kx1.C46791c;
import p192l4.C10462b;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.m */
public final class C41730m extends RecyclerView.C16613e<C41734o> {

    /* renamed from: d */
    public final String f112310d;

    /* renamed from: e */
    public final long f112311e;

    /* renamed from: f */
    public final long f112312f;

    /* renamed from: g */
    public final List<C45221c> f112313g = new ArrayList();

    /* renamed from: h */
    public C41732b f112314h;

    /* renamed from: i */
    public final HashMap<String, Boolean> f112315i = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.m$a */
    public static final class C41731a extends C54248l.C54250b {

        /* renamed from: a */
        public final List<C45221c> f112316a;

        /* renamed from: b */
        public final List<C45221c> f112317b;

        public C41731a(List<C45221c> list, List<C45221c> list2) {
            C87412m.m108594g(list, "oldList");
            C87412m.m108594g(list2, "newList");
            this.f112316a = list;
            this.f112317b = list2;
        }

        /* renamed from: a */
        public boolean mo11465a(int i, int i2) {
            C45221c cVar = this.f112316a.get(i);
            C45221c cVar2 = this.f112317b.get(i2);
            return cVar.f122550c == cVar2.f122550c && C87412m.m108589b(cVar.f122548a, cVar2.f122548a) && C87412m.m108589b(cVar.f122549b.f122556b, cVar2.f122549b.f122556b) && C87412m.m108589b(cVar.f122549b.f122557c, cVar2.f122549b.f122557c) && cVar.f122551d == cVar2.f122551d;
        }

        /* renamed from: b */
        public boolean mo11466b(int i, int i2) {
            return C87412m.m108589b(this.f112316a.get(i).f122549b.f122555a, this.f112317b.get(i2).f122549b.f122555a);
        }

        /* renamed from: d */
        public int mo11468d() {
            return this.f112317b.size();
        }

        /* renamed from: e */
        public int mo11469e() {
            return this.f112316a.size();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.m$b */
    public interface C41732b {
    }

    public C41730m(String str, long j, long j2) {
        C87412m.m108594g(str, "chatroomName");
        this.f112310d = str;
        this.f112311e = j;
        this.f112312f = j2;
    }

    public int getItemCount() {
        return ((ArrayList) this.f112313g).size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bf, code lost:
        r8 = r8.f128045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017b, code lost:
        if ((((java.lang.Boolean) r4.f38555d).booleanValue()) != false) goto L_0x01a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r17
            com.tencent.mm.plugin.game.chatroom.ui.o r2 = (com.tencent.p014mm.plugin.game.chatroom.p060ui.C41734o) r2
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r2, r3)
            if (r1 < 0) goto L_0x0228
            java.util.List<cx1.c> r3 = r0.f112313g
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0228
            java.util.List<cx1.c> r3 = r0.f112313g
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r1 = r3.get(r1)
            cx1.c r1 = (cx1.C45221c) r1
            com.tencent.mm.plugin.game.chatroom.ui.m$b r3 = r0.f112314h
            java.lang.String r4 = "userInfo"
            gy3.C87412m.m108594g(r1, r4)
            rx3.l<java.lang.Boolean, java.lang.String> r4 = r1.f122548a
            A r4 = r4.f38555d
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 8
            r6 = 0
            if (r4 == 0) goto L_0x0050
            dx1.f r4 = r2.f112325z
            android.widget.TextView r4 = r4.f123135g
            r4.setVisibility(r6)
            rx3.l<java.lang.Boolean, java.lang.String> r4 = r1.f122548a
            B r4 = r4.f38556e
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0057
            dx1.f r7 = r2.f112325z
            android.widget.TextView r7 = r7.f123135g
            r7.setText(r4)
            goto L_0x0057
        L_0x0050:
            dx1.f r4 = r2.f112325z
            android.widget.TextView r4 = r4.f123135g
            r4.setVisibility(r5)
        L_0x0057:
            dx1.f r4 = r2.f112325z
            android.widget.TextView r4 = r4.f123134f
            cx1.e r7 = r1.f122549b
            java.lang.String r7 = r7.f122556b
            r4.setText(r7)
            cx1.e r4 = r1.f122549b
            java.lang.String r4 = r4.f122555a
            java.lang.String r7 = "all"
            boolean r4 = gy3.C87412m.m108589b(r4, r7)
            if (r4 == 0) goto L_0x01a2
            cx1.e r4 = r1.f122549b
            java.lang.String r4 = r4.f122555a
            boolean r4 = gy3.C87412m.m108589b(r4, r7)
            if (r4 == 0) goto L_0x017e
            java.lang.String r4 = r2.f112321A
            java.lang.String r8 = "chatroomName"
            gy3.C87412m.m108594g(r4, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r9 = "atAllTime"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Class<sw1.r> r9 = sw1.C48485r.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            sw1.r r9 = (sw1.C48485r) r9
            byte[] r8 = r9.os0(r8)
            r9 = 0
            if (r8 == 0) goto L_0x0164
            long r11 = java.lang.System.currentTimeMillis()
            r5 = 0
            r15 = 0
        L_0x00a6:
            int r10 = r8.length
            if (r15 >= r10) goto L_0x00b5
            byte r10 = r8[r15]
            r10 = r10 & 255(0xff, float:3.57E-43)
            long r13 = (long) r10
            int r10 = r15 * 8
            long r13 = r13 << r10
            long r5 = r5 | r13
            int r15 = r15 + 1
            goto L_0x00a6
        L_0x00b5:
            long r11 = r11 - r5
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            py1.u r8 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45368b()
            if (r8 == 0) goto L_0x00c6
            py1.l r8 = r8.f128045f
            if (r8 == 0) goto L_0x00c6
            int r8 = r8.f127845d
            goto L_0x00c7
        L_0x00c6:
            r8 = 0
        L_0x00c7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "preload  chatroomName = "
            r10.append(r13)
            r10.append(r4)
            java.lang.String r4 = " lastAtAllTime = "
            r10.append(r4)
            r10.append(r5)
            java.lang.String r4 = "   diffSeconds = "
            r10.append(r4)
            r10.append(r11)
            java.lang.String r4 = " 秒  atAllFreq ="
            r10.append(r4)
            r10.append(r8)
            r4 = 32
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            java.lang.String r5 = "ChatroomMentionUtils.ChatroomMemberPreloadManager"
            com.tencent.stubs.logger.Log.m106505i(r5, r4)
            long r4 = (long) r8
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0101
            r6 = 1
            goto L_0x0102
        L_0x0101:
            r6 = 0
        L_0x0102:
            if (r6 == 0) goto L_0x010c
            rx3.l r4 = new rx3.l
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.<init>(r5, r9)
            goto L_0x016b
        L_0x010c:
            long r4 = r4 - r11
            r8 = 3600(0xe10, double:1.7786E-320)
            long r8 = r4 / r8
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x012a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r5 = "小时后可再次使用"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x015b
        L_0x012a:
            r8 = 60
            long r4 = r4 / r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x0144
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = "分钟后可再次使用"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            goto L_0x015b
        L_0x0144:
            if (r6 <= 0) goto L_0x0159
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = "秒后可再次使用"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            goto L_0x015b
        L_0x0159:
            java.lang.String r4 = ""
        L_0x015b:
            rx3.l r5 = new rx3.l
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.<init>(r6, r4)
            r4 = r5
            goto L_0x016b
        L_0x0164:
            rx3.l r4 = new rx3.l
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.<init>(r5, r9)
        L_0x016b:
            r2.f112324D = r4
            A r4 = r4.f38555d
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 1
            if (r4 != r5) goto L_0x017a
            r10 = 1
            goto L_0x017b
        L_0x017a:
            r10 = 0
        L_0x017b:
            if (r10 == 0) goto L_0x017e
            goto L_0x01a2
        L_0x017e:
            dx1.f r3 = r2.f112325z
            android.widget.RelativeLayout r3 = r3.f123132d
            r4 = 0
            r3.setClickable(r4)
            dx1.f r3 = r2.f112325z
            android.widget.RelativeLayout r3 = r3.f123132d
            r4 = 1058642330(0x3f19999a, float:0.6)
            r3.setAlpha(r4)
            rx3.l<java.lang.Boolean, java.lang.String> r3 = r2.f112324D
            if (r3 == 0) goto L_0x01b7
            B r3 = r3.f38556e
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x01b7
            dx1.f r4 = r2.f112325z
            android.widget.TextView r4 = r4.f123133e
            r4.setText(r3)
            goto L_0x01b7
        L_0x01a2:
            dx1.f r4 = r2.f112325z
            android.widget.RelativeLayout r4 = r4.f123132d
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r5)
            dx1.f r4 = r2.f112325z
            android.widget.RelativeLayout r4 = r4.f123132d
            com.tencent.mm.plugin.game.chatroom.ui.n r5 = new com.tencent.mm.plugin.game.chatroom.ui.n
            r5.<init>(r1, r2, r3)
            r4.setOnClickListener(r5)
        L_0x01b7:
            cx1.e r3 = r1.f122549b
            java.lang.String r3 = r3.f122555a
            boolean r3 = gy3.C87412m.m108589b(r3, r7)
            if (r3 == 0) goto L_0x01d4
            dx1.f r3 = r2.f112325z
            android.widget.TextView r3 = r3.f123133e
            r4 = 0
            r3.setVisibility(r4)
            dx1.f r3 = r2.f112325z
            com.tencent.mm.ui.widget.MMRoundCornerImageView r3 = r3.f123131c
            r4 = 2131755929(0x7f100399, float:1.9142751E38)
            r3.setImageResource(r4)
            goto L_0x01e8
        L_0x01d4:
            dx1.f r3 = r2.f112325z
            android.widget.TextView r3 = r3.f123133e
            r4 = 8
            r3.setVisibility(r4)
            dx1.f r3 = r2.f112325z
            com.tencent.mm.ui.widget.MMRoundCornerImageView r3 = r3.f123131c
            cx1.e r4 = r1.f122549b
            java.lang.String r4 = r4.f122555a
            tl3.C78039a.m94189a(r3, r4)
        L_0x01e8:
            boolean r3 = r1.f122550c
            if (r3 == 0) goto L_0x01f5
            dx1.f r2 = r2.f112325z
            android.widget.TextView r2 = r2.f123130b
            r3 = 0
            r2.setVisibility(r3)
            goto L_0x01fe
        L_0x01f5:
            dx1.f r2 = r2.f112325z
            android.widget.TextView r2 = r2.f123130b
            r3 = 8
            r2.setVisibility(r3)
        L_0x01fe:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r2 = r0.f112315i
            cx1.e r3 = r1.f122549b
            java.lang.String r3 = r3.f122555a
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x020b
            goto L_0x0228
        L_0x020b:
            com.tencent.mm.game.report.d$a r3 = com.tencent.p014mm.game.report.C40308d.f108375a
            int r2 = r1.f122551d
            long r4 = (long) r2
            r6 = 1
            long r8 = r0.f112311e
            long r10 = r0.f112312f
            cx1.e r2 = r1.f122549b
            java.lang.String r12 = r2.f122555a
            r3.mo62995e(r4, r6, r8, r10, r12)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r2 = r0.f112315i
            cx1.e r1 = r1.f122549b
            java.lang.String r1 = r1.f122555a
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.put(r1, r3)
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.p060ui.C41730m.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.clw, (ViewGroup) null, false);
        int i2 = C0966R.C0970id.m1p;
        TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.m1p);
        if (textView != null) {
            i2 = C0966R.C0970id.fcc;
            MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) C10462b.m10395a(inflate, C0966R.C0970id.fcc);
            if (mMRoundCornerImageView != null) {
                i2 = C0966R.C0970id.f358530m31;
                RelativeLayout relativeLayout = (RelativeLayout) C10462b.m10395a(inflate, C0966R.C0970id.f358530m31);
                if (relativeLayout != null) {
                    i2 = C0966R.C0970id.m88;
                    TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.m88);
                    if (textView2 != null) {
                        i2 = C0966R.C0970id.kxb;
                        TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.kxb);
                        if (textView3 != null) {
                            i2 = C0966R.C0970id.m8e;
                            TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.m8e);
                            if (textView4 != null) {
                                return new C41734o(new C45489f((RelativeLayout) inflate, textView, mMRoundCornerImageView, relativeLayout, textView2, textView3, textView4), this.f112310d, this.f112311e, this.f112312f);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    /* renamed from: t3 */
    public final void mo65447t3(List<C45221c> list) {
        C87412m.m108594g(list, "list");
        List<C45221c> a = C46791c.f125914a.mo72013a(list);
        ((ArrayList) this.f112313g).clear();
        ((ArrayList) this.f112313g).addAll(a);
        this.f112315i.clear();
        notifyDataSetChanged();
    }
}
