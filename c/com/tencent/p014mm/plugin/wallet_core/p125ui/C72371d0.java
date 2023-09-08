package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import b63.C67200r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MaxListView;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import qo3.C77390c0;
import y43.C79030d0;
import y43.C79034n;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.d0 */
public class C72371d0 extends C77390c0 {

    /* renamed from: n */
    public static final /* synthetic */ int f210508n = 0;

    /* renamed from: d */
    public LayoutInflater f210509d;

    /* renamed from: e */
    public View f210510e;

    /* renamed from: f */
    public MaxListView f210511f;

    /* renamed from: g */
    public TextView f210512g = ((TextView) this.f210510e.findViewById(C0966R.C0970id.lgv));

    /* renamed from: h */
    public C72394l f210513h;

    /* renamed from: i */
    public C72372a f210514i;

    /* renamed from: j */
    public C72374b f210515j;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.d0$a */
    public class C72372a extends BaseAdapter {

        /* renamed from: d */
        public int f210516d = -1;

        /* renamed from: e */
        public List<C79030d0> f210517e = new LinkedList();

        /* renamed from: f */
        public C79034n f210518f = null;

        /* renamed from: g */
        public C67200r<String> f210519g = new C72373a(this);

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.d0$a$a */
        public class C72373a extends C67200r<String> {
            public C72373a(C72372a aVar) {
            }

            /* renamed from: a */
            public String mo91309a(Vector<C67200r<String>.b> vector, int i) {
                if (vector == null) {
                    Log.m105928w("MicroMsg.WalletFavorDialog", "func[getComposedKey] keyList null");
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    C67200r.C67201a aVar = vector.get(i2).f192939b;
                    if (i2 == i || aVar == C67200r.C67201a.CHECKED) {
                        sb.append(((String) vector.get(i2).f192938a) + "-");
                    }
                }
                if (sb.length() == 0) {
                    return "0";
                }
                if (sb.length() > 1) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                return sb.toString();
            }
        }

        public C72372a() {
        }

        public int getCount() {
            return this.f210517e.size();
        }

        public Object getItem(int i) {
            return this.f210517e.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.tencent.mm.plugin.wallet_core.ui.d0$c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = 0
                if (r19 != 0) goto L_0x005d
                com.tencent.mm.plugin.wallet_core.ui.d0 r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0.this
                android.view.LayoutInflater r3 = r3.f210509d
                r4 = 2131498216(0x7f0c14e8, float:1.8620047E38)
                r5 = r20
                android.view.View r3 = r3.inflate(r4, r5, r2)
                com.tencent.mm.plugin.wallet_core.ui.d0$c r4 = new com.tencent.mm.plugin.wallet_core.ui.d0$c
                r4.<init>()
                r5 = 2131316717(0x7f094fed, float:1.8251923E38)
                android.view.View r5 = r3.findViewById(r5)
                r4.f210521a = r5
                r5 = 2131316716(0x7f094fec, float:1.8251921E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f210523c = r5
                r5 = 2131316715(0x7f094feb, float:1.825192E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f210524d = r5
                r5 = 2131316714(0x7f094fea, float:1.8251917E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f210525e = r5
                r5 = 2131316713(0x7f094fe9, float:1.8251915E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.CheckBox r5 = (android.widget.CheckBox) r5
                r4.f210526f = r5
                r5 = 2131316712(0x7f094fe8, float:1.8251913E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                r4.f210522b = r5
                r3.setTag(r4)
                goto L_0x0066
            L_0x005d:
                java.lang.Object r3 = r19.getTag()
                r4 = r3
                com.tencent.mm.plugin.wallet_core.ui.d0$c r4 = (com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0.C72375c) r4
                r3 = r19
            L_0x0066:
                java.lang.Object r5 = r17.getItem(r18)
                y43.d0 r5 = (y43.C79030d0) r5
                int r6 = r0.f210516d
                if (r1 != r6) goto L_0x00bf
                if (r6 <= 0) goto L_0x00bf
                android.view.View r6 = r4.f210521a
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
                r15.mo10233c(r8)
                java.lang.Object[] r9 = r15.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$CouponListAdapter"
                java.lang.String r11 = "getView"
                java.lang.String r12 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r8 = r6
                r7 = r15
                r15 = r16
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r7 = r7.mo10231a(r2)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r6.setVisibility(r7)
                java.lang.String r9 = "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$CouponListAdapter"
                java.lang.String r10 = "getView"
                java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                android.widget.ImageView r6 = r4.f210522b
                r7 = 8
                r6.setVisibility(r7)
                r20 = r3
                goto L_0x010a
            L_0x00bf:
                r7 = 8
                android.view.View r6 = r4.f210521a
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r15.mo10233c(r8)
                java.lang.Object[] r9 = r15.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$CouponListAdapter"
                java.lang.String r11 = "getView"
                java.lang.String r12 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r7 = "(I)V"
                r8 = r6
                r20 = r3
                r3 = r15
                r15 = r7
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r3 = r3.mo10231a(r2)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r6.setVisibility(r3)
                java.lang.String r9 = "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$CouponListAdapter"
                java.lang.String r10 = "getView"
                java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                android.widget.ImageView r3 = r4.f210522b
                r3.setVisibility(r2)
            L_0x010a:
                java.lang.String r3 = r5.f232050i
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x011f
                android.widget.TextView r3 = r4.f210523c
                java.lang.String r6 = r5.f232050i
                r3.setText(r6)
                android.widget.TextView r3 = r4.f210523c
                r3.setVisibility(r2)
                goto L_0x0126
            L_0x011f:
                android.widget.TextView r3 = r4.f210523c
                r6 = 8
                r3.setVisibility(r6)
            L_0x0126:
                java.lang.String r3 = r5.f232049h
                y43.n r6 = r0.f210518f
                if (r6 == 0) goto L_0x014f
                java.util.LinkedList<y43.f> r6 = r6.f232088g
                if (r6 == 0) goto L_0x014f
                r7 = 0
            L_0x0131:
                int r8 = r6.size()
                if (r7 >= r8) goto L_0x014f
                java.lang.Object r8 = r6.get(r7)
                y43.f r8 = (y43.C79032f) r8
                java.lang.String r8 = r8.f232065d
                boolean r8 = r3.equals(r8)
                if (r8 == 0) goto L_0x014c
                java.lang.Object r3 = r6.get(r7)
                y43.f r3 = (y43.C79032f) r3
                goto L_0x0150
            L_0x014c:
                int r7 = r7 + 1
                goto L_0x0131
            L_0x014f:
                r3 = 0
            L_0x0150:
                java.lang.String r6 = r5.f232052n
                java.lang.String r5 = r5.f232053o
                if (r3 == 0) goto L_0x015a
                java.lang.String r6 = r3.f232066e
                java.lang.String r5 = r3.f232067f
            L_0x015a:
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r3 != 0) goto L_0x016d
                android.widget.TextView r3 = r4.f210524d
                r3.setText(r6)
                android.widget.TextView r3 = r4.f210524d
                r3.setVisibility(r2)
                r6 = 8
                goto L_0x0174
            L_0x016d:
                android.widget.TextView r3 = r4.f210524d
                r6 = 8
                r3.setVisibility(r6)
            L_0x0174:
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r3 != 0) goto L_0x0185
                android.widget.TextView r3 = r4.f210525e
                r3.setText(r5)
                android.widget.TextView r3 = r4.f210525e
                r3.setVisibility(r2)
                goto L_0x018a
            L_0x0185:
                android.widget.TextView r3 = r4.f210525e
                r3.setVisibility(r6)
            L_0x018a:
                b63.r<java.lang.String> r3 = r0.f210519g
                java.util.Vector<b63.r<K>$b> r3 = r3.f192932c
                java.lang.Object r1 = r3.get(r1)
                b63.r$b r1 = (b63.C67200r.C67202b) r1
                b63.r$a r1 = r1.f192939b
                b63.r$a r3 = b63.C67200r.C67201a.DISABLED
                if (r1 != r3) goto L_0x01a5
                android.widget.CheckBox r1 = r4.f210526f
                r1.setChecked(r2)
                android.widget.CheckBox r1 = r4.f210526f
                r1.setEnabled(r2)
                goto L_0x01ba
            L_0x01a5:
                android.widget.CheckBox r3 = r4.f210526f
                r5 = 1
                r3.setEnabled(r5)
                b63.r$a r3 = b63.C67200r.C67201a.CHECKED
                if (r1 != r3) goto L_0x01b5
                android.widget.CheckBox r1 = r4.f210526f
                r1.setChecked(r5)
                goto L_0x01ba
            L_0x01b5:
                android.widget.CheckBox r1 = r4.f210526f
                r1.setChecked(r2)
            L_0x01ba:
                return r20
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0.C72372a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.d0$b */
    public interface C72374b {
        /* renamed from: a */
        void mo99162a(FavorPayInfo favorPayInfo);
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.d0$c */
    public static final class C72375c {

        /* renamed from: a */
        public View f210521a;

        /* renamed from: b */
        public ImageView f210522b;

        /* renamed from: c */
        public TextView f210523c;

        /* renamed from: d */
        public TextView f210524d;

        /* renamed from: e */
        public TextView f210525e;

        /* renamed from: f */
        public CheckBox f210526f;
    }

    public C72371d0(Context context) {
        super(context, C0966R.style.a66);
        this.f210509d = LayoutInflater.from(context);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ceo, (ViewGroup) null);
        this.f210510e = inflate;
        this.f210511f = (MaxListView) inflate.findViewById(C0966R.C0970id.lgy);
        C72372a aVar = new C72372a();
        this.f210514i = aVar;
        this.f210511f.setAdapter(aVar);
        this.f210510e.findViewById(C0966R.C0970id.lgw).setOnClickListener(new C72336b0(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x020a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0 m84703d(android.content.Context r11, com.tencent.p014mm.plugin.wallet_core.model.Orders r12, java.lang.String r13, com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0.C72374b r14, android.content.DialogInterface.OnCancelListener r15) {
        /*
            com.tencent.mm.plugin.wallet_core.ui.d0 r0 = new com.tencent.mm.plugin.wallet_core.ui.d0
            r0.<init>(r11)
            r0.setOnCancelListener(r15)
            r15 = 1
            r0.setCancelable(r15)
            r1 = 0
            r0.setCanceledOnTouchOutside(r1)
            com.tencent.mm.plugin.wallet_core.ui.m r2 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m.INSTANCE
            com.tencent.mm.plugin.wallet_core.ui.l r12 = r2.mo99776a(r12)
            r0.f210513h = r12
            java.lang.String r2 = "MicroMsg.WalletFavorDialog"
            if (r12 != 0) goto L_0x0026
            java.lang.String r12 = "mFavorLogicHelper null & dismiss"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
            r0.dismiss()
            goto L_0x021c
        L_0x0026:
            com.tencent.mm.plugin.wallet_core.ui.d0$a r12 = r0.f210514i
            com.tencent.mm.plugin.wallet_core.ui.d0 r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0.this
            com.tencent.mm.plugin.wallet_core.ui.l r3 = r3.f210513h
            y43.l r4 = r3.f210614a
            java.lang.String r13 = r3.mo99765a(r13)
            com.tencent.mm.plugin.wallet_core.ui.d0 r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0.this
            com.tencent.mm.plugin.wallet_core.ui.l r3 = r3.f210513h
            java.util.List r3 = r3.mo99772i()
            r12.f210517e = r3
            com.tencent.mm.plugin.wallet_core.ui.d0 r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0.this
            com.tencent.mm.plugin.wallet_core.ui.l r3 = r3.f210513h
            y43.n r3 = r3.mo99770f(r13)
            r12.f210518f = r3
            r3 = -1
            r12.f210516d = r3
            r3 = 0
        L_0x004a:
            java.util.List<y43.d0> r5 = r12.f210517e
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x006d
            java.util.List<y43.d0> r5 = r12.f210517e
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            java.lang.Object r5 = r5.get(r3)
            y43.d0 r5 = (y43.C79030d0) r5
            int r5 = r5.f232056r
            if (r5 == 0) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            if (r5 == 0) goto L_0x006a
            r12.f210516d = r3
            goto L_0x006d
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x004a
        L_0x006d:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.List<y43.d0> r5 = r12.f210517e
            if (r5 == 0) goto L_0x01f9
            r5 = 0
        L_0x0077:
            java.util.List<y43.d0> r6 = r12.f210517e
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0093
            java.util.List<y43.d0> r6 = r12.f210517e
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            java.lang.Object r6 = r6.get(r5)
            y43.d0 r6 = (y43.C79030d0) r6
            java.lang.String r6 = r6.f232049h
            r3.add(r6)
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0093:
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            if (r4 == 0) goto L_0x00bd
            java.util.LinkedList<y43.d0> r6 = r4.f232072h
            if (r6 == 0) goto L_0x00bd
            r6 = 0
        L_0x009f:
            java.util.LinkedList<y43.d0> r7 = r4.f232072h
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00bd
            java.util.LinkedList<y43.d0> r7 = r4.f232072h
            java.lang.Object r7 = r7.get(r6)
            y43.d0 r7 = (y43.C79030d0) r7
            java.lang.String r7 = r7.f232049h
            boolean r8 = r3.contains(r7)
            if (r8 != 0) goto L_0x00ba
            r5.add(r7)
        L_0x00ba:
            int r6 = r6 + 1
            goto L_0x009f
        L_0x00bd:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            if (r4 == 0) goto L_0x01f3
            y43.m r4 = r4.f232073i
            if (r4 == 0) goto L_0x01f3
            java.util.LinkedList<y43.n> r4 = r4.f191301d
            if (r4 == 0) goto L_0x01f3
            r7 = 0
        L_0x00cd:
            int r8 = r4.size()
            if (r7 >= r8) goto L_0x00fc
            java.lang.Object r8 = r4.get(r7)
            y43.n r8 = (y43.C79034n) r8
            java.lang.String r8 = r8.f232085d
            r9 = 0
        L_0x00dc:
            int r10 = r5.size()
            if (r9 >= r10) goto L_0x00f3
            java.lang.Object r10 = r5.get(r9)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = r8.contains(r10)
            if (r10 == 0) goto L_0x00f0
            r9 = 1
            goto L_0x00f4
        L_0x00f0:
            int r9 = r9 + 1
            goto L_0x00dc
        L_0x00f3:
            r9 = 0
        L_0x00f4:
            if (r9 != 0) goto L_0x00f9
            r6.add(r8)
        L_0x00f9:
            int r7 = r7 + 1
            goto L_0x00cd
        L_0x00fc:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r5 != 0) goto L_0x012a
            java.lang.String r5 = "0"
            boolean r5 = r13.equals(r5)
            if (r5 != 0) goto L_0x012a
            java.lang.String r5 = "-"
            java.lang.String[] r13 = r13.split(r5)
            if (r13 == 0) goto L_0x0123
            r5 = 0
        L_0x0118:
            int r7 = r13.length
            if (r5 >= r7) goto L_0x012a
            r7 = r13[r5]
            r4.add(r7)
            int r5 = r5 + 1
            goto L_0x0118
        L_0x0123:
            java.lang.String r12 = "func[setCouponInfo] preKeyArr null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
            goto L_0x01fe
        L_0x012a:
            b63.r<java.lang.String> r12 = r12.f210519g
            b63.r$a r13 = b63.C67200r.C67201a.DISABLED
            b63.r$a r5 = b63.C67200r.C67201a.CHECKED
            r12.f192933d = r6
            r12.f192931b = r4
            java.util.Vector<b63.r<K>$b> r4 = r12.f192932c
            r4.clear()
            java.util.Vector r4 = new java.util.Vector
            int r7 = r3.size()
            r4.<init>(r7)
            r12.f192932c = r4
            r4 = 0
        L_0x0145:
            int r7 = r3.size()
            if (r4 >= r7) goto L_0x016b
            b63.r$b r7 = new b63.r$b
            r7.<init>(r12)
            java.lang.Object r8 = r3.get(r4)
            r7.f192938a = r8
            java.util.List<K> r9 = r12.f192931b
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L_0x0161
            r7.f192939b = r5
            goto L_0x0163
        L_0x0161:
            r7.f192939b = r13
        L_0x0163:
            java.util.Vector<b63.r<K>$b> r8 = r12.f192932c
            r8.add(r7)
            int r4 = r4 + 1
            goto L_0x0145
        L_0x016b:
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r12.f192930a
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.clear()
            r3 = 0
        L_0x0173:
            int r4 = r6.size()
            if (r3 >= r4) goto L_0x018d
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r12.f192930a
            java.lang.Object r7 = r6.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r7, r8)
            int r3 = r3 + 1
            goto L_0x0173
        L_0x018d:
            b63.r$a r3 = b63.C67200r.C67201a.UNCHECKED
            r4 = 0
        L_0x0190:
            java.util.Vector<b63.r<K>$b> r6 = r12.f192932c
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x01ff
            java.util.Vector<b63.r<K>$b> r6 = r12.f192932c
            java.lang.Object r6 = r6.get(r4)
            b63.r$b r6 = (b63.C67200r.C67202b) r6
            b63.r$a r6 = r6.f192939b
            if (r6 == r5) goto L_0x01f0
            java.util.Vector<b63.r<K>$b> r6 = r12.f192932c
            java.lang.String r6 = r12.mo91309a(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r12.f192930a
            java.util.HashMap r7 = (java.util.HashMap) r7
            boolean r7 = r7.containsKey(r6)
            if (r7 != 0) goto L_0x01ed
            java.lang.String[] r6 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72394l.m84746k(r6)
            r7 = 0
        L_0x01b9:
            java.util.List<java.lang.String> r8 = r12.f192933d
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x01e2
            r8 = 0
        L_0x01c2:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x01da
            java.util.List<java.lang.String> r9 = r12.f192933d
            java.lang.Object r9 = r9.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            r10 = r6[r8]
            boolean r9 = r9.contains(r10)
            if (r9 != 0) goto L_0x01d7
            r8 = 0
            goto L_0x01db
        L_0x01d7:
            int r8 = r8 + 1
            goto L_0x01c2
        L_0x01da:
            r8 = 1
        L_0x01db:
            if (r8 == 0) goto L_0x01df
            r6 = 1
            goto L_0x01e3
        L_0x01df:
            int r7 = r7 + 1
            goto L_0x01b9
        L_0x01e2:
            r6 = 0
        L_0x01e3:
            if (r6 == 0) goto L_0x01e9
            r12.mo91310b(r4, r3)
            goto L_0x01f0
        L_0x01e9:
            r12.mo91310b(r4, r13)
            goto L_0x01f0
        L_0x01ed:
            r12.mo91310b(r4, r3)
        L_0x01f0:
            int r4 = r4 + 1
            goto L_0x0190
        L_0x01f3:
            java.lang.String r12 = "func[setCouponInfo] favorInfo.favorComposeList or favorInfo.favorComposeList.favorComposeInfo null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
            goto L_0x01fe
        L_0x01f9:
            java.lang.String r12 = "func[setCouponInfo] mFavorList null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
        L_0x01fe:
            r15 = 0
        L_0x01ff:
            if (r15 != 0) goto L_0x020a
            java.lang.String r12 = "initFavorInfo failed & dismiss"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
            r0.dismiss()
            goto L_0x021c
        L_0x020a:
            android.widget.TextView r12 = r0.f210512g
            r13 = 2131839085(0x7f11486d, float:1.9311412E38)
            r12.setText(r13)
            com.tencent.mm.ui.base.MaxListView r12 = r0.f210511f
            com.tencent.mm.plugin.wallet_core.ui.c0 r13 = new com.tencent.mm.plugin.wallet_core.ui.c0
            r13.<init>(r0)
            r12.setOnItemClickListener(r13)
        L_0x021c:
            r0.f210515j = r14
            r0.show()
            nj3.C76879j.m92730a(r11, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0.m84703d(android.content.Context, com.tencent.mm.plugin.wallet_core.model.Orders, java.lang.String, com.tencent.mm.plugin.wallet_core.ui.d0$b, android.content.DialogInterface$OnCancelListener):com.tencent.mm.plugin.wallet_core.ui.d0");
    }

    /* renamed from: c */
    public final void mo99730c() {
        Log.m105918d("MicroMsg.WalletFavorDialog", "On selection done");
        C72372a aVar = this.f210514i;
        if (aVar != null) {
            C67200r<String> rVar = aVar.f210519g;
            this.f210515j.mo99162a(this.f210513h.mo99771g(rVar.mo91309a(rVar.f192932c, -1)));
        }
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WalletFavorDialog", "dismiss exception, e = " + e.getMessage());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f210510e);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            mo99730c();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        setCanceledOnTouchOutside(z);
    }
}
