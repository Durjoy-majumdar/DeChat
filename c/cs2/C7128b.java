package cs2;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import b32.C0244a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cs2.b */
public class C7128b extends BaseAdapter {

    /* renamed from: d */
    public List<C0244a.C0245a> f25095d = new ArrayList();

    /* renamed from: e */
    public Context f25096e;

    /* renamed from: f */
    public LayoutInflater f25097f;

    /* renamed from: cs2.b$a */
    public class C7129a {

        /* renamed from: a */
        public ImageView f25098a;

        /* renamed from: b */
        public TextView f25099b;

        /* renamed from: c */
        public TextView f25100c;

        /* renamed from: d */
        public TextView f25101d;

        /* renamed from: e */
        public TextView f25102e;

        public C7129a(C7128b bVar) {
        }
    }

    public C7128b(Context context) {
        this.f25096e = context;
        this.f25097f = LayoutInflater.from(context);
    }

    public int getCount() {
        return this.f25095d.size();
    }

    public Object getItem(int i) {
        return this.f25095d.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: cs2.b$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0139 A[Catch:{ Exception -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0174 A[Catch:{ Exception -> 0x0180 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r22, android.view.View r23, android.view.ViewGroup r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = 0
            if (r23 != 0) goto L_0x0050
            android.view.LayoutInflater r2 = r1.f25097f
            r3 = 2131497684(0x7f0c12d4, float:1.8618968E38)
            r4 = r24
            android.view.View r2 = r2.inflate(r3, r4, r0)
            cs2.b$a r3 = new cs2.b$a
            r3.<init>(r1)
            r4 = 2131308771(0x7f0930e3, float:1.8235807E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f25098a = r4
            r4 = 2131308775(0x7f0930e7, float:1.8235815E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f25099b = r4
            r4 = 2131308776(0x7f0930e8, float:1.8235817E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f25100c = r4
            r4 = 2131308769(0x7f0930e1, float:1.8235803E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f25101d = r4
            r4 = 2131308773(0x7f0930e5, float:1.8235811E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f25102e = r4
            r2.setTag(r3)
            goto L_0x0059
        L_0x0050:
            java.lang.Object r2 = r23.getTag()
            r3 = r2
            cs2.b$a r3 = (cs2.C7128b.C7129a) r3
            r2 = r23
        L_0x0059:
            java.util.List<b32.a$a> r4 = r1.f25095d
            r5 = r22
            java.lang.Object r4 = r4.get(r5)
            b32.a$a r4 = (b32.C0244a.C0245a) r4
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()
            java.lang.String r6 = r4.f781a
            com.tencent.mm.storage.z1 r5 = r5.get(r6)
            java.lang.String r6 = r4.f781a
            java.lang.String r7 = "the contact is null,by username:%s"
            java.lang.String r8 = "SnsLuckyMoneyReceivedRecordListAdapter"
            r9 = 1
            if (r6 == 0) goto L_0x0092
            java.lang.Class<ln.f> r6 = p196ln.C76705f.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ln.f r6 = (p196ln.C76705f) r6
            android.widget.ImageView r10 = r3.f25098a
            java.lang.String r11 = r4.f781a
            r6.mo106822J5(r10, r11)
            goto L_0x0099
        L_0x0092:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r0] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r7, r10)
        L_0x0099:
            android.widget.TextView r6 = r3.f25100c
            android.content.Context r10 = r1.f25096e
            int r11 = r4.f782b
            long r11 = (long) r11
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
            r13.<init>()
            r14 = 3600000(0x36ee80, double:1.7786363E-317)
            r16 = 0
            int r18 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r18 >= 0) goto L_0x00b5
            java.lang.String r10 = ""
            goto L_0x00e9
        L_0x00b5:
            java.util.GregorianCalendar r14 = new java.util.GregorianCalendar
            int r15 = r13.get(r9)
            r0 = 2
            int r0 = r13.get(r0)
            r9 = 5
            int r9 = r13.get(r9)
            r14.<init>(r15, r0, r9)
            long r13 = r14.getTimeInMillis()
            long r13 = r11 - r13
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            r19 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r0 > 0) goto L_0x00eb
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r9 = "HH:mm"
            r0.<init>(r9)
            java.util.Date r9 = new java.util.Date
            r9.<init>(r11)
            java.lang.String r10 = r0.format(r9)
        L_0x00e9:
            r13 = 0
            goto L_0x010a
        L_0x00eb:
            android.text.format.Time r0 = new android.text.format.Time
            r0.<init>()
            r0.set(r11)
            r9 = 2131830313(0x7f112629, float:1.929362E38)
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r11 = " "
            r13 = 0
            r12[r13] = r11
            java.lang.String r9 = r10.getString(r9, r12)
            java.lang.CharSequence r0 = com.tencent.p014mm.pluginsdk.platformtools.C72714e.m85106a(r9, r0)
            java.lang.String r10 = r0.toString()
        L_0x010a:
            r6.setText(r10)
            android.widget.TextView r0 = r3.f25100c
            r0.setVisibility(r13)
            if (r5 == 0) goto L_0x0120
            android.content.Context r0 = r1.f25096e
            android.widget.TextView r6 = r3.f25099b
            java.lang.String r5 = r5.mo62898f()
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81616v(r0, r6, r5)
            goto L_0x012a
        L_0x0120:
            r0 = 1
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r0 = r4.f781a
            r5[r13] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r7, r5)
        L_0x012a:
            te3.rf2 r0 = new te3.rf2
            r0.<init>()
            r5 = 8
            te3.qv3 r4 = r4.f783c     // Catch:{ Exception -> 0x0180 }
            if (r4 == 0) goto L_0x0174
            int r6 = r4.f140572d     // Catch:{ Exception -> 0x0180 }
            if (r6 <= 0) goto L_0x0174
            byte[] r4 = sf0.C48374j0.m53715d(r4)     // Catch:{ Exception -> 0x0180 }
            r0.parseFrom(r4)     // Catch:{ Exception -> 0x0180 }
            long r6 = r0.f140881d     // Catch:{ Exception -> 0x0180 }
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0168
            android.content.Context r0 = r1.f25096e     // Catch:{ Exception -> 0x0180 }
            r4 = 2131832511(0x7f112ebf, float:1.9298078E38)
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0180 }
            double r6 = (double) r6     // Catch:{ Exception -> 0x0180 }
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 / r10
            java.lang.String r6 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r6)     // Catch:{ Exception -> 0x0180 }
            r7 = 0
            r9[r7] = r6     // Catch:{ Exception -> 0x0180 }
            java.lang.String r0 = r0.getString(r4, r9)     // Catch:{ Exception -> 0x0180 }
            android.widget.TextView r4 = r3.f25101d     // Catch:{ Exception -> 0x0180 }
            r4.setText(r0)     // Catch:{ Exception -> 0x0180 }
            android.widget.TextView r0 = r3.f25102e     // Catch:{ Exception -> 0x0180 }
            r0.setVisibility(r5)     // Catch:{ Exception -> 0x0180 }
            goto L_0x01b2
        L_0x0168:
            android.widget.TextView r0 = r3.f25101d     // Catch:{ Exception -> 0x0180 }
            r0.setVisibility(r5)     // Catch:{ Exception -> 0x0180 }
            android.widget.TextView r0 = r3.f25102e     // Catch:{ Exception -> 0x0180 }
            r4 = 0
            r0.setVisibility(r4)     // Catch:{ Exception -> 0x0180 }
            goto L_0x01b2
        L_0x0174:
            android.widget.TextView r0 = r3.f25101d     // Catch:{ Exception -> 0x0180 }
            r0.setVisibility(r5)     // Catch:{ Exception -> 0x0180 }
            android.widget.TextView r0 = r3.f25102e     // Catch:{ Exception -> 0x0180 }
            r4 = 0
            r0.setVisibility(r4)     // Catch:{ Exception -> 0x0180 }
            goto L_0x01b2
        L_0x0180:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = "hbBuffer is error"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            android.widget.TextView r0 = r3.f25101d
            r0.setVisibility(r5)
            android.widget.TextView r0 = r3.f25102e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.f25098a
            r0.setVisibility(r5)
            android.widget.TextView r0 = r3.f25099b
            r0.setVisibility(r5)
            android.widget.TextView r0 = r3.f25100c
            r0.setVisibility(r5)
        L_0x01b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cs2.C7128b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
