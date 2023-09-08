package jc1;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import j20.C117292a;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import lv1.C99681n;
import pv1.C22019b;
import te3.C101811md0;

/* renamed from: jc1.a */
public class C98932a extends C22019b {

    /* renamed from: A */
    public static final Pattern f290004A = Pattern.compile("['\r\n' | '\n']+");

    /* renamed from: B */
    public static final MMHandler f290005B = new MMHandler(Looper.getMainLooper());

    /* renamed from: z */
    public static final String f290006z = MMApplicationContext.getContext().getString(C0966R.string.f3k);

    /* renamed from: p */
    public C99681n f290007p;

    /* renamed from: q */
    public boolean f290008q;

    /* renamed from: r */
    public CharSequence f290009r;

    /* renamed from: s */
    public CharSequence f290010s;

    /* renamed from: t */
    public CharSequence f290011t;

    /* renamed from: u */
    public String f290012u;

    /* renamed from: v */
    public String f290013v;

    /* renamed from: w */
    public int f290014w;

    /* renamed from: x */
    public C98934b f290015x = new C98934b();

    /* renamed from: y */
    public C98933a f290016y = new C98933a(this);

    /* renamed from: jc1.a$a */
    public class C98933a extends C22019b.C22020a {

        /* renamed from: a */
        public MMImageView f290017a;

        /* renamed from: b */
        public TextView f290018b;

        /* renamed from: c */
        public TextView f290019c;

        /* renamed from: d */
        public TextView f290020d;

        /* renamed from: e */
        public View f290021e;

        public C98933a(C98932a aVar) {
            super(aVar);
        }
    }

    /* renamed from: jc1.a$b */
    public class C98934b extends C22019b.C22021b {
        public C98934b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C98933a aVar2 = (C98933a) aVar;
            C98932a aVar3 = (C98932a) bVar;
            MMImageView mMImageView = aVar2.f290017a;
            C93938f0.m118700h(context, mMImageView, aVar3.f290013v, aVar3.f290012u, aVar3.f290014w, false, mMImageView.getMeasuredWidth(), aVar2.f290017a.getMeasuredHeight());
            TextView textView = aVar2.f290018b;
            TextView textView2 = aVar2.f290019c;
            C98932a aVar4 = C98932a.this;
            CharSequence charSequence = aVar4.f290009r;
            CharSequence charSequence2 = aVar4.f290010s;
            try {
                if (C93938f0.m118693a(charSequence, textView)) {
                    if (C93938f0.m118693a(charSequence2, textView2)) {
                        textView.setMaxLines(1);
                        textView2.setMaxLines(1);
                    } else {
                        textView.setMaxLines(2);
                    }
                } else if (C93938f0.m118693a(charSequence2, textView2)) {
                    textView2.setMaxLines(2);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FTS.FTSFavoriteDataItem", e, "fillingCommonItemTitleAndDesc", new Object[0]);
            }
            C93938f0.m118693a(C98932a.this.f290011t, aVar2.f290020d);
            if (C98932a.this.f290008q) {
                View view = aVar2.f290021e;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = aVar2.f290021e;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar6.mo10232b(), "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cqv, viewGroup, false);
            C98933a aVar = C98932a.this.f290016y;
            aVar.f290017a = (MMImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f290018b = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            aVar.f290019c = (TextView) inflate.findViewById(C0966R.C0970id.f5297b9);
            aVar.f290020d = (TextView) inflate.findViewById(C0966R.C0970id.k1g);
            aVar.f290021e = inflate.findViewById(C0966R.C0970id.c7p);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 10;
            aVar.f264839e = ((C98932a) bVar).f290007p.f292150d;
            aVar.f264842h = context;
            aVar.f264853s = new C101811md0();
            C98932a aVar2 = C98932a.this;
            if (aVar2.f62328f == 1) {
                favoriteOperationEvent.f264833d.f264853s.f298813d = 3;
            } else {
                favoriteOperationEvent.f264833d.f264853s.f298813d = 4;
            }
            C101811md0 md02 = favoriteOperationEvent.f264833d.f264853s;
            md02.f298814e = 3;
            md02.f298815f = aVar2.f62332j;
            favoriteOperationEvent.publish();
            return true;
        }
    }

    public C98932a(int i) {
        super(6, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02dd, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e1, code lost:
        if (r10 == null) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02e3, code lost:
        r5 = mo138276m(r10, true) + "-" + mo138275l(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0307, code lost:
        if (com.tencent.p014mm.storage.C72996z1.m85820U5(r5.getUsername()) == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0309, code lost:
        r5 = mo138275l(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x030d, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x030f, code lost:
        r8 = true;
        r5 = mo138276m(r5, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0314, code lost:
        r4 = ((f62.C75700k0) f40.C86709a0.m107533q(r4)).mo96097Ni().get(r2.f299736i);
        r4 = r5 + "-" + mo138276m(r4, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x033e, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0342, code lost:
        if (r10 == null) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0344, code lost:
        r5 = mo138276m(r10, false) + "-" + mo138275l(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x035f, code lost:
        r5 = mo138276m(r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0363, code lost:
        r6 = r4;
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0365, code lost:
        r5 = r4;
        r4 = r3;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x036c, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0370, code lost:
        r6 = r4;
        r4 = r3;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0373, code lost:
        if (r10 == null) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0375, code lost:
        r5 = mo138276m(r10, true) + "-" + mo138275l(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0399, code lost:
        if (com.tencent.p014mm.storage.C72996z1.m85820U5(r5.getUsername()) == false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039b, code lost:
        r5 = mo138275l(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a0, code lost:
        r5 = mo138276m(r5, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a5, code lost:
        r5 = ((p629ny.C76979h) di3.C86312j.m106911c(p629ny.C76979h.class)).op0(r1, r5, kg3.C76577a.m92157h(r1, com.tencent.p014mm.C0966R.dimen.f3881hq));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b8, code lost:
        if (r3 == false) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03ba, code lost:
        r5 = kv1.C99254i.m129308e(lv1.C99667f.m130091d(r5, r0.f62327e, r6, r4)).f292107a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03c6, code lost:
        r1 = android.text.TextUtils.concat(new java.lang.CharSequence[]{r20.getResources().getString(com.tencent.p014mm.C0966R.string.igl), r5});
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35129a(android.content.Context r20, pv1.C22019b.C22020a r21, java.lang.Object... r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            lv1.n r2 = r0.f290007p
            long r2 = r2.f292150d
            com.tencent.mm.autogen.events.FavoriteOperationEvent r4 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
            r4.<init>()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r5 = r4.f264833d
            r6 = 9
            r5.f264835a = r6
            r5.f264839e = r2
            r4.publish()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$b r2 = r4.f264834e
            te3.wc0 r2 = r2.f264860f
            java.lang.String r3 = "MicroMsg.FTS.FTSFavoriteDataItem"
            if (r2 == 0) goto L_0x0424
            lv1.n r4 = r0.f290007p
            long r4 = r4.f292150d
            com.tencent.mm.autogen.events.FavoriteOperationEvent r6 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
            r6.<init>()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r7 = r6.f264833d
            r8 = 11
            r7.f264835a = r8
            r7.f264839e = r4
            com.tencent.mm.sdk.platformtools.MMHandler r4 = f290005B
            r7.f264843i = r4
            r6.publish()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$b r4 = r6.f264834e
            java.lang.String r4 = r4.f264858d
            java.lang.String r5 = ""
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r5)
            r0.f290012u = r4
            com.tencent.mm.autogen.events.FavoriteOperationEvent$b r4 = r6.f264834e
            java.lang.String r4 = r4.f264859e
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r5)
            r0.f290013v = r4
            lv1.n r4 = r0.f290007p
            int r6 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            r7 = 2
            int r6 = r6 * 2
            float r6 = (float) r6
            te3.kd0 r9 = r2.f299739o
            int r10 = r2.f299738n
            java.lang.String r11 = " "
            java.lang.String r12 = "-"
            r15 = 6
            r14 = 3
            r13 = 4
            r8 = 1
            if (r10 == r8) goto L_0x0143
            if (r10 == r7) goto L_0x0137
            if (r10 == r14) goto L_0x012b
            if (r10 == r13) goto L_0x011f
            if (r10 == r15) goto L_0x0104
            r3 = 7
            if (r10 == r3) goto L_0x00e5
            r3 = 10
            if (r10 == r3) goto L_0x00dd
            r3 = 11
            if (r10 == r3) goto L_0x00dd
            r3 = 14
            if (r10 == r3) goto L_0x0094
            r3 = 16
            if (r10 == r3) goto L_0x0087
            r3 = 21
            if (r10 == r3) goto L_0x00e5
            java.lang.String r3 = r2.f299731d
            goto L_0x0158
        L_0x0087:
            android.content.res.Resources r3 = r20.getResources()
            r9 = 2131835427(0x7f113a23, float:1.9303992E38)
            java.lang.String r3 = r3.getString(r9)
            goto L_0x0158
        L_0x0094:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.util.LinkedList<te3.rc0> r9 = r9.f298618f
            java.util.Iterator r9 = r9.iterator()
        L_0x009f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00bc
            java.lang.Object r10 = r9.next()
            te3.rc0 r10 = (te3.C101834rc0) r10
            java.lang.String r10 = pb1.C100734q.m131872s(r10)
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r16 != 0) goto L_0x009f
            r3.append(r10)
            r3.append(r11)
            goto L_0x009f
        L_0x00bc:
            java.util.regex.Pattern r9 = f290004A
            java.lang.String r3 = r3.toString()
            java.util.regex.Matcher r3 = r9.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r11)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r9 == 0) goto L_0x0158
            android.content.res.Resources r3 = r20.getResources()
            r9 = 2131835426(0x7f113a22, float:1.930399E38)
            java.lang.String r3 = r3.getString(r9)
            goto L_0x0158
        L_0x00dd:
            te3.jd0 r3 = r9.f298634y
            if (r3 == 0) goto L_0x0157
            java.lang.String r3 = r3.f298511d
            goto L_0x0158
        L_0x00e5:
            java.lang.String r3 = r2.f299731d
            java.lang.String r9 = r2.f299732e
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0158
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r12)
            java.lang.String r3 = r2.f299732e
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            goto L_0x0158
        L_0x0104:
            te3.zc0 r3 = r9.f298620h
            java.lang.String r9 = f290006z
            java.lang.String r10 = r3.f299958o
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x011c
            java.lang.String r9 = r3.f299958o
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0119
            goto L_0x011c
        L_0x0119:
            java.lang.String r3 = r3.f299958o
            goto L_0x0158
        L_0x011c:
            java.lang.String r3 = r3.f299956j
            goto L_0x0158
        L_0x011f:
            android.content.res.Resources r3 = r20.getResources()
            r9 = 2131835428(0x7f113a24, float:1.9303994E38)
            java.lang.String r3 = r3.getString(r9)
            goto L_0x0158
        L_0x012b:
            android.content.res.Resources r3 = r20.getResources()
            r9 = 2131835429(0x7f113a25, float:1.9303996E38)
            java.lang.String r3 = r3.getString(r9)
            goto L_0x0158
        L_0x0137:
            android.content.res.Resources r3 = r20.getResources()
            r9 = 2131835424(0x7f113a20, float:1.9303986E38)
            java.lang.String r3 = r3.getString(r9)
            goto L_0x0158
        L_0x0143:
            java.lang.String r9 = r2.f299732e
            if (r9 == 0) goto L_0x0152
            java.util.regex.Pattern r3 = f290004A
            java.util.regex.Matcher r3 = r3.matcher(r9)
            java.lang.String r3 = r3.replaceAll(r11)
            goto L_0x0158
        L_0x0152:
            java.lang.String r9 = "favExportInfo.desc is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
        L_0x0157:
            r3 = r5
        L_0x0158:
            int r4 = r4.f292149c
            switch(r4) {
                case 1: goto L_0x015e;
                case 2: goto L_0x015e;
                case 3: goto L_0x015e;
                case 4: goto L_0x015e;
                case 5: goto L_0x015e;
                case 6: goto L_0x015e;
                default: goto L_0x015d;
            }
        L_0x015d:
            goto L_0x016c
        L_0x015e:
            lv1.i r4 = r0.f62327e
            android.text.TextPaint r9 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
            lv1.f r3 = lv1.C99667f.m130090c(r3, r4, r6, r9)
            lv1.g r3 = kv1.C99254i.m129308e(r3)
            java.lang.CharSequence r3 = r3.f292107a
        L_0x016c:
            r0.f290009r = r3
            lv1.n r3 = r0.f290007p
            te3.kd0 r4 = r2.f299739o
            int r6 = r2.f299738n
            r9 = 5
            if (r6 == r7) goto L_0x01c9
            r10 = 21
            if (r6 == r10) goto L_0x01b0
            if (r6 == r9) goto L_0x01b0
            if (r6 == r15) goto L_0x0195
            r10 = 7
            if (r6 == r10) goto L_0x01b0
            r10 = 14
            if (r6 == r10) goto L_0x01c7
            r10 = 15
            if (r6 == r10) goto L_0x01b0
            switch(r6) {
                case 10: goto L_0x018e;
                case 11: goto L_0x018e;
                case 12: goto L_0x01b0;
                default: goto L_0x018d;
            }
        L_0x018d:
            goto L_0x01c7
        L_0x018e:
            te3.jd0 r4 = r4.f298634y
            if (r4 == 0) goto L_0x01c7
            java.lang.String r4 = r4.f298513f
            goto L_0x01cb
        L_0x0195:
            te3.zc0 r4 = r4.f298620h
            java.lang.String r6 = f290006z
            java.lang.String r10 = r4.f299958o
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x01ad
            java.lang.String r6 = r4.f299958o
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x01aa
            goto L_0x01ad
        L_0x01aa:
            java.lang.String r4 = r4.f299958o
            goto L_0x01cb
        L_0x01ad:
            java.lang.String r4 = r4.f299956j
            goto L_0x01cb
        L_0x01b0:
            java.lang.String r4 = r2.f299735h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x01c7
            java.lang.Class<ym.l> r4 = p763ym.C79138l.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ym.l r4 = (p763ym.C79138l) r4
            java.lang.String r6 = r2.f299735h
            java.lang.String r4 = r4.mo74012l5(r1, r6)
            goto L_0x01cb
        L_0x01c7:
            r4 = r5
            goto L_0x01cb
        L_0x01c9:
            java.lang.String r4 = r2.f299731d
        L_0x01cb:
            int r3 = r3.f292149c
            r6 = -1
            r10 = 8
            r11 = 0
            if (r3 == r15) goto L_0x0259
            r15 = 7
            if (r3 == r15) goto L_0x01f0
            if (r3 == r10) goto L_0x01f0
            r15 = 23
            if (r3 == r15) goto L_0x01df
            r15 = r5
            goto L_0x0266
        L_0x01df:
            r3 = 2131835423(0x7f113a1f, float:1.9303984E38)
            lv1.i r15 = r0.f62327e
            lv1.f r15 = lv1.C99667f.m130089b(r4, r15)
            lv1.g r15 = kv1.C99254i.m129308e(r15)
            java.lang.CharSequence r15 = r15.f292107a
            goto L_0x0267
        L_0x01f0:
            java.util.LinkedList<java.lang.String> r3 = r2.f299737j
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            lv1.i r15 = r0.f62327e
            java.lang.String[] r15 = r15.f292122c
            int r10 = r15.length
            r9 = 0
        L_0x01fd:
            if (r9 >= r10) goto L_0x0234
            r13 = r15[r9]
            java.util.Iterator r17 = r3.iterator()
        L_0x0205:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x022e
            java.lang.Object r18 = r17.next()
            r14 = r18
            java.lang.String r14 = (java.lang.String) r14
            java.util.HashMap<java.lang.String, java.lang.String> r18 = kv1.C99251g.f291026a
            java.lang.String r18 = r14.toLowerCase()
            java.lang.String r8 = kv1.C99255j.m129319c(r18)
            boolean r8 = r8.contains(r13)
            if (r8 == 0) goto L_0x022b
            r4.append(r14)
            java.lang.String r8 = ","
            r4.append(r8)
        L_0x022b:
            r8 = 1
            r14 = 3
            goto L_0x0205
        L_0x022e:
            int r9 = r9 + 1
            r8 = 1
            r13 = 4
            r14 = 3
            goto L_0x01fd
        L_0x0234:
            r4.trimToSize()
            int r3 = r4.length()
            if (r3 != 0) goto L_0x023f
            r4 = r5
            goto L_0x0249
        L_0x023f:
            int r3 = r4.length()
            int r3 = r3 + r6
            java.lang.String r3 = r4.substring(r11, r3)
            r4 = r3
        L_0x0249:
            lv1.i r3 = r0.f62327e
            lv1.f r3 = lv1.C99667f.m130089b(r4, r3)
            lv1.g r3 = kv1.C99254i.m129308e(r3)
            java.lang.CharSequence r15 = r3.f292107a
            r3 = 2131835425(0x7f113a21, float:1.9303988E38)
            goto L_0x0267
        L_0x0259:
            lv1.i r3 = r0.f62327e
            lv1.f r3 = lv1.C99667f.m130089b(r4, r3)
            lv1.g r3 = kv1.C99254i.m129308e(r3)
            java.lang.CharSequence r3 = r3.f292107a
            r15 = r3
        L_0x0266:
            r3 = -1
        L_0x0267:
            if (r3 == r6) goto L_0x0282
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0282
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[r7]
            android.content.res.Resources r6 = r20.getResources()
            java.lang.String r3 = r6.getString(r3)
            r4[r11] = r3
            r3 = 1
            r4[r3] = r15
            java.lang.CharSequence r15 = android.text.TextUtils.concat(r4)
        L_0x0282:
            r0.f290010s = r15
            lv1.n r3 = r0.f290007p
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            java.lang.String r6 = r2.f299733f
            java.lang.String r8 = r2.f299734g
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r10 = 0
            if (r9 == 0) goto L_0x0295
            r6 = r8
            r8 = r10
        L_0x0295:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r9 == 0) goto L_0x02a2
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r5)
            goto L_0x03dc
        L_0x02a2:
            k40.a r5 = f40.C86709a0.m107533q(r4)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()
            com.tencent.mm.storage.z1 r5 = r5.get(r6)
            r5.setUsername(r6)
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
            if (r6 == 0) goto L_0x02d0
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r6 != 0) goto L_0x02d0
            k40.a r6 = f40.C86709a0.m107533q(r4)
            f62.k0 r6 = (f62.C75700k0) r6
            com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()
            com.tencent.mm.storage.z1 r10 = r6.get(r8)
            r10.setUsername(r8)
        L_0x02d0:
            int r3 = r3.f292149c
            switch(r3) {
                case 9: goto L_0x036e;
                case 10: goto L_0x036b;
                case 11: goto L_0x0369;
                case 12: goto L_0x0340;
                case 13: goto L_0x033d;
                case 14: goto L_0x033b;
                case 15: goto L_0x02d5;
                case 16: goto L_0x036e;
                case 17: goto L_0x036b;
                case 18: goto L_0x0369;
                case 19: goto L_0x02d5;
                case 20: goto L_0x02df;
                case 21: goto L_0x02dc;
                case 22: goto L_0x02da;
                default: goto L_0x02d5;
            }
        L_0x02d5:
            r3 = 0
            r4 = 0
            r6 = 0
            goto L_0x0373
        L_0x02da:
            r3 = 1
            goto L_0x02dd
        L_0x02dc:
            r3 = 0
        L_0x02dd:
            r6 = 1
            goto L_0x02e1
        L_0x02df:
            r3 = 0
            r6 = 0
        L_0x02e1:
            if (r10 == 0) goto L_0x02ff
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 1
            java.lang.String r10 = r0.mo138276m(r10, r9)
            r8.append(r10)
            r8.append(r12)
            java.lang.String r5 = r0.mo138275l(r1, r5)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            goto L_0x030d
        L_0x02ff:
            java.lang.String r8 = r5.getUsername()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            if (r8 == 0) goto L_0x030f
            java.lang.String r5 = r0.mo138275l(r1, r5)
        L_0x030d:
            r8 = 1
            goto L_0x0314
        L_0x030f:
            r8 = 1
            java.lang.String r5 = r0.mo138276m(r5, r8)
        L_0x0314:
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            java.lang.String r9 = r2.f299736i
            com.tencent.mm.storage.z1 r4 = r4.get(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r12)
            java.lang.String r4 = r0.mo138276m(r4, r8)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            goto L_0x0365
        L_0x033b:
            r3 = 1
            goto L_0x033e
        L_0x033d:
            r3 = 0
        L_0x033e:
            r4 = 1
            goto L_0x0342
        L_0x0340:
            r3 = 0
            r4 = 0
        L_0x0342:
            if (r10 == 0) goto L_0x035f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.mo138276m(r10, r11)
            r6.append(r8)
            r6.append(r12)
            java.lang.String r5 = r0.mo138275l(r1, r5)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x0363
        L_0x035f:
            java.lang.String r5 = r0.mo138276m(r5, r11)
        L_0x0363:
            r6 = r4
            r4 = r5
        L_0x0365:
            r5 = r4
            r4 = r3
            r3 = 1
            goto L_0x03a5
        L_0x0369:
            r3 = 1
            goto L_0x036c
        L_0x036b:
            r3 = 0
        L_0x036c:
            r4 = 1
            goto L_0x0370
        L_0x036e:
            r3 = 0
            r4 = 0
        L_0x0370:
            r6 = r4
            r4 = r3
            r3 = 1
        L_0x0373:
            if (r10 == 0) goto L_0x0391
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 1
            java.lang.String r10 = r0.mo138276m(r10, r9)
            r8.append(r10)
            r8.append(r12)
            java.lang.String r5 = r0.mo138275l(r1, r5)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            goto L_0x03a5
        L_0x0391:
            java.lang.String r8 = r5.getUsername()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            if (r8 == 0) goto L_0x03a0
            java.lang.String r5 = r0.mo138275l(r1, r5)
            goto L_0x03a5
        L_0x03a0:
            r8 = 1
            java.lang.String r5 = r0.mo138276m(r5, r8)
        L_0x03a5:
            java.lang.Class<ny.h> r8 = p629ny.C76979h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ny.h r8 = (p629ny.C76979h) r8
            r9 = 2131165537(0x7f070161, float:1.7945294E38)
            int r9 = kg3.C76577a.m92157h(r1, r9)
            android.text.SpannableString r5 = r8.op0(r1, r5, r9)
            if (r3 == 0) goto L_0x03c6
            lv1.i r3 = r0.f62327e
            lv1.f r3 = lv1.C99667f.m130091d(r5, r3, r6, r4)
            lv1.g r3 = kv1.C99254i.m129308e(r3)
            java.lang.CharSequence r5 = r3.f292107a
        L_0x03c6:
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r7]
            android.content.res.Resources r1 = r20.getResources()
            r4 = 2131835394(0x7f113a02, float:1.9303925E38)
            java.lang.String r1 = r1.getString(r4)
            r3[r11] = r1
            r1 = 1
            r3[r1] = r5
            java.lang.CharSequence r1 = android.text.TextUtils.concat(r3)
        L_0x03dc:
            r0.f290011t = r1
            int r1 = r2.f299738n
            r3 = 3
            if (r1 == r3) goto L_0x041e
            r3 = 4
            if (r1 == r3) goto L_0x041a
            r3 = 5
            if (r1 == r3) goto L_0x0416
            r3 = 6
            if (r1 == r3) goto L_0x0412
            r3 = 8
            if (r1 == r3) goto L_0x03f1
            goto L_0x040e
        L_0x03f1:
            te3.kd0 r1 = r2.f299739o
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            if (r1 == 0) goto L_0x040e
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x040e
            te3.kd0 r1 = r2.f299739o
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            java.lang.Object r1 = r1.get(r11)
            te3.rc0 r1 = (te3.C101834rc0) r1
            java.lang.String r1 = r1.f299262K
            int r1 = wc3.C102430l.m135146a(r1)
            goto L_0x0421
        L_0x040e:
            r1 = 2131755793(0x7f100311, float:1.9142475E38)
            goto L_0x0421
        L_0x0412:
            r1 = 2131755088(0x7f100050, float:1.9141045E38)
            goto L_0x0421
        L_0x0416:
            r1 = 2131755119(0x7f10006f, float:1.9141108E38)
            goto L_0x0421
        L_0x041a:
            r1 = 2131755116(0x7f10006c, float:1.9141102E38)
            goto L_0x0421
        L_0x041e:
            r1 = 2131755118(0x7f10006e, float:1.9141106E38)
        L_0x0421:
            r0.f290014w = r1
            goto L_0x043c
        L_0x0424:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "favExportInfo is null, id: "
            r1.append(r2)
            lv1.n r2 = r0.f290007p
            long r4 = r2.f292150d
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
        L_0x043c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jc1.C98932a.mo35129a(android.content.Context, pv1.b$a, java.lang.Object[]):void");
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f290007p.f292164r;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f290015x;
    }

    /* renamed from: l */
    public final String mo138275l(Context context, C72996z1 z1Var) {
        String n2 = z1Var.mo73969n2();
        if (Util.isNullOrNil(n2)) {
            n2 = z1Var.getNickname();
        }
        return Util.isNullOrNil(n2) ? context.getString(C0966R.string.f2q) : n2;
    }

    /* renamed from: m */
    public final String mo138276m(C72996z1 z1Var, boolean z) {
        String nickname = z ? Util.isNullOrNil(z1Var.mo73969n2()) ? z1Var.getNickname() : z1Var.mo73969n2() : z1Var.getNickname();
        return Util.isNullOrNil(nickname) ? z1Var.getUsername() : nickname;
    }
}
