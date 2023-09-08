package gt2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import eb0.C45628s0;
import gl3.C75921a;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.regex.Pattern;
import lv1.C99681n;
import p196ln.C76705f;
import p255vr.C78470h;

/* renamed from: gt2.a */
public class C76065a extends C75921a {

    /* renamed from: H */
    public static final Pattern f222912H = Pattern.compile(";");

    /* renamed from: B */
    public CharSequence f222913B;

    /* renamed from: C */
    public CharSequence f222914C;

    /* renamed from: D */
    public View.OnClickListener f222915D = null;

    /* renamed from: E */
    public C99681n f222916E;

    /* renamed from: F */
    public C76067b f222917F = new C76067b();

    /* renamed from: G */
    public C76066a f222918G = new C76066a(this);

    /* renamed from: gt2.a$a */
    public class C76066a implements C75922b.C75923a {

        /* renamed from: a */
        public ImageView f222919a;

        /* renamed from: b */
        public TextView f222920b;

        /* renamed from: c */
        public TextView f222921c;

        /* renamed from: d */
        public TextView f222922d;

        /* renamed from: e */
        public CheckBox f222923e;

        /* renamed from: f */
        public ImageView f222924f;

        public C76066a(C76065a aVar) {
        }
    }

    /* renamed from: gt2.a$b */
    public class C76067b implements C75922b.C75924b {

        /* renamed from: gt2.a$b$a */
        public class C76068a implements View.OnClickListener {
            public C76068a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/adapter/data/SnsSelectChatRoomDataItem$SnsChatRoomViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem$1");
                View.OnClickListener onClickListener = C76065a.this.f222915D;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/adapter/data/SnsSelectChatRoomDataItem$SnsChatRoomViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C76067b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            Class cls = C78470h.class;
            SnsMethodCalculate.markStartTimeMs("fillingViewItem", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
            C76066a aVar2 = (C76066a) aVar;
            C76065a aVar3 = (C76065a) bVar;
            String str = aVar3.f222602y;
            if (str == null || str.length() <= 0) {
                aVar2.f222919a.setImageResource(C0966R.C0969drawable.bfa);
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(aVar2.f222919a, aVar3.f222602y, 0.1f);
            }
            ((C78470h) C86312j.m106911c(cls)).mo108300VH(aVar3.f222601x, aVar2.f222920b);
            if (C45628s0.m50748M(aVar3.f222602y)) {
                Drawable drawable = context.getResources().getDrawable(C0966R.raw.open_im_main_logo);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                aVar2.f222920b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } else {
                aVar2.f222920b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            ((C78470h) C86312j.m106911c(cls)).mo108300VH(aVar3.f222914C, aVar2.f222921c);
            ((C78470h) C86312j.m106911c(cls)).mo108300VH(aVar3.f222913B, aVar2.f222922d);
            if (C76065a.this.f222608e) {
                if (z) {
                    aVar2.f222923e.setChecked(true);
                    aVar2.f222923e.setEnabled(false);
                    aVar2.f222923e.setBackgroundResource(C85875k4.m106211z() ? C0966R.raw.checkbox_selected_grey_dark : C0966R.raw.checkbox_selected_grey);
                } else {
                    aVar2.f222923e.setChecked(z2);
                    aVar2.f222923e.setEnabled(true);
                }
                aVar2.f222923e.setVisibility(0);
            } else {
                aVar2.f222923e.setVisibility(8);
            }
            aVar2.f222924f.setTag(C76065a.this.f222600A);
            SnsMethodCalculate.markEndTimeMs("fillingViewItem", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            SnsMethodCalculate.markStartTimeMs("inflateView", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c44, viewGroup, false);
            C76065a aVar = C76065a.this;
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("createViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
            C76066a aVar2 = aVar.f222918G;
            SnsMethodCalculate.markEndTimeMs("createViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
            aVar2.f222919a = (ImageView) inflate.findViewById(C0966R.C0970id.jrw);
            aVar2.f222920b = (TextView) inflate.findViewById(C0966R.C0970id.f359247js1);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.jrx);
            aVar2.f222921c = textView;
            textView.setVisibility(8);
            aVar2.f222922d = (TextView) inflate.findViewById(C0966R.C0970id.f359246js0);
            aVar2.f222923e = (CheckBox) inflate.findViewById(C0966R.C0970id.jrz);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.jry);
            aVar2.f222924f = imageView;
            imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.sns_label_more_btn, context.getResources().getColor(C0966R.color.BW_50)));
            aVar2.f222924f.setOnClickListener(new C76068a());
            inflate.setTag(aVar2);
            SnsMethodCalculate.markEndTimeMs("inflateView", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
            SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem$SnsChatRoomViewItem");
            return false;
        }
    }

    public C76065a(int i) {
        super(4, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0152  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67027a(android.content.Context r19, gl3.C75922b.C75923a r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r19
            java.lang.Class<d62.i> r1 = d62.C75339i.class
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            java.lang.String r8 = "fillingDataItem"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            lv1.n r3 = r0.f222916E
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x004f
            com.tencent.mm.storage.z1 r3 = r0.f222600A
            if (r3 != 0) goto L_0x004d
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r2)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            lv1.n r4 = r0.f222916E
            java.lang.String r4 = r4.f292151e
            com.tencent.mm.storage.z1 r3 = r3.mo69674W2(r4)
            r0.mo106181j(r3)
            com.tencent.mm.storage.z1 r3 = r0.f222600A
            if (r3 != 0) goto L_0x004d
            f40.C86709a0.m107528h()
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            lv1.n r3 = r0.f222916E
            java.lang.String r3 = r3.f292151e
            com.tencent.mm.storage.z1 r2 = r2.mo69656H3(r3)
            r0.mo106181j(r2)
        L_0x004d:
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            com.tencent.mm.storage.z1 r3 = r0.f222600A
            if (r3 != 0) goto L_0x005c
            java.lang.String r1 = ""
            r0.f222601x = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return
        L_0x005c:
            java.lang.String r3 = r3.getUsername()
            r0.f222602y = r3
            java.lang.String r3 = ")"
            java.lang.String r4 = "("
            if (r2 == 0) goto L_0x0162
            r2 = r20
            gt2.a$a r2 = (gt2.C76065a.C76066a) r2
            lv1.n r2 = r0.f222916E
            com.tencent.mm.storage.z1 r5 = r0.f222600A
            java.lang.String r12 = "formatText"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r9)
            android.content.res.Resources r13 = r19.getResources()
            di3.d r1 = di3.C86312j.m106911c(r1)
            d62.i r1 = (d62.C75339i) r1
            java.lang.String r6 = r5.getUsername()
            java.lang.String r14 = r1.pv0(r5, r6)
            int r1 = r2.f292149c
            if (r1 == r10) goto L_0x0127
            r15 = 2
            if (r1 == r15) goto L_0x0125
            r6 = 3
            if (r1 == r6) goto L_0x0124
            r6 = 5
            if (r1 == r6) goto L_0x0127
            r6 = 6
            if (r1 == r6) goto L_0x0125
            r6 = 7
            if (r1 == r6) goto L_0x0124
            r6 = 38
            if (r1 == r6) goto L_0x00a0
            goto L_0x0120
        L_0x00a0:
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            zh3.f r1 = r1.f251811i
            java.lang.String[] r6 = new java.lang.String[r10]
            java.lang.String r5 = r5.getUsername()
            r6[r11] = r5
            java.lang.String r5 = "SELECT memberlist FROM chatroom WHERE chatroomname=?;"
            android.database.Cursor r1 = r1.rawQuery(r5, r6, r15)
            boolean r5 = r1.moveToFirst()
            if (r5 == 0) goto L_0x00d0
            java.lang.String r5 = r1.getString(r11)
            r1.close()
            if (r5 != 0) goto L_0x00c8
            r1 = 0
            goto L_0x00ce
        L_0x00c8:
            java.util.regex.Pattern r1 = f222912H
            java.lang.String[] r1 = r1.split(r5)
        L_0x00ce:
            r5 = r1
            goto L_0x00d4
        L_0x00d0:
            r1.close()
            r5 = 0
        L_0x00d4:
            if (r5 == 0) goto L_0x00ee
            int r1 = r5.length
            if (r1 <= 0) goto L_0x00ee
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            int r4 = r5.length
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.f222913B = r1
        L_0x00ee:
            if (r5 == 0) goto L_0x0120
            java.util.List<lv1.h> r1 = r2.f292160n
            if (r1 != 0) goto L_0x00f5
            goto L_0x0120
        L_0x00f5:
            java.lang.Class<vr.h> r1 = p255vr.C78470h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            vr.h r1 = (p255vr.C78470h) r1
            java.util.List<lv1.h> r3 = r2.f292160n
            lv1.i r6 = r0.f222603z
            android.text.TextPaint r16 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
            r2 = r19
            r4 = r5
            r5 = r6
            r6 = r16
            java.lang.CharSequence r1 = r1.yk0(r2, r3, r4, r5, r6)
            r2 = 2131835405(0x7f113a0d, float:1.9303948E38)
            java.lang.String r2 = r13.getString(r2)
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r15]
            r3[r11] = r2
            r3[r10] = r1
            java.lang.CharSequence r1 = android.text.TextUtils.concat(r3)
            r6 = r1
            goto L_0x0121
        L_0x0120:
            r6 = 0
        L_0x0121:
            r1 = 0
            r10 = 0
            goto L_0x0134
        L_0x0124:
            r11 = 1
        L_0x0125:
            r1 = 1
            goto L_0x0128
        L_0x0127:
            r1 = 0
        L_0x0128:
            r2 = 2131835407(0x7f113a0f, float:1.9303952E38)
            r13.getString(r2)
            r6 = 0
            r17 = r11
            r11 = r1
            r1 = r17
        L_0x0134:
            r2 = 2131165537(0x7f070161, float:1.7945294E38)
            if (r10 == 0) goto L_0x0152
            int r2 = kg3.C76577a.m92157h(r7, r2)
            android.text.SpannableString r2 = r0.mo106188i(r7, r14, r2)
            r0.f222601x = r2
            lv1.i r3 = r0.f222603z
            lv1.f r1 = lv1.C99667f.m130091d(r2, r3, r11, r1)
            lv1.g r1 = kv1.C99254i.m129308e(r1)
            java.lang.CharSequence r1 = r1.f292107a
            r0.f222601x = r1
            goto L_0x015c
        L_0x0152:
            int r1 = kg3.C76577a.m92157h(r7, r2)
            android.text.SpannableString r1 = r0.mo106188i(r7, r14, r1)
            r0.f222601x = r1
        L_0x015c:
            r0.f222914C = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r9)
            goto L_0x0190
        L_0x0162:
            di3.d r1 = di3.C86312j.m106911c(r1)
            d62.i r1 = (d62.C75339i) r1
            com.tencent.mm.storage.z1 r2 = r0.f222600A
            java.lang.String r5 = r2.getUsername()
            java.lang.String r1 = r1.pv0(r2, r5)
            r0.f222601x = r1
            lv1.n r1 = r0.f222916E
            if (r1 == 0) goto L_0x0190
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            lv1.n r2 = r0.f222916E
            long r4 = r2.f292150d
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.f222913B = r1
        L_0x0190:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gt2.C76065a.mo67027a(android.content.Context, gl3.b$a):void");
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        SnsMethodCalculate.markStartTimeMs("getViewItem", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        C76067b bVar = this.f222917F;
        SnsMethodCalculate.markEndTimeMs("getViewItem", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        return bVar;
    }
}
