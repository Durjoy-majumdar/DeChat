package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76874e0;
import nj3.C76912y0;
import p537gq.C45942c;
import p773yy.C79168k;
import sv2.C64172j;
import tv2.C14096e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.k6 */
public class C74085k6 extends C74023i {

    /* renamed from: v */
    public C67391b f217409v;

    /* renamed from: w */
    public C72917n0 f217410w;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.k6$a */
    public class C57780a implements View.OnClickListener {

        /* renamed from: d */
        public long f165350d = 0;

        /* renamed from: e */
        public final /* synthetic */ C68070l.C68072b f165351e;

        /* renamed from: f */
        public final /* synthetic */ boolean f165352f;

        /* renamed from: g */
        public final /* synthetic */ C64172j f165353g;

        /* renamed from: h */
        public final /* synthetic */ C67391b f165354h;

        public C57780a(C68070l.C68072b bVar, boolean z, C64172j jVar, C67391b bVar2) {
            this.f165351e = bVar;
            this.f165352f = z;
            this.f165353g = jVar;
            this.f165354h = bVar2;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (System.currentTimeMillis() - this.f165350d <= 2000) {
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            this.f165350d = System.currentTimeMillis();
            if (this.f165351e == null) {
                Log.m105920e("MicroMsg.ChattingItemHardDeviceMsg", "onClick: content is null");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!this.f165352f) {
                if (this.f165353g == null) {
                    Log.m105928w("MicroMsg.ChattingItemHardDeviceMsg", "onClick: finalSportsAppMsgContent == null");
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                Log.m105924i("MicroMsg.ChattingItemHardDeviceMsg", "onClick: setTextStatusLl");
                if (C74085k6.this.mo103155o0(this.f165351e.f195469B0, this.f165353g.f181895d)) {
                    C76912y0.m92769h(this.f165354h.mo91565f(), this.f165354h.mo91565f().getString(C0966R.string.cfm), C0966R.raw.icons_outlined_info);
                } else {
                    C14096e.m13448b(44, 0, Integer.parseInt(this.f165351e.f195611p0), this.f165353g.f181893b);
                    C74085k6 k6Var = C74085k6.this;
                    C64172j jVar = this.f165353g;
                    String str = jVar.f181893b;
                    String str2 = jVar.f181894c;
                    int parseInt = Integer.parseInt(this.f165351e.f195611p0);
                    k6Var.getClass();
                    if (!TextUtils.isEmpty(str)) {
                        ((C79168k) C86312j.m106911c(C79168k.class)).mo74115Nd(str, 1, k6Var.f217409v.mo91565f(), new C57783l6(k6Var, str, parseInt, str2));
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.k6$b */
    public class C57781b implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public final /* synthetic */ C67391b f165356d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f165357e;

        /* renamed from: f */
        public final /* synthetic */ C64172j f165358f;

        /* renamed from: g */
        public final /* synthetic */ C68070l.C68072b f165359g;

        /* renamed from: h */
        public final /* synthetic */ C74023i.C74026c f165360h;

        public C57781b(C67391b bVar, C72963f4 f4Var, boolean z, C64172j jVar, C68070l.C68072b bVar2, C74023i.C74026c cVar) {
            this.f165356d = bVar;
            this.f165357e = f4Var;
            this.f165358f = jVar;
            this.f165359g = bVar2;
            this.f165360h = cVar;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            Class cls = C45942c.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (i2 == 0) {
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                return;
            }
            C74085k6.this.f217410w.getFirstVisiblePosition();
            C74085k6.this.f217410w.getLastVisiblePosition();
            if (!((C45942c) C86312j.m106911c(cls)).Pd0(this.f165356d.mo91565f()).contains(String.valueOf(this.f165357e.getMsgId()))) {
                String str = null;
                C64172j jVar = this.f165358f;
                if (jVar != null && !Util.isNullOrNil(jVar.f181893b)) {
                    if (C74085k6.this.mo103155o0(this.f165359g.f195469B0, this.f165358f.f181895d)) {
                        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                        return;
                    }
                    str = this.f165358f.f181893b;
                }
                if (!Util.isNullOrNil(str)) {
                    Log.m105925i("MicroMsg.ChattingItemHardDeviceMsg", "onScroll: report iconId:%s, position:%s", str, Integer.valueOf(this.f165360h.getAdapterPosition()));
                    C14096e.m13448b(43, 0, Integer.parseInt(this.f165359g.f195611p0), str);
                    ((C45942c) C86312j.m106911c(cls)).Pd0(this.f165356d.mo91565f()).add(String.valueOf(this.f165357e.getMsgId()));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemHardDeviceMsg$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.k6$c */
    public final class C74086c extends C74023i.C74026c {

        /* renamed from: b */
        public TextView f217411b;

        /* renamed from: c */
        public TextView f217412c;

        /* renamed from: d */
        public TextView f217413d;

        /* renamed from: e */
        public TextView f217414e;

        /* renamed from: f */
        public TextView f217415f;

        /* renamed from: g */
        public TextView f217416g;

        /* renamed from: h */
        public ImageView f217417h;

        /* renamed from: i */
        public LinearLayout f217418i;

        /* renamed from: j */
        public TextView f217419j;

        /* renamed from: k */
        public ImageView f217420k;

        /* renamed from: l */
        public ImageView f217421l;

        /* renamed from: m */
        public TextView f217422m;

        /* renamed from: n */
        public TextView f217423n;

        /* renamed from: o */
        public LinearLayout f217424o;

        public C74086c(C74085k6 k6Var) {
        }

        /* renamed from: a */
        public C74086c mo103156a(View view) {
            super.create(view);
            this.f217411b = (TextView) view.findViewById(C0966R.C0970id.k1p);
            this.f217413d = (TextView) view.findViewById(C0966R.C0970id.icg);
            this.f217412c = (TextView) view.findViewById(C0966R.C0970id.k1q);
            this.f217414e = (TextView) view.findViewById(C0966R.C0970id.ich);
            this.f217415f = (TextView) view.findViewById(C0966R.C0970id.l8l);
            this.f217416g = (TextView) view.findViewById(C0966R.C0970id.etf);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.f217417h = (ImageView) view.findViewById(C0966R.C0970id.l8_);
            this.f217418i = (LinearLayout) view.findViewById(C0966R.C0970id.m3g);
            this.f217419j = (TextView) view.findViewById(C0966R.C0970id.m89);
            this.f217420k = (ImageView) view.findViewById(C0966R.C0970id.m2e);
            this.f217421l = (ImageView) view.findViewById(C0966R.C0970id.fdb);
            this.f217422m = (TextView) view.findViewById(C0966R.C0970id.kxt);
            this.f217423n = (TextView) view.findViewById(C0966R.C0970id.kxu);
            this.f217424o = (LinearLayout) view.findViewById(C0966R.C0970id.g1e);
            return this;
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6922sa);
        C74086c cVar = new C74086c(this);
        cVar.mo103156a(n4Var);
        n4Var.setTag(cVar);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        menuItem.getItemId();
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        e0Var.mo107136c(((C74243t8) view.getTag()).mo103252b(), 100, 0, this.f217409v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return false;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        String content = f4Var.getContent();
        C68070l.C68072b u = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
        boolean z = false;
        if (u == null) {
            Log.m105924i("MicroMsg.ChattingItemHardDeviceMsg", "onItemClick, content is null.");
            return false;
        }
        Log.m105919d("MicroMsg.ChattingItemHardDeviceMsg", "onItemClick, url is (%s).", u.f195586j);
        if (!Util.isNullOrNil(u.f195586j)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", u.f195586j);
            C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        }
        if (!Util.isNullOrNil(u.f195599m0)) {
            if (System.currentTimeMillis() - (((long) u.f195469B0) * 1000) >= 2592000000L) {
                z = true;
            }
            if (!z) {
                Intent intent2 = new Intent();
                intent2.putExtra("key_rank_info", content);
                intent2.putExtra("key_rank_semi", f4Var.mo108775z2());
                intent2.putExtra("key_rank_title", u.f195643x0);
                intent2.putExtra("key_champion_info", u.f195647y0);
                intent2.putExtra("key_champion_coverimg", u.f195647y0);
                intent2.putExtra("rank_id", u.f195599m0);
                intent2.putExtra("app_username", u.f195484F);
                intent2.putExtra("device_type", u.f195465A0);
                intent2.putExtra("key_champioin_username", u.f195639w0);
                C88144b.m109791i(bVar.mo91565f(), "exdevice", ".ui.ExdeviceRankInfoUI", intent2, (Bundle) null);
                C14096e.m13447a(28);
                return true;
            }
        }
        C88144b.m109789g(bVar.mo91565f(), "exdevice", ".ui.ExdeviceExpireUI");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0307  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r20, ck3.C67391b r21, com.tencent.p014mm.storage.C72963f4 r22, java.lang.String r23) {
        /*
            r19 = this;
            r8 = r19
            r7 = r20
            r6 = r21
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            r8.f217409v = r6
            com.tencent.mm.pluginsdk.ui.tools.n0 r1 = r21.mo91570k()
            r8.f217410w = r1
            r1 = r7
            com.tencent.mm.ui.chatting.viewitems.k6$c r1 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74085k6.C74086c) r1
            com.tencent.mm.pluginsdk.model.app.s r2 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.Ax0()
            long r3 = r22.getMsgId()
            com.tencent.mm.message.l r2 = r2.mo135038a0(r3)
            java.lang.String r3 = r22.getContent()
            r4 = 2
            java.lang.String r5 = "MicroMsg.ChattingItemHardDeviceMsg"
            r9 = 0
            r10 = 1
            r11 = 0
            if (r2 == 0) goto L_0x0037
            if (r3 == 0) goto L_0x0037
            java.lang.String r2 = r22.mo108775z2()
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r2)
            r12 = r2
            goto L_0x005e
        L_0x0037:
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            if (r2 != 0) goto L_0x003e
            r2 = 1
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r12[r11] = r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r3)
            r12[r10] = r2
            long r2 = r22.getMsgId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12[r4] = r2
            r2 = 3
            r12[r2] = r23
            java.lang.String r2 = "amessage:%b, %s, %d, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r12)
            r12 = r9
        L_0x005e:
            com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
            boolean r3 = r21.mo91583x()
            r13 = r22
            r2.<init>(r13, r3, r7, r9)
            android.view.View r3 = r7.clickArea
            com.tencent.mm.ui.chatting.HardDeviceChattingItemView r3 = (com.tencent.p014mm.p136ui.chatting.HardDeviceChattingItemView) r3
            if (r12 == 0) goto L_0x030d
            int r14 = r12.f195492H
            if (r14 == r10) goto L_0x0077
            int r14 = r12.f195651z0
            if (r14 != r10) goto L_0x030d
        L_0x0077:
            java.lang.Class<sv2.j> r9 = sv2.C64172j.class
            com.tencent.mm.message.g r9 = r12.mo93555w(r9)
            sv2.j r9 = (sv2.C64172j) r9
            java.lang.String r14 = r12.f195635v0
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 == 0) goto L_0x0170
            java.lang.String r14 = r12.f195619r0
            java.lang.String r15 = r12.f195623s0
            r3.getClass()
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            java.lang.String r10 = "#ffffff"
            if (r16 != 0) goto L_0x00a0
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r16 == 0) goto L_0x009d
            goto L_0x00a0
        L_0x009d:
            r4 = r14
            r14 = 1
            goto L_0x00b0
        L_0x00a0:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r11] = r14
            r14 = 1
            r4[r14] = r15
            java.lang.String r15 = "MicroMsg.HardDeviceChattingItemView"
            java.lang.String r11 = "color is null or highlight color is null, color = %s, highlight color = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r11, r4)
            r4 = r10
            r15 = r4
        L_0x00b0:
            android.graphics.drawable.StateListDrawable r11 = new android.graphics.drawable.StateListDrawable
            r11.<init>()
            int[] r13 = new int[r14]
            r17 = 16842919(0x10100a7, float:2.3694026E-38)
            r14 = 0
            r13[r14] = r17
            android.graphics.drawable.ColorDrawable r14 = new android.graphics.drawable.ColorDrawable
            r18 = r2
            int r2 = android.graphics.Color.parseColor(r15)
            r14.<init>(r2)
            r11.addState(r13, r14)
            r2 = 1
            int[] r13 = new int[r2]
            r14 = 16842908(0x101009c, float:2.3693995E-38)
            r2 = 0
            r13[r2] = r14
            android.graphics.drawable.ColorDrawable r14 = new android.graphics.drawable.ColorDrawable
            int r15 = android.graphics.Color.parseColor(r15)
            r14.<init>(r15)
            r11.addState(r13, r14)
            r13 = 1
            int[] r14 = new int[r13]
            r13 = 16842766(0x101000e, float:2.3693597E-38)
            r14[r2] = r13
            android.graphics.drawable.ColorDrawable r15 = new android.graphics.drawable.ColorDrawable
            int r13 = android.graphics.Color.parseColor(r4)
            r15.<init>(r13)
            r11.addState(r14, r15)
            int[] r13 = new int[r2]
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            int r4 = android.graphics.Color.parseColor(r4)
            r2.<init>(r4)
            r11.addState(r13, r2)
            r3.setBackgroundDrawable(r11)
            r12.f195635v0 = r10
            java.lang.String r2 = r12.f195627t0
            java.lang.String r3 = r12.f195631u0
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 != 0) goto L_0x0129
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x0129
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException -> 0x0120 }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ IllegalArgumentException -> 0x0123 }
            goto L_0x012f
        L_0x0120:
            r2 = 2131101833(0x7f060889, float:1.7816087E38)
        L_0x0123:
            java.lang.String r3 = "hy: line color given color is incorrect. use default"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r3)
            goto L_0x012c
        L_0x0129:
            r2 = 2131101833(0x7f060889, float:1.7816087E38)
        L_0x012c:
            r3 = 2131101833(0x7f060889, float:1.7816087E38)
        L_0x012f:
            android.graphics.drawable.StateListDrawable r4 = new android.graphics.drawable.StateListDrawable
            r4.<init>()
            r10 = 1
            int[] r11 = new int[r10]
            r13 = 0
            r11[r13] = r17
            android.graphics.drawable.ColorDrawable r14 = new android.graphics.drawable.ColorDrawable
            r14.<init>(r3)
            r4.addState(r11, r14)
            int[] r11 = new int[r10]
            r14 = 16842908(0x101009c, float:2.3693995E-38)
            r11[r13] = r14
            android.graphics.drawable.ColorDrawable r14 = new android.graphics.drawable.ColorDrawable
            r14.<init>(r3)
            r4.addState(r11, r14)
            int[] r3 = new int[r10]
            r10 = 16842766(0x101000e, float:2.3693597E-38)
            r3[r13] = r10
            android.graphics.drawable.ColorDrawable r10 = new android.graphics.drawable.ColorDrawable
            r10.<init>(r2)
            r4.addState(r3, r10)
            int[] r3 = new int[r13]
            android.graphics.drawable.ColorDrawable r10 = new android.graphics.drawable.ColorDrawable
            r10.<init>(r2)
            r4.addState(r3, r10)
            android.widget.TextView r2 = r1.f217416g
            r2.setBackgroundDrawable(r4)
            goto L_0x0172
        L_0x0170:
            r18 = r2
        L_0x0172:
            java.lang.String r2 = r12.f195635v0
            if (r1 == 0) goto L_0x01a2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0186
            int r15 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException -> 0x0181 }
            goto L_0x0189
        L_0x0181:
            java.lang.String r2 = "hy: given color is incorrect.use default"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
        L_0x0186:
            r15 = 2131101833(0x7f060889, float:1.7816087E38)
        L_0x0189:
            android.widget.TextView r2 = r1.f217413d
            r2.setTextColor(r15)
            android.widget.TextView r2 = r1.f217414e
            r2.setTextColor(r15)
            android.widget.TextView r2 = r1.f217411b
            r2.setTextColor(r15)
            android.widget.TextView r2 = r1.f217412c
            r2.setTextColor(r15)
            android.widget.TextView r2 = r1.f217415f
            r2.setTextColor(r15)
        L_0x01a2:
            android.widget.TextView r2 = r1.f217413d
            java.lang.String r3 = r12.f195603n0
            r2.setText(r3)
            android.widget.TextView r2 = r1.f217413d
            android.app.Activity r3 = r21.mo91565f()
            r4 = 2131165355(0x7f0700ab, float:1.7944925E38)
            int r3 = kg3.C76577a.m92155f(r3, r4)
            float r3 = (float) r3
            r5 = 0
            r2.setTextSize(r5, r3)
            android.widget.TextView r2 = r1.f217414e
            java.lang.String r3 = r12.f195595l0
            r2.setText(r3)
            android.widget.TextView r2 = r1.f217411b
            java.lang.String r3 = r12.f195611p0
            r2.setText(r3)
            android.widget.TextView r2 = r1.f217411b
            android.app.Activity r3 = r21.mo91565f()
            int r3 = kg3.C76577a.m92155f(r3, r4)
            float r3 = (float) r3
            r2.setTextSize(r5, r3)
            android.widget.TextView r2 = r1.f217412c
            java.lang.String r3 = r12.f195607o0
            r2.setText(r3)
            android.widget.TextView r2 = r1.f217415f
            java.lang.String r3 = r12.f195615q0
            r2.setText(r3)
            java.lang.String r2 = r12.f195639w0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r3 = 8
            if (r2 != 0) goto L_0x0239
            android.widget.ImageView r2 = r1.f217417h
            r4 = 0
            r2.setVisibility(r4)
            di3.d r2 = di3.C86312j.m106911c(r0)
            ln.f r2 = (p196ln.C76705f) r2
            android.widget.ImageView r5 = r1.f217417h
            java.lang.String r10 = r12.f195639w0
            r2.mo106831cr(r5, r10)
            android.widget.ImageView r2 = r1.f217421l
            r2.setVisibility(r4)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r2 = r1.f217421l
            java.lang.String r5 = r12.f195639w0
            r0.mo106831cr(r2, r5)
            android.widget.TextView r0 = r1.f217422m
            r0.setVisibility(r4)
            android.widget.TextView r0 = r1.f217422m
            java.lang.Class<d62.i> r2 = d62.C75339i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            d62.i r2 = (d62.C75339i) r2
            java.lang.String r5 = r12.f195639w0
            java.lang.String r2 = r2.getDisplayName(r5)
            r0.setText(r2)
            android.widget.TextView r0 = r1.f217423n
            r0.setVisibility(r4)
            android.widget.TextView r0 = r1.f217423n
            java.lang.String r2 = r12.f195615q0
            r0.setText(r2)
            goto L_0x024d
        L_0x0239:
            android.widget.ImageView r0 = r1.f217417h
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r1.f217421l
            r0.setVisibility(r3)
            android.widget.TextView r0 = r1.f217422m
            r0.setVisibility(r3)
            android.widget.TextView r0 = r1.f217423n
            r0.setVisibility(r3)
        L_0x024d:
            long r4 = r22.getMsgId()
            java.lang.String.valueOf(r4)
            if (r9 == 0) goto L_0x0307
            java.lang.String r0 = r12.f195611p0
            int r0 = java.lang.Integer.parseInt(r0)
            r2 = 10000(0x2710, float:1.4013E-41)
            r4 = 100
            if (r0 <= r4) goto L_0x0264
            if (r0 < r2) goto L_0x0301
        L_0x0264:
            java.lang.String r5 = r9.f181893b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0301
            java.lang.Class<h81.h> r5 = h81.C32735h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_text_status_sports_and
            bp3.f r11 = bp3.C104160f.RepairerConfig_TextStatus_SetTextStatusFromWeRun_Int
            r13 = 1
            int r5 = r5.dl0(r10, r11, r13)
            if (r5 != r13) goto L_0x0281
            r10 = 1
            goto L_0x0282
        L_0x0281:
            r10 = 0
        L_0x0282:
            if (r10 != 0) goto L_0x0286
            goto L_0x0301
        L_0x0286:
            ck3.b r3 = r8.f217409v
            android.app.Activity r3 = r3.mo91565f()
            if (r3 != 0) goto L_0x0290
            goto L_0x030f
        L_0x0290:
            android.content.res.Resources r5 = r3.getResources()
            r10 = 2131099809(0x7f0600a1, float:1.7811982E38)
            int r5 = r5.getColor(r10)
            qy2.a$b r11 = qy2.C63347a.C47891b.FG_3
            if (r0 >= r4) goto L_0x02ad
            android.content.res.Resources r0 = r3.getResources()
            r2 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r5 = r0.getColor(r2)
            qy2.a$b r0 = qy2.C63347a.C47891b.GREEN
            goto L_0x02be
        L_0x02ad:
            if (r0 <= r2) goto L_0x02bd
            android.content.res.Resources r0 = r3.getResources()
            r2 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r5 = r0.getColor(r2)
            qy2.a$b r0 = qy2.C63347a.C47891b.ORANGE
            goto L_0x02be
        L_0x02bd:
            r0 = r11
        L_0x02be:
            int r2 = r12.f195469B0
            java.lang.String r4 = r9.f181895d
            boolean r2 = r8.mo103155o0(r2, r4)
            if (r2 == 0) goto L_0x02d1
            android.content.res.Resources r0 = r3.getResources()
            int r5 = r0.getColor(r10)
            goto L_0x02d2
        L_0x02d1:
            r11 = r0
        L_0x02d2:
            java.lang.String r0 = r9.f181893b
            android.widget.TextView r2 = r1.f217419j
            ck3.b r3 = r8.f217409v
            android.app.Activity r3 = r3.mo91565f()
            r4 = 2131825333(0x7f1112b5, float:1.928352E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setText(r3)
            android.widget.TextView r2 = r1.f217419j
            r2.setTextColor(r5)
            java.lang.Class<yy.k> r2 = p773yy.C79168k.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            yy.k r2 = (p773yy.C79168k) r2
            android.widget.ImageView r3 = r1.f217420k
            qy2.a$d r4 = qy2.C63347a.C47893d.OUTLINED
            r2.mo74132ov(r3, r0, r4, r11)
            android.widget.LinearLayout r0 = r1.f217418i
            r2 = 0
            r0.setVisibility(r2)
            goto L_0x030f
        L_0x0301:
            android.widget.LinearLayout r0 = r1.f217418i
            r0.setVisibility(r3)
            goto L_0x030f
        L_0x0307:
            android.widget.LinearLayout r0 = r1.f217418i
            r0.setVisibility(r3)
            goto L_0x030f
        L_0x030d:
            r18 = r2
        L_0x030f:
            android.view.View r0 = r7.clickArea
            com.tencent.mm.ui.chatting.viewitems.i$e r2 = r8.mo103098p(r6)
            r0.setOnLongClickListener(r2)
            android.view.View r0 = r7.clickArea
            java.lang.Class<zj3.l> r2 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r3 = r6.f193278b
            xi.d r2 = r3.mo102812a(r2)
            zj3.l r2 = (zj3.C79368l) r2
            com.tencent.mm.ui.chatting.h2 r2 = r2.mo108189Z4()
            r0.setOnTouchListener(r2)
            android.view.View r0 = r7.clickArea
            r2 = r18
            r0.setTag(r2)
            android.view.View r0 = r7.clickArea
            com.tencent.mm.ui.chatting.viewitems.i$f r3 = r8.mo103099u(r6)
            r0.setOnClickListener(r3)
            android.widget.LinearLayout r0 = r1.f217424o
            r0.setTag(r2)
            android.widget.LinearLayout r0 = r1.f217424o
            com.tencent.mm.ui.chatting.viewitems.i$f r2 = r8.mo103099u(r6)
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r10 = r1.f217418i
            com.tencent.mm.ui.chatting.viewitems.k6$a r11 = new com.tencent.mm.ui.chatting.viewitems.k6$a
            r3 = 0
            r0 = r11
            r1 = r19
            r2 = r12
            r4 = r9
            r5 = r21
            r0.<init>(r2, r3, r4, r5)
            r10.setOnClickListener(r11)
            com.tencent.mm.pluginsdk.ui.tools.n0 r10 = r8.f217410w
            com.tencent.mm.ui.chatting.viewitems.k6$b r11 = new com.tencent.mm.ui.chatting.viewitems.k6$b
            r4 = 0
            r0 = r11
            r2 = r21
            r3 = r22
            r5 = r9
            r6 = r12
            r7 = r20
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.setOnScrollListener(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74085k6.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == -1879048185;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo103155o0(int r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001c
            long r3 = java.lang.Long.parseLong(r9)     // Catch:{ Exception -> 0x000d }
            goto L_0x001f
        L_0x000d:
            r0 = move-exception
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r1] = r9
            java.lang.String r9 = "MicroMsg.ChattingItemHardDeviceMsg"
            java.lang.String r0 = "isOverDue:%s,%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r3)
        L_0x001c:
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
        L_0x001f:
            long r8 = (long) r8
            r5 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r5
            long r3 = r3 * r5
            long r8 = r8 + r3
            long r3 = eb0.C31543z5.m39451a()
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74085k6.mo103155o0(int, java.lang.String):boolean");
    }
}
