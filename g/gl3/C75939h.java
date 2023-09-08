package gl3;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import gl3.C75922b;
import kg3.C76577a;
import kv1.C99260q;
import lv1.C99681n;
import p196ln.C76705f;
import p240sx.C77800i;
import p240sx.C77801j;
import p240sx.C77802k;

/* renamed from: gl3.h */
public class C75939h extends C75921a {

    /* renamed from: B */
    public C99681n f222676B;

    /* renamed from: C */
    public CharSequence f222677C;

    /* renamed from: D */
    public String f222678D;

    /* renamed from: E */
    public boolean f222679E;

    /* renamed from: F */
    public boolean f222680F;

    /* renamed from: G */
    public boolean f222681G = false;

    /* renamed from: H */
    public C77800i f222682H = ((C77801j) C86312j.m106911c(C77801j.class)).em0(this);

    /* renamed from: I */
    public final C75941b f222683I = new C75941b(this);

    /* renamed from: J */
    public final C75940a f222684J = new C75940a();

    /* renamed from: gl3.h$a */
    public static class C75940a implements C75922b.C75923a {

        /* renamed from: a */
        public View f222685a;

        /* renamed from: b */
        public ImageView f222686b;

        /* renamed from: c */
        public TextView f222687c;

        /* renamed from: d */
        public TextView f222688d;

        /* renamed from: e */
        public CheckBox f222689e;

        /* renamed from: f */
        public ImageView f222690f;

        /* renamed from: g */
        public TextView f222691g;

        /* renamed from: h */
        public ImageView f222692h;

        /* renamed from: i */
        public View f222693i;
    }

    /* renamed from: gl3.h$b */
    public class C75941b implements C75922b.C75924b {

        /* renamed from: a */
        public C77802k f222694a;

        public C75941b(C75939h hVar) {
            this.f222694a = ((C77801j) C86312j.m106911c(C77801j.class)).mo107748av(hVar);
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            TextView textView;
            C75945m mVar = (C75945m) this.f222694a;
            mVar.getClass();
            C75940a aVar2 = (C75940a) aVar;
            C75939h hVar = (C75939h) bVar;
            String str = hVar.f222602y;
            if (str == null || str.length() <= 0) {
                aVar2.f222686b.setImageResource(C0966R.C0969drawable.bfa);
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(aVar2.f222686b, hVar.f222602y, 0.1f);
            }
            if (bVar.f222614k && C75592q0.m90789s().equals(hVar.f222602y)) {
                hVar.f222601x += context.getString(C0966R.string.myc);
            }
            C93938f0.m118693a(hVar.f222601x, aVar2.f222687c);
            C93938f0.m118693a(hVar.f222677C, aVar2.f222688d);
            C75939h hVar2 = mVar.f222701a;
            if (hVar2.f222608e) {
                if (!hVar2.f222606c) {
                    aVar2.f222689e.setBackgroundResource(C0966R.C0969drawable.ag6);
                } else {
                    aVar2.f222689e.setBackgroundResource(C0966R.C0969drawable.b_n);
                }
                if (z) {
                    aVar2.f222689e.setChecked(true);
                    aVar2.f222689e.setEnabled(false);
                } else if (!bVar.f222614k || !mVar.mo106191a(hVar)) {
                    aVar2.f222689e.setChecked(z2);
                    aVar2.f222689e.setEnabled(true);
                } else {
                    aVar2.f222689e.setChecked(false);
                    aVar2.f222689e.setEnabled(false);
                }
                aVar2.f222689e.setVisibility(0);
            } else if (hVar2.f222610g) {
                aVar2.f222689e.setBackgroundResource(C0966R.C0969drawable.apl);
                if (z) {
                    aVar2.f222689e.setChecked(true);
                    aVar2.f222689e.setEnabled(false);
                } else {
                    aVar2.f222689e.setChecked(z2);
                    aVar2.f222689e.setEnabled(true);
                }
                aVar2.f222689e.setVisibility(0);
            } else if (hVar2.f222611h) {
                aVar2.f222689e.setVisibility(8);
                ImageView imageView = aVar2.f222690f;
                if (imageView != null) {
                    if (z2) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            } else {
                aVar2.f222689e.setVisibility(8);
            }
            if (mVar.f222701a.f222680F) {
                aVar2.f222689e.setVisibility(8);
                ImageView imageView2 = aVar2.f222690f;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            }
            if (mVar.f222701a.f222612i) {
                if (bVar.f222614k) {
                    aVar2.f222693i.setBackgroundResource(C0966R.C0969drawable.f4340r);
                } else {
                    aVar2.f222685a.setBackgroundResource(C0966R.C0969drawable.f4859pe);
                }
            } else if (bVar.f222614k) {
                aVar2.f222693i.setBackgroundResource(C0966R.C0969drawable.f4340r);
            } else {
                aVar2.f222685a.setBackgroundResource(C0966R.C0969drawable.f4855pa);
            }
            if (hVar.f222600A.mo73975s2() == 1) {
                aVar2.f222688d.setVisibility(0);
                aVar2.f222688d.setText(context.getString(C0966R.string.iid));
            }
            if (bVar.f222614k) {
                aVar2.f222688d.post(new C75943j(mVar, aVar2, context));
                String str2 = bVar.f222609f;
                if (hVar.f222600A.mo73975s2() == 1) {
                    aVar2.f222688d.setVisibility(0);
                    aVar2.f222688d.setText(context.getString(C0966R.string.iid));
                } else if (!Util.isNullOrNil(str2)) {
                    aVar2.f222688d.setVisibility(0);
                    aVar2.f222688d.setText(str2);
                } else {
                    aVar2.f222688d.setVisibility(8);
                }
            }
            if (!mVar.f222701a.f222679E && (textView = aVar2.f222691g) != null) {
                textView.setVisibility(8);
                if (C72996z1.m85843n5(hVar.f222602y) && !Util.isNullOrNil(hVar.f222678D)) {
                    aVar2.f222687c.post(new C75944k(mVar, aVar2, hVar, context));
                }
                if (aVar2.f222692h != null) {
                    if (!mVar.f222701a.f222681G || Util.isNullOrNil(hVar.f222602y)) {
                        aVar2.f222692h.setVisibility(8);
                    } else {
                        aVar2.f222692h.setVisibility(0);
                        aVar2.f222692h.setOnClickListener(new C8358l(mVar, hVar, context));
                    }
                }
            }
            if (!bVar.f222614k || !mVar.mo106191a(hVar)) {
                aVar2.f222686b.setAlpha(1.0f);
                aVar2.f222687c.setAlpha(1.0f);
                aVar2.f222688d.setAlpha(1.0f);
                aVar2.f222689e.setAlpha(1.0f);
                ImageView imageView3 = aVar2.f222692h;
                if (imageView3 != null) {
                    imageView3.setAlpha(1.0f);
                }
                TextView textView2 = aVar2.f222691g;
                if (textView2 != null) {
                    textView2.setAlpha(1.0f);
                    return;
                }
                return;
            }
            aVar2.f222686b.setAlpha(0.3f);
            aVar2.f222687c.setAlpha(0.3f);
            aVar2.f222688d.setAlpha(0.3f);
            aVar2.f222689e.setAlpha(0.3f);
            ImageView imageView4 = aVar2.f222692h;
            if (imageView4 != null) {
                imageView4.setAlpha(0.3f);
            }
            TextView textView3 = aVar2.f222691g;
            if (textView3 != null) {
                textView3.setAlpha(0.3f);
            }
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            C75945m mVar = (C75945m) this.f222694a;
            C75939h hVar = mVar.f222701a;
            View inflate = (hVar == null || !hVar.f222614k) ? C76577a.m92147C(context) ? LayoutInflater.from(context).inflate(C0966R.C0971layout.bwf, viewGroup, false) : LayoutInflater.from(context).inflate(C0966R.C0971layout.bwe, viewGroup, false) : LayoutInflater.from(context).inflate(C0966R.C0971layout.d0u, viewGroup, false);
            C75940a aVar = mVar.f222701a.f222684J;
            aVar.f222686b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f222687c = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            aVar.f222688d = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            aVar.f222685a = inflate.findViewById(C0966R.C0970id.j_7);
            C75939h hVar2 = mVar.f222701a;
            if (hVar2 != null && hVar2.f222614k) {
                aVar.f222693i = inflate.findViewById(C0966R.C0970id.npk);
            }
            aVar.f222689e = (CheckBox) inflate.findViewById(C0966R.C0970id.j9g);
            aVar.f222690f = (ImageView) inflate.findViewById(C0966R.C0970id.j_y);
            aVar.f222691g = (TextView) inflate.findViewById(C0966R.C0970id.f358885hn2);
            aVar.f222692h = (WeImageView) inflate.findViewById(C0966R.C0970id.my9);
            inflate.setTag(aVar);
            if (mVar.f222701a.f222606c) {
                Resources resources = aVar.f222687c.getContext().getResources();
                aVar.f222685a.setBackgroundResource(C0966R.C0969drawable.f4857pc);
                aVar.f222687c.setTextColor(resources.getColor(C0966R.color.BW_100_Alpha_0_8));
                aVar.f222688d.setTextColor(resources.getColor(C0966R.color.BW_100_Alpha_0_5));
                aVar.f222689e.setBackgroundResource(C0966R.C0969drawable.aog);
            }
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            C75945m mVar = (C75945m) this.f222694a;
            mVar.getClass();
            if ((bVar.f222614k && mVar.mo106191a(bVar)) || mVar.f222701a.f222676B == null) {
                return false;
            }
            C75939h hVar = mVar.f222701a;
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128752cG(hVar.f222619p, hVar.f222676B, 1);
            return false;
        }
    }

    public C75939h(int i) {
        super(2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c5, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c9, code lost:
        r3 = r3.getNickname();
        r5 = r10.getString(com.tencent.p014mm.C0966R.string.igx);
        r10 = false;
        r17 = r4;
        r4 = r3;
        r3 = r11;
        r11 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ec, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f0, code lost:
        r10 = true;
        r17 = r6;
        r6 = r3;
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0148, code lost:
        r5 = null;
        r7 = false;
        r11 = r4;
        r4 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67027a(android.content.Context r19, gl3.C75922b.C75923a r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r18
            sx.i r2 = r1.f222682H
            gl3.i r2 = (gl3.C75942i) r2
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            java.lang.Class<d62.i> r4 = d62.C75339i.class
            gl3.h r5 = r2.f222695a
            lv1.n r6 = r5.f222676B
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0054
            com.tencent.mm.storage.z1 r6 = r5.f222600A
            if (r6 != 0) goto L_0x0052
            f40.C86709a0.m107528h()
            k40.a r6 = f40.C86709a0.m107533q(r3)
            f62.k0 r6 = (f62.C75700k0) r6
            com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()
            gl3.h r9 = r2.f222695a
            lv1.n r9 = r9.f222676B
            java.lang.String r9 = r9.f292151e
            com.tencent.mm.storage.z1 r6 = r6.mo69674W2(r9)
            r5.mo106181j(r6)
            gl3.h r5 = r2.f222695a
            com.tencent.mm.storage.z1 r6 = r5.f222600A
            if (r6 != 0) goto L_0x0052
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            gl3.h r6 = r2.f222695a
            lv1.n r6 = r6.f222676B
            java.lang.String r6 = r6.f292151e
            com.tencent.mm.storage.z1 r3 = r3.mo69656H3(r6)
            r5.mo106181j(r3)
        L_0x0052:
            r3 = 1
            goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            gl3.h r5 = r2.f222695a
            com.tencent.mm.storage.z1 r6 = r5.f222600A
            java.lang.String r9 = "MicroMsg.ContactDataItemDelegate"
            if (r6 != 0) goto L_0x006e
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r2 = r5.f222605b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r8] = r2
            java.lang.String r2 = "filling dataItem Occur Error Contact is null, position=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            goto L_0x02a2
        L_0x006e:
            java.lang.String r6 = r6.getUsername()
            r5.f222602y = r6
            gl3.h r5 = r2.f222695a
            java.lang.Class<he0.j> r6 = he0.C76158j.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            he0.j r6 = (he0.C76158j) r6
            gl3.h r10 = r2.f222695a
            com.tencent.mm.storage.z1 r10 = r10.f222600A
            java.lang.String r10 = r10.mo73980x2()
            gl3.h r11 = r2.f222695a
            com.tencent.mm.storage.z1 r11 = r11.f222600A
            java.lang.String r11 = r11.mo73976t2()
            java.lang.String r6 = r6.mo106373wo(r10, r11)
            r5.f222678D = r6
            if (r3 == 0) goto L_0x025c
            gl3.h r3 = r2.f222695a
            lv1.n r6 = r3.f222676B
            com.tencent.mm.storage.z1 r3 = r3.f222600A
            android.content.res.Resources r10 = r19.getResources()
            r11 = 0
            if (r3 == 0) goto L_0x01ce
            di3.d r4 = di3.C86312j.m106911c(r4)
            d62.i r4 = (d62.C75339i) r4
            java.lang.String r12 = r3.getUsername()
            java.lang.String r4 = r4.pv0(r3, r12)
            int r12 = r6.f292149c
            r13 = 11
            if (r12 == r13) goto L_0x014e
            switch(r12) {
                case 1: goto L_0x00ee;
                case 2: goto L_0x00eb;
                case 3: goto L_0x00e9;
                case 4: goto L_0x00de;
                case 5: goto L_0x00c7;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00c2;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            switch(r12) {
                case 15: goto L_0x012f;
                case 16: goto L_0x0102;
                case 17: goto L_0x00f7;
                case 18: goto L_0x00f7;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            r3 = 0
            r6 = 0
            r10 = 0
            goto L_0x0148
        L_0x00c2:
            r6 = 1
            goto L_0x00c5
        L_0x00c4:
            r6 = 0
        L_0x00c5:
            r11 = 1
            goto L_0x00c9
        L_0x00c7:
            r6 = 0
            r11 = 0
        L_0x00c9:
            java.lang.String r3 = r3.getNickname()
            r12 = 2131835407(0x7f113a0f, float:1.9303952E38)
            java.lang.String r10 = r10.getString(r12)
            r5 = r10
            r10 = 0
            r17 = r4
            r4 = r3
            r3 = r11
            r11 = r17
            goto L_0x01d4
        L_0x00de:
            java.lang.String r3 = r3.f149513S0
            r6 = 2131835402(0x7f113a0a, float:1.9303942E38)
            java.lang.String r6 = r10.getString(r6)
            goto L_0x01c5
        L_0x00e9:
            r3 = 1
            goto L_0x00ec
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            r6 = 1
            goto L_0x00f0
        L_0x00ee:
            r3 = 0
            r6 = 0
        L_0x00f0:
            r10 = 1
            r17 = r6
            r6 = r3
            r3 = r17
            goto L_0x0148
        L_0x00f7:
            java.lang.String r3 = r6.f292154h
            r6 = 2131835404(0x7f113a0c, float:1.9303946E38)
            java.lang.String r6 = r10.getString(r6)
            goto L_0x01c5
        L_0x0102:
            java.lang.String r3 = r6.f292154h
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r6 != 0) goto L_0x0126
            java.lang.String r6 = "​"
            java.lang.String[] r6 = r3.split(r6)
            int r11 = r6.length
            r12 = 0
        L_0x0113:
            if (r12 >= r11) goto L_0x0126
            r13 = r6[r12]
            gl3.h r14 = r2.f222695a
            java.lang.String r14 = r14.f222619p
            boolean r14 = r13.startsWith(r14)
            if (r14 == 0) goto L_0x0123
            r3 = r13
            goto L_0x0126
        L_0x0123:
            int r12 = r12 + 1
            goto L_0x0113
        L_0x0126:
            r6 = 2131835406(0x7f113a0e, float:1.930395E38)
            java.lang.String r6 = r10.getString(r6)
            goto L_0x01c5
        L_0x012f:
            java.lang.String r6 = r3.mo62913l2()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r11 == 0) goto L_0x013d
            java.lang.String r6 = r3.getUsername()
        L_0x013d:
            r3 = 2131835413(0x7f113a15, float:1.9303964E38)
            java.lang.String r3 = r10.getString(r3)
            r11 = r3
            r3 = r6
            goto L_0x01c6
        L_0x0148:
            r5 = r11
            r7 = 0
            r11 = r4
            r4 = r5
            goto L_0x01d4
        L_0x014e:
            java.lang.Class<kv1.q> r6 = kv1.C99260q.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            kv1.q r6 = (kv1.C99260q) r6
            kv1.m r6 = r6.mo128761xc()
            java.lang.String r3 = r3.mo73974r2()
            com.tencent.mm.plugin.fts.g r6 = (com.tencent.p014mm.plugin.fts.C68985g) r6
            java.util.List r3 = r6.mo94942c(r3)
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            gl3.h r11 = r2.f222695a
            lv1.i r11 = r11.f222603z
            java.lang.String[] r11 = r11.f292122c
            int r12 = r11.length
            r13 = 0
        L_0x0171:
            if (r13 >= r12) goto L_0x01a8
            r14 = r11[r13]
            r15 = r3
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x017c:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x01a4
            java.lang.Object r16 = r15.next()
            r7 = r16
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, java.lang.String> r16 = kv1.C99251g.f291026a
            java.lang.String r16 = r7.toLowerCase()
            java.lang.String r5 = kv1.C99255j.m129319c(r16)
            boolean r5 = r5.contains(r14)
            if (r5 == 0) goto L_0x01a2
            r6.append(r7)
            java.lang.String r5 = ","
            r6.append(r5)
        L_0x01a2:
            r7 = 1
            goto L_0x017c
        L_0x01a4:
            int r13 = r13 + 1
            r7 = 1
            goto L_0x0171
        L_0x01a8:
            r6.trimToSize()
            int r3 = r6.length()
            if (r3 != 0) goto L_0x01b4
            java.lang.String r3 = ""
            goto L_0x01be
        L_0x01b4:
            int r3 = r6.length()
            int r3 = r3 + -1
            java.lang.String r3 = r6.substring(r8, r3)
        L_0x01be:
            r5 = 2131835412(0x7f113a14, float:1.9303962E38)
            java.lang.String r6 = r10.getString(r5)
        L_0x01c5:
            r11 = r6
        L_0x01c6:
            r5 = r11
            r6 = 0
            r7 = 1
            r10 = 0
            r11 = r4
            r4 = r3
            r3 = 0
            goto L_0x01d4
        L_0x01ce:
            r4 = r11
            r5 = r4
            r3 = 0
            r6 = 0
            r7 = 0
            r10 = 0
        L_0x01d4:
            if (r10 == 0) goto L_0x01fd
            java.lang.String r10 = "highlight first line"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r10)
            gl3.h r10 = r2.f222695a
            r12 = 2131165591(0x7f070197, float:1.7945403E38)
            int r12 = kg3.C76577a.m92157h(r0, r12)
            android.text.SpannableString r11 = r10.mo106188i(r0, r11, r12)
            r10.f222601x = r11
            gl3.h r10 = r2.f222695a
            java.lang.CharSequence r11 = r10.f222601x
            lv1.i r12 = r10.f222603z
            lv1.f r11 = lv1.C99667f.m130091d(r11, r12, r3, r6)
            lv1.g r11 = kv1.C99254i.m129308e(r11)
            java.lang.CharSequence r11 = r11.f292107a
            r10.f222601x = r11
            goto L_0x020c
        L_0x01fd:
            gl3.h r10 = r2.f222695a
            r12 = 2131165591(0x7f070197, float:1.7945403E38)
            int r12 = kg3.C76577a.m92157h(r0, r12)
            android.text.SpannableString r11 = r10.mo106188i(r0, r11, r12)
            r10.f222601x = r11
        L_0x020c:
            r10 = 2131165537(0x7f070161, float:1.7945294E38)
            if (r7 == 0) goto L_0x0235
            java.lang.String r7 = "highlight second line"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r7)
            gl3.h r7 = r2.f222695a
            int r9 = kg3.C76577a.m92157h(r0, r10)
            android.text.SpannableString r0 = r7.mo106188i(r0, r4, r9)
            r7.f222677C = r0
            gl3.h r0 = r2.f222695a
            java.lang.CharSequence r4 = r0.f222677C
            lv1.i r7 = r0.f222603z
            lv1.f r3 = lv1.C99667f.m130091d(r4, r7, r3, r6)
            lv1.g r3 = kv1.C99254i.m129308e(r3)
            java.lang.CharSequence r3 = r3.f292107a
            r0.f222677C = r3
            goto L_0x0241
        L_0x0235:
            gl3.h r3 = r2.f222695a
            int r6 = kg3.C76577a.m92157h(r0, r10)
            android.text.SpannableString r0 = r3.mo106188i(r0, r4, r6)
            r3.f222677C = r0
        L_0x0241:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r0 != 0) goto L_0x02a2
            gl3.h r0 = r2.f222695a
            java.lang.CharSequence r2 = r0.f222677C
            if (r2 == 0) goto L_0x02a2
            r3 = 2
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r3]
            r3[r8] = r5
            r4 = 1
            r3[r4] = r2
            java.lang.CharSequence r2 = android.text.TextUtils.concat(r3)
            r0.f222677C = r2
            goto L_0x02a2
        L_0x025c:
            gl3.h r3 = r2.f222695a
            java.lang.String r3 = r3.f222620q
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0275
            di3.d r3 = di3.C86312j.m106911c(r4)
            d62.i r3 = (d62.C75339i) r3
            gl3.h r4 = r2.f222695a
            com.tencent.mm.storage.z1 r4 = r4.f222600A
            java.lang.String r3 = r3.mo62520pi(r4)
            goto L_0x028b
        L_0x0275:
            di3.d r3 = di3.C86312j.m106911c(r4)
            d62.i r3 = (d62.C75339i) r3
            gl3.h r4 = r2.f222695a
            com.tencent.mm.storage.z1 r4 = r4.f222600A
            java.lang.String r4 = r4.getUsername()
            gl3.h r5 = r2.f222695a
            java.lang.String r5 = r5.f222620q
            java.lang.String r3 = r3.mo62519pb(r4, r5)
        L_0x028b:
            gl3.h r2 = r2.f222695a
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            r5 = 2131165591(0x7f070197, float:1.7945403E38)
            int r5 = kg3.C76577a.m92157h(r0, r5)
            android.text.SpannableString r0 = r4.op0(r0, r3, r5)
            r2.f222601x = r0
        L_0x02a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl3.C75939h.mo67027a(android.content.Context, gl3.b$a):void");
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f222683I;
    }
}
