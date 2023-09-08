package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.map.geolocation.sapp.TencentLocationUtils;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.n */
public class C115565n extends BaseAdapter {

    /* renamed from: d */
    public List<C115568o> f346590d = new ArrayList();

    /* renamed from: e */
    public Context f346591e;

    /* renamed from: f */
    public int f346592f = 0;

    /* renamed from: g */
    public byte[] f346593g = null;

    /* renamed from: h */
    public boolean f346594h = false;

    /* renamed from: i */
    public String f346595i = "";

    /* renamed from: j */
    public String f346596j = "";

    /* renamed from: n */
    public boolean f346597n = false;

    /* renamed from: o */
    public boolean f346598o = false;

    /* renamed from: p */
    public double f346599p;

    /* renamed from: q */
    public double f346600q;

    /* renamed from: r */
    public String f346601r;

    /* renamed from: s */
    public String f346602s;

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.n$a */
    public static class C115566a {

        /* renamed from: a */
        public View f346603a;

        /* renamed from: b */
        public View f346604b;

        /* renamed from: c */
        public TextView f346605c;

        /* renamed from: d */
        public TextView f346606d;
    }

    public C115565n(Context context) {
        this.f346591e = context;
    }

    /* renamed from: a */
    public void mo175609a(List<C115568o> list, byte[] bArr, boolean z, String str) {
        String str2 = this.f346595i;
        if (str2 == null || !str2.equals(str)) {
            Log.m105925i("MicroMsg.PoiAdapter", "old key, dismiss it %s %s.", this.f346595i, str);
            return;
        }
        int size = ((ArrayList) this.f346590d).size();
        for (C115568o next : list) {
            next.f346624q = size;
            size++;
            ((ArrayList) this.f346590d).add(next);
        }
        this.f346593g = bArr;
        this.f346594h = z;
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo175610b() {
        this.f346593g = null;
        this.f346594h = false;
        this.f346595i = "";
        ((ArrayList) this.f346590d).clear();
        this.f346592f = -1;
    }

    /* renamed from: d */
    public C115568o getItem(int i) {
        return (C115568o) ((ArrayList) this.f346590d).get(i);
    }

    /* renamed from: f */
    public final String mo175612f(CharSequence charSequence, double d, double d2) {
        String str;
        int distanceBetween = (int) TencentLocationUtils.distanceBetween(this.f346599p, this.f346600q, d, d2);
        Log.m105919d("MicroMsg.PoiAdapter", "mLat %s mLng %s lat %s lng %s dis %s.", Double.valueOf(this.f346599p), Double.valueOf(this.f346600q), Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(distanceBetween));
        if (distanceBetween < 100) {
            str = "100m内";
        } else if (distanceBetween >= 1000) {
            str = Util.safeFormatString("%.1fkm", Double.valueOf(((double) distanceBetween) / 1000.0d));
        } else {
            str = distanceBetween + "m";
        }
        if (Util.isNullOrNil(charSequence)) {
            return str;
        }
        return str + APLogFileUtil.SEPARATOR_LOG + charSequence;
    }

    public int getCount() {
        return ((ArrayList) this.f346590d).size();
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: com.tencent.mm.plugin.location.ui.impl.n$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r27, android.view.View r28, android.view.ViewGroup r29) {
        /*
            r26 = this;
            r6 = r26
            r7 = r27
            r8 = 0
            if (r28 != 0) goto L_0x0048
            android.content.Context r0 = r6.f346591e
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131496982(0x7f0c1016, float:1.8617544E38)
            r2 = r29
            android.view.View r0 = r0.inflate(r1, r2, r8)
            com.tencent.mm.plugin.location.ui.impl.n$a r1 = new com.tencent.mm.plugin.location.ui.impl.n$a
            r1.<init>()
            r2 = 2131311069(0x7f0939dd, float:1.8240468E38)
            android.view.View r2 = r0.findViewById(r2)
            r1.f346603a = r2
            r2 = 2131311071(0x7f0939df, float:1.8240472E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f346605c = r2
            r2 = 2131311070(0x7f0939de, float:1.824047E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f346606d = r2
            r2 = 2131311073(0x7f0939e1, float:1.8240476E38)
            android.view.View r2 = r0.findViewById(r2)
            r1.f346604b = r2
            r0.setTag(r1)
            r9 = r0
            goto L_0x0051
        L_0x0048:
            java.lang.Object r0 = r28.getTag()
            r1 = r0
            com.tencent.mm.plugin.location.ui.impl.n$a r1 = (com.tencent.p014mm.plugin.location.p069ui.impl.C115565n.C115566a) r1
            r9 = r28
        L_0x0051:
            r10 = r1
            java.util.List<com.tencent.mm.plugin.location.ui.impl.o> r0 = r6.f346590d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r7)
            com.tencent.mm.plugin.location.ui.impl.o r0 = (com.tencent.p014mm.plugin.location.p069ui.impl.C115568o) r0
            r1 = 1
            int r2 = r0.f346620m
            java.lang.String r3 = ""
            if (r1 == r2) goto L_0x006d
            r1 = 2
            if (r1 != r2) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            android.widget.TextView r1 = r10.f346606d
            r1.setVisibility(r8)
            goto L_0x007f
        L_0x006d:
            android.widget.TextView r1 = r10.f346605c
            java.lang.String r2 = r0.f346609b
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            r1.setText(r2)
            android.widget.TextView r1 = r10.f346606d
            r2 = 8
            r1.setVisibility(r2)
        L_0x007f:
            java.lang.String r1 = r0.f346608a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0095
            android.content.Context r1 = r6.f346591e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131832200(0x7f112d88, float:1.9297447E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0097
        L_0x0095:
            java.lang.String r1 = r0.f346608a
        L_0x0097:
            java.lang.String r2 = r6.f346601r
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x00cc
            java.lang.String r2 = r0.f346613f
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r4 = r6.f346601r
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00cc
            java.lang.String r2 = r6.f346602s
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x00ca
            java.lang.String r2 = r0.f346614g
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r4 = r6.f346602s
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00ca
            java.lang.String r2 = r0.f346614g
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            goto L_0x00e7
        L_0x00ca:
            r2 = r3
            goto L_0x00e7
        L_0x00cc:
            java.lang.String r2 = r0.f346613f
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r0.f346614g
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x00e7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r0.f346615h
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r0.f346616i
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 == 0) goto L_0x011d
            java.lang.String r2 = r0.f346609b
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
        L_0x011d:
            boolean r3 = r6.f346597n
            if (r3 != 0) goto L_0x0139
            android.widget.TextView r3 = r10.f346605c
            r3.setText(r1)
            android.widget.TextView r11 = r10.f346606d
            double r3 = r0.f346611d
            double r12 = r0.f346610c
            r0 = r26
            r1 = r2
            r2 = r3
            r4 = r12
            java.lang.String r0 = r0.mo175612f(r1, r2, r4)
            r11.setText(r0)
            goto L_0x0180
        L_0x0139:
            java.lang.String r3 = r6.f346596j
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0169
            android.content.Context r3 = r6.f346591e
            java.lang.String r4 = r6.f346596j
            android.text.Spannable r1 = kv1.C99254i.m129306c(r3, r1, r4)
            android.content.Context r3 = r6.f346591e
            java.lang.String r4 = r6.f346596j
            android.text.Spannable r2 = kv1.C99254i.m129306c(r3, r2, r4)
            android.widget.TextView r3 = r10.f346605c
            r3.setText(r1)
            android.widget.TextView r11 = r10.f346606d
            double r3 = r0.f346611d
            double r12 = r0.f346610c
            r0 = r26
            r1 = r2
            r2 = r3
            r4 = r12
            java.lang.String r0 = r0.mo175612f(r1, r2, r4)
            r11.setText(r0)
            goto L_0x0180
        L_0x0169:
            android.widget.TextView r3 = r10.f346605c
            r3.setText(r1)
            android.widget.TextView r11 = r10.f346606d
            double r3 = r0.f346611d
            double r12 = r0.f346610c
            r0 = r26
            r1 = r2
            r2 = r3
            r4 = r12
            java.lang.String r0 = r0.mo175612f(r1, r2, r4)
            r11.setText(r0)
        L_0x0180:
            int r0 = r6.f346592f
            if (r7 != r0) goto L_0x01c5
            android.view.View r0 = r10.f346604b
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r1.mo10233c(r2)
            java.lang.Object[] r12 = r1.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/location/ui/impl/PoiAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r12 = "com/tencent/mm/plugin/location/ui/impl/PoiAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0207
        L_0x01c5:
            android.view.View r0 = r10.f346604b
            r1 = 4
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r1)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/location/ui/impl/PoiAdapter"
            java.lang.String r21 = "getView"
            java.lang.String r22 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r1 = r2.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r19 = "com/tencent/mm/plugin/location/ui/impl/PoiAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0207:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.C115565n.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
