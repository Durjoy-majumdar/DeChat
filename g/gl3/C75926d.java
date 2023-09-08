package gl3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import di3.C86312j;
import eb0.C45628s0;
import gl3.C75922b;
import java.util.regex.Pattern;
import kg3.C76577a;
import kv1.C99260q;
import lv1.C99681n;
import p196ln.C76705f;

/* renamed from: gl3.d */
public class C75926d extends C75921a {

    /* renamed from: G */
    public static final Pattern f222630G = Pattern.compile(";");

    /* renamed from: B */
    public C99681n f222631B;

    /* renamed from: C */
    public CharSequence f222632C;

    /* renamed from: D */
    public CharSequence f222633D;

    /* renamed from: E */
    public C75928b f222634E = new C75928b();

    /* renamed from: F */
    public C75927a f222635F = new C75927a(this);

    /* renamed from: gl3.d$a */
    public class C75927a implements C75922b.C75923a {

        /* renamed from: a */
        public View f222636a;

        /* renamed from: b */
        public ImageView f222637b;

        /* renamed from: c */
        public TextView f222638c;

        /* renamed from: d */
        public TextView f222639d;

        /* renamed from: e */
        public TextView f222640e;

        /* renamed from: f */
        public CheckBox f222641f;

        public C75927a(C75926d dVar) {
        }
    }

    /* renamed from: gl3.d$b */
    public class C75928b implements C75922b.C75924b {
        public C75928b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C75927a aVar2 = (C75927a) aVar;
            C75926d dVar = (C75926d) bVar;
            String str = dVar.f222602y;
            if (str == null || str.length() <= 0) {
                aVar2.f222637b.setImageResource(C0966R.C0969drawable.bfa);
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(aVar2.f222637b, dVar.f222602y, 0.1f);
            }
            C93938f0.m118693a(dVar.f222601x, aVar2.f222638c);
            if (C45628s0.m50748M(dVar.f222602y)) {
                Drawable drawable = context.getResources().getDrawable(C0966R.raw.open_im_main_logo);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                aVar2.f222638c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } else {
                aVar2.f222638c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            C93938f0.m118693a(dVar.f222633D, aVar2.f222640e);
            C93938f0.m118693a(dVar.f222632C, aVar2.f222639d);
            if (C75926d.this.f222608e) {
                if (z) {
                    aVar2.f222641f.setChecked(true);
                    aVar2.f222641f.setEnabled(false);
                    aVar2.f222641f.setBackgroundResource(C85875k4.m106211z() ? C0966R.raw.checkbox_selected_grey_dark : C0966R.raw.checkbox_selected_grey);
                } else {
                    aVar2.f222641f.setChecked(z2);
                    aVar2.f222641f.setEnabled(true);
                }
                aVar2.f222641f.setVisibility(0);
                return;
            }
            aVar2.f222641f.setVisibility(8);
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = C76577a.m92147C(context) ? LayoutInflater.from(context).inflate(C0966R.C0971layout.bwf, viewGroup, false) : LayoutInflater.from(context).inflate(C0966R.C0971layout.bwe, viewGroup, false);
            C75927a aVar = C75926d.this.f222635F;
            aVar.f222637b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            aVar.f222638c = textView;
            textView.setMaxWidth(C76577a.m92151b(context, 200));
            aVar.f222640e = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            aVar.f222639d = (TextView) inflate.findViewById(C0966R.C0970id.kms);
            aVar.f222636a = inflate.findViewById(C0966R.C0970id.j_7);
            aVar.f222641f = (CheckBox) inflate.findViewById(C0966R.C0970id.j9g);
            if (C75926d.this.f222612i) {
                aVar.f222636a.setBackgroundResource(C0966R.C0969drawable.f4859pe);
            }
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            if (C75926d.this.f222631B == null) {
                return false;
            }
            C75926d dVar = C75926d.this;
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128752cG(dVar.f222619p, dVar.f222631B, 1);
            return false;
        }
    }

    public C75926d(int i) {
        super(3, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0132  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67027a(android.content.Context r12, gl3.C75922b.C75923a r13) {
        /*
            r11 = this;
            java.lang.Class<d62.i> r0 = d62.C75339i.class
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            lv1.n r2 = r11.f222631B
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0044
            com.tencent.mm.storage.z1 r2 = r11.f222600A
            if (r2 != 0) goto L_0x0042
            f40.C86709a0.m107528h()
            k40.a r2 = f40.C86709a0.m107533q(r1)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            lv1.n r5 = r11.f222631B
            java.lang.String r5 = r5.f292151e
            com.tencent.mm.storage.z1 r2 = r2.mo69674W2(r5)
            r11.mo106181j(r2)
            com.tencent.mm.storage.z1 r2 = r11.f222600A
            if (r2 != 0) goto L_0x0042
            f40.C86709a0.m107528h()
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            lv1.n r2 = r11.f222631B
            java.lang.String r2 = r2.f292151e
            com.tencent.mm.storage.z1 r1 = r1.mo69656H3(r2)
            r11.mo106181j(r1)
        L_0x0042:
            r1 = 1
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            com.tencent.mm.storage.z1 r2 = r11.f222600A
            if (r2 != 0) goto L_0x005b
            java.lang.Object[] r12 = new java.lang.Object[r3]
            int r13 = r11.f222605b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r4] = r13
            java.lang.String r13 = "MicroMsg.ChatroomDataItem"
            java.lang.String r0 = "filling dataItem Occur Error Contact is null, position=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r12)
            return
        L_0x005b:
            java.lang.String r2 = r2.getUsername()
            r11.f222602y = r2
            java.lang.String r2 = ")"
            java.lang.String r5 = "("
            if (r1 == 0) goto L_0x013f
            gl3.d$a r13 = (gl3.C75926d.C75927a) r13
            lv1.n r13 = r11.f222631B
            com.tencent.mm.storage.z1 r1 = r11.f222600A
            android.content.res.Resources r6 = r12.getResources()
            di3.d r0 = di3.C86312j.m106911c(r0)
            d62.i r0 = (d62.C75339i) r0
            java.lang.String r7 = r1.getUsername()
            java.lang.String r0 = r0.pv0(r1, r7)
            int r7 = r13.f292149c
            r8 = 0
            if (r7 == r3) goto L_0x010d
            r9 = 2
            if (r7 == r9) goto L_0x010a
            r10 = 3
            if (r7 == r10) goto L_0x0109
            r10 = 5
            if (r7 == r10) goto L_0x010d
            r10 = 6
            if (r7 == r10) goto L_0x010a
            r10 = 7
            if (r7 == r10) goto L_0x0109
            r10 = 38
            if (r7 == r10) goto L_0x0099
            goto L_0x0106
        L_0x0099:
            f40.C86709a0.m107528h()
            f40.o r7 = f40.C86709a0.m107535s()
            zh3.f r7 = r7.f251811i
            java.lang.String[] r10 = new java.lang.String[r3]
            java.lang.String r1 = r1.getUsername()
            r10[r4] = r1
            java.lang.String r1 = "SELECT memberlist FROM chatroom WHERE chatroomname=?;"
            android.database.Cursor r1 = r7.rawQuery(r1, r10, r9)
            boolean r7 = r1.moveToFirst()
            if (r7 == 0) goto L_0x00c7
            java.lang.String r7 = r1.getString(r4)
            r1.close()
            if (r7 != 0) goto L_0x00c0
            goto L_0x00ca
        L_0x00c0:
            java.util.regex.Pattern r1 = f222630G
            java.lang.String[] r1 = r1.split(r7)
            goto L_0x00cb
        L_0x00c7:
            r1.close()
        L_0x00ca:
            r1 = r8
        L_0x00cb:
            if (r1 == 0) goto L_0x00e5
            int r7 = r1.length
            if (r7 <= 0) goto L_0x00e5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            int r5 = r1.length
            r7.append(r5)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r11.f222632C = r2
        L_0x00e5:
            if (r1 == 0) goto L_0x0106
            java.util.List<lv1.h> r13 = r13.f292160n
            if (r13 != 0) goto L_0x00ec
            goto L_0x0106
        L_0x00ec:
            lv1.i r2 = r11.f222603z
            android.text.TextPaint r5 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
            java.lang.CharSequence r13 = com.tencent.p014mm.plugin.fts.p059ui.C93938f0.m118695c(r12, r13, r1, r2, r5)
            r1 = 2131835405(0x7f113a0d, float:1.9303948E38)
            java.lang.String r1 = r6.getString(r1)
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r9]
            r2[r4] = r1
            r2[r3] = r13
            java.lang.CharSequence r13 = android.text.TextUtils.concat(r2)
            r8 = r13
        L_0x0106:
            r13 = 0
            r3 = 0
            goto L_0x0114
        L_0x0109:
            r4 = 1
        L_0x010a:
            r13 = r4
            r4 = 1
            goto L_0x010e
        L_0x010d:
            r13 = 0
        L_0x010e:
            r1 = 2131835407(0x7f113a0f, float:1.9303952E38)
            r6.getString(r1)
        L_0x0114:
            r1 = 2131165537(0x7f070161, float:1.7945294E38)
            if (r3 == 0) goto L_0x0132
            int r1 = kg3.C76577a.m92157h(r12, r1)
            android.text.SpannableString r12 = r11.mo106188i(r12, r0, r1)
            r11.f222601x = r12
            lv1.i r0 = r11.f222603z
            lv1.f r12 = lv1.C99667f.m130091d(r12, r0, r4, r13)
            lv1.g r12 = kv1.C99254i.m129308e(r12)
            java.lang.CharSequence r12 = r12.f292107a
            r11.f222601x = r12
            goto L_0x013c
        L_0x0132:
            int r13 = kg3.C76577a.m92157h(r12, r1)
            android.text.SpannableString r12 = r11.mo106188i(r12, r0, r13)
            r11.f222601x = r12
        L_0x013c:
            r11.f222633D = r8
            goto L_0x016d
        L_0x013f:
            di3.d r12 = di3.C86312j.m106911c(r0)
            d62.i r12 = (d62.C75339i) r12
            com.tencent.mm.storage.z1 r13 = r11.f222600A
            java.lang.String r0 = r13.getUsername()
            java.lang.String r12 = r12.pv0(r13, r0)
            r11.f222601x = r12
            lv1.n r12 = r11.f222631B
            if (r12 == 0) goto L_0x016d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            lv1.n r13 = r11.f222631B
            long r0 = r13.f292150d
            r12.append(r0)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.f222632C = r12
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl3.C75926d.mo67027a(android.content.Context, gl3.b$a):void");
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f222634E;
    }

    /* renamed from: c */
    public boolean mo106182c() {
        return this.f222631B.f292165s;
    }
}
