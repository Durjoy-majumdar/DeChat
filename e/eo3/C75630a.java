package eo3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.MergeCursor;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kg3.C76577a;
import lj3.C46863b;
import p196ln.C76708i;

/* renamed from: eo3.a */
public class C75630a extends C6975i1<C72976h2> {

    /* renamed from: o */
    public List<String> f222184o = null;

    /* renamed from: p */
    public ColorStateList[] f222185p = new ColorStateList[2];

    /* renamed from: q */
    public HashMap<String, C75633c> f222186q;

    /* renamed from: r */
    public boolean f222187r = true;

    /* renamed from: s */
    public String f222188s;

    /* renamed from: t */
    public C46863b.C46867d f222189t = null;

    /* renamed from: u */
    public C46863b f222190u = new C46863b(15, new C75631a(this));

    /* renamed from: eo3.a$a */
    public class C75631a implements C46863b.C46866c {
        public C75631a(C75630a aVar) {
        }

        /* renamed from: a */
        public Bitmap mo63515a(String str) {
            return ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
        }
    }

    /* renamed from: eo3.a$b */
    public class C75632b implements C46863b.C46867d {
        public C75632b() {
        }

        /* renamed from: a */
        public int mo63517a() {
            return C75630a.this.getCount();
        }

        /* renamed from: b */
        public String mo63518b(int i) {
            if (i < 0 || i >= C75630a.this.getCount()) {
                Log.m105920e("MicroMsg.SearchConversationAdapter", "pos is invalid");
                return null;
            }
            C72976h2 h2Var = (C72976h2) C75630a.this.getItem(i);
            if (h2Var == null) {
                return null;
            }
            return h2Var.getUsername();
        }
    }

    /* renamed from: eo3.a$c */
    public class C75633c {

        /* renamed from: a */
        public CharSequence f222192a;

        /* renamed from: b */
        public CharSequence f222193b;

        /* renamed from: c */
        public CharSequence f222194c;

        public C75633c(C75630a aVar, C75631a aVar2) {
        }
    }

    /* renamed from: eo3.a$d */
    public static class C75634d {

        /* renamed from: a */
        public ImageView f222195a;

        /* renamed from: b */
        public TextView f222196b;

        /* renamed from: c */
        public TextView f222197c;

        /* renamed from: d */
        public TextView f222198d;

        /* renamed from: e */
        public TextView f222199e;

        /* renamed from: f */
        public ImageView f222200f;

        /* renamed from: g */
        public ImageView f222201g;
    }

    public C75630a(Context context, C6975i1.C6977b bVar) {
        super(context, new C72976h2());
        this.f24699h = bVar;
        this.f222185p[0] = C76577a.m92154e(context, C0966R.color.a4v);
        this.f222185p[1] = C76577a.m92154e(context, C0966R.color.a4w);
        this.f222186q = new HashMap<>();
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C72976h2 h2Var = (C72976h2) obj;
        if (cursor.getString(0) != null && cursor.getString(0).equals("1")) {
            if (h2Var == null) {
                h2Var = new C72976h2();
            }
            h2Var.convertFrom(cursor);
        } else if (cursor.getString(0).equals("2")) {
            C44668u3 v = C97625j3.m125812b().mo105907v();
            int i = C72996z1.f214113Y1;
            C72996z1 W2 = v.mo69674W2(cursor.getString(cursor.getColumnIndex("username")));
            if (W2 == null) {
                W2 = new C72996z1();
                W2.convertFrom(cursor);
                C97625j3.m125812b().mo105907v().mo69690c4(W2);
            }
            if (h2Var == null) {
                h2Var = new C72976h2();
            }
            h2Var.mo108808d(2);
            h2Var.mo108793N2(-1);
            h2Var.mo108803Y2(1);
            h2Var.mo108792M2(this.f24696e.getString(C0966R.string.f2e));
            h2Var.setUsername(W2.getUsername());
            h2Var.mo108812g3(0);
            h2Var.mo108806b3(Integer.toString(1));
        } else {
            if (h2Var == null) {
                h2Var = new C72976h2();
            }
            h2Var.convertFrom(cursor);
        }
        return h2Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bb A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            lj3.b$d r2 = r0.f222189t
            if (r2 != 0) goto L_0x000f
            eo3.a$b r2 = new eo3.a$b
            r2.<init>()
            r0.f222189t = r2
        L_0x000f:
            lj3.b r2 = r0.f222190u
            if (r2 == 0) goto L_0x001b
            lj3.b$d r3 = r0.f222189t
            r4 = r19
            r2.mo72072b(r4, r3)
            goto L_0x001d
        L_0x001b:
            r4 = r19
        L_0x001d:
            java.lang.Object r2 = r18.getItem(r19)
            com.tencent.mm.storage.h2 r2 = (com.tencent.p014mm.storage.C72976h2) r2
            java.lang.String r3 = r2.mo108781B2()
            r4 = 1
            if (r3 == 0) goto L_0x0039
            int r5 = r3.length()
            if (r5 <= 0) goto L_0x0039
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0039 }
            int r3 = r3.intValue()     // Catch:{ NumberFormatException -> 0x0039 }
            goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            r5 = 34
            java.lang.String r6 = "qmessage"
            r7 = 4
            r8 = 0
            r10 = 0
            if (r3 != r5) goto L_0x00e4
            int r3 = r2.mo108832y2()
            if (r3 != 0) goto L_0x00e4
            java.lang.String r3 = r2.getContent()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x00e4
            java.lang.String r3 = r2.getContent()
            java.lang.String r5 = r2.getUsername()
            boolean r5 = r5.equals(r6)
            r11 = 2
            java.lang.String r12 = ":"
            if (r5 != 0) goto L_0x0071
            java.lang.String r5 = r2.getUsername()
            java.lang.String r13 = "floatbottle"
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x0099
        L_0x0071:
            java.lang.String[] r5 = r3.split(r12)
            if (r5 == 0) goto L_0x0099
            int r13 = r5.length
            r14 = 3
            if (r13 <= r14) goto L_0x0099
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r13 = r5[r4]
            r3.append(r13)
            r3.append(r12)
            r13 = r5[r11]
            r3.append(r13)
            r3.append(r12)
            r5 = r5[r14]
            r3.append(r5)
            java.lang.String r3 = r3.toString()
        L_0x0099:
            java.lang.String r5 = "\n"
            boolean r5 = r3.endsWith(r5)     // Catch:{ Exception -> 0x00d8 }
            if (r5 == 0) goto L_0x00aa
            int r5 = r3.length()     // Catch:{ Exception -> 0x00d8 }
            int r5 = r5 - r4
            java.lang.String r3 = r3.substring(r10, r5)     // Catch:{ Exception -> 0x00d8 }
        L_0x00aa:
            java.lang.String[] r3 = r3.split(r12)     // Catch:{ Exception -> 0x00d8 }
            int r5 = r3.length     // Catch:{ Exception -> 0x00d8 }
            if (r5 != r7) goto L_0x00bb
            r5 = r3[r10]     // Catch:{ Exception -> 0x00d8 }
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85811N4(r5)     // Catch:{ Exception -> 0x00d8 }
            if (r5 == 0) goto L_0x00bb
            r5 = 1
            goto L_0x00bc
        L_0x00bb:
            r5 = 0
        L_0x00bc:
            int r12 = r3.length     // Catch:{ Exception -> 0x00d8 }
            if (r12 <= r5) goto L_0x00c1
            r12 = r3[r5]     // Catch:{ Exception -> 0x00d8 }
        L_0x00c1:
            int r12 = r3.length     // Catch:{ Exception -> 0x00d8 }
            int r13 = r5 + 1
            if (r12 <= r13) goto L_0x00cb
            r12 = r3[r13]     // Catch:{ Exception -> 0x00d8 }
            com.tencent.p014mm.sdk.platformtools.Util.getLong(r12, r8)     // Catch:{ Exception -> 0x00d8 }
        L_0x00cb:
            int r12 = r3.length     // Catch:{ Exception -> 0x00d8 }
            int r5 = r5 + r11
            if (r12 <= r5) goto L_0x00df
            r3 = r3[r5]     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r5 = "1"
            boolean r3 = r3.equals(r5)     // Catch:{ Exception -> 0x00d8 }
            goto L_0x00e0
        L_0x00d8:
            java.lang.String r3 = "MicroMsg.VoiceContent"
            java.lang.String r5 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r5)
        L_0x00df:
            r3 = 0
        L_0x00e0:
            if (r3 != 0) goto L_0x00e4
            r3 = 1
            goto L_0x00e5
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            r5 = 0
            if (r20 != 0) goto L_0x0150
            eo3.a$d r11 = new eo3.a$d
            r11.<init>()
            android.content.Context r12 = r0.f24696e
            r13 = 2131497335(0x7f0c1177, float:1.861826E38)
            android.view.View r12 = android.view.View.inflate(r12, r13, r5)
            r13 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r11.f222195a = r13
            r13 = 2131310284(0x7f0936cc, float:1.8238876E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r11.f222196b = r13
            r13 = 2131315971(0x7f094d03, float:1.825041E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r11.f222197c = r13
            r13 = 2131306982(0x7f0929e6, float:1.8232178E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r11.f222198d = r13
            r13 = 2131315309(0x7f094a6d, float:1.8249068E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r11.f222199e = r13
            android.content.Context r14 = r0.f24696e
            int r14 = com.tencent.p014mm.p136ui.tools.C45081s1.m49932a(r14)
            r13.setBackgroundResource(r14)
            r13 = 2131306321(0x7f092751, float:1.8230838E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r11.f222200f = r13
            r13 = 2131314937(0x7f0948f9, float:1.8248313E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r11.f222201g = r13
            r12.setTag(r11)
            goto L_0x0158
        L_0x0150:
            java.lang.Object r11 = r20.getTag()
            eo3.a$d r11 = (eo3.C75630a.C75634d) r11
            r12 = r20
        L_0x0158:
            java.util.HashMap<java.lang.String, eo3.a$c> r13 = r0.f222186q
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r2.getUsername()
            r14.append(r15)
            java.lang.String r15 = r2.getContent()
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.Object r13 = r13.get(r14)
            eo3.a$c r13 = (eo3.C75630a.C75633c) r13
            java.lang.String r14 = ""
            if (r13 != 0) goto L_0x02ca
            eo3.a$c r13 = new eo3.a$c
            r13.<init>(r0, r5)
            di3.d r15 = di3.C86312j.m106911c(r1)
            ny.h r15 = (p629ny.C76979h) r15
            android.content.Context r7 = r0.f24696e
            java.lang.Class<d62.i> r16 = d62.C75339i.class
            di3.d r16 = di3.C86312j.m106911c(r16)
            r10 = r16
            d62.i r10 = (d62.C75339i) r10
            java.lang.String r8 = r2.getUsername()
            java.lang.String r8 = r10.getDisplayName(r8)
            android.widget.TextView r9 = r11.f222196b
            float r9 = r9.getTextSize()
            android.text.SpannableString r7 = r15.yp0(r7, r8, r9)
            r13.f222192a = r7
            int r7 = r2.getStatus()
            if (r7 != r4) goto L_0x01b6
            android.content.Context r7 = r0.f24696e
            r8 = 2131832668(0x7f112f5c, float:1.9298396E38)
            java.lang.String r7 = r7.getString(r8)
            goto L_0x01cf
        L_0x01b6:
            long r7 = r2.mo108821o2()
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x01c5
            r7 = r14
            goto L_0x01cf
        L_0x01c5:
            android.content.Context r7 = r0.f24696e
            long r8 = r2.mo108821o2()
            java.lang.CharSequence r7 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r7, r8, r4)
        L_0x01cf:
            r13.f222193b = r7
            android.widget.TextView r7 = r11.f222198d
            float r7 = r7.getTextSize()
            int r7 = (int) r7
            int r8 = eb0.C75592q0.m90787q()
            java.lang.String r9 = r2.getUsername()
            eb0.c r10 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r10 = r10.mo105906u()
            r15 = 17
            java.lang.Object r5 = r10.mo119684e(r15, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r5)
            if (r5 != r4) goto L_0x01f8
            r5 = 1
            goto L_0x01f9
        L_0x01f8:
            r5 = 0
        L_0x01f9:
            java.lang.String r10 = "qqmail"
            boolean r10 = r9.equals(r10)
            r15 = 2131836254(0x7f113d5e, float:1.930567E38)
            if (r10 == 0) goto L_0x020e
            if (r5 != 0) goto L_0x020e
            android.content.Context r5 = r0.f24696e
            java.lang.String r5 = r5.getString(r15)
            goto L_0x0285
        L_0x020e:
            eb0.c r5 = eb0.C97625j3.m125812b()
            g62.p r5 = r5.mo105877C()
            com.tencent.mm.storage.s4 r5 = (com.tencent.p014mm.storage.C44667s4) r5
            java.lang.String r10 = "@t.qq.com"
            com.tencent.mm.storage.r4 r5 = r5.mo69821jo(r10)
            if (r5 == 0) goto L_0x0228
            boolean r5 = r5.mo69814c()
            if (r5 == 0) goto L_0x0228
            r5 = 1
            goto L_0x0229
        L_0x0228:
            r5 = 0
        L_0x0229:
            java.lang.String r10 = "tmessage"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x023b
            if (r5 != 0) goto L_0x023b
            android.content.Context r5 = r0.f24696e
            java.lang.String r5 = r5.getString(r15)
            goto L_0x0285
        L_0x023b:
            r5 = r8 & 64
            if (r5 == 0) goto L_0x0241
            r5 = 1
            goto L_0x0242
        L_0x0241:
            r5 = 0
        L_0x0242:
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x0251
            if (r5 != 0) goto L_0x0251
            android.content.Context r5 = r0.f24696e
            java.lang.String r5 = r5.getString(r15)
            goto L_0x0285
        L_0x0251:
            di3.d r5 = di3.C86312j.m106911c(r1)
            ny.h r5 = (p629ny.C76979h) r5
            android.content.Context r6 = r0.f24696e
            int r8 = r2.mo108832y2()
            java.lang.String r9 = r2.getUsername()
            java.lang.String r10 = r2.getContent()
            java.lang.String r15 = r2.mo108781B2()
            if (r15 == 0) goto L_0x027a
            int r17 = r15.length()
            if (r17 <= 0) goto L_0x027a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ NumberFormatException -> 0x027a }
            int r15 = r15.intValue()     // Catch:{ NumberFormatException -> 0x027a }
            goto L_0x027b
        L_0x027a:
            r15 = 1
        L_0x027b:
            android.content.Context r4 = r0.f24696e
            java.lang.String r4 = p875ci.C67379u.m79745j(r8, r9, r10, r15, r4)
            android.text.SpannableString r5 = r5.op0(r6, r4, r7)
        L_0x0285:
            r13.f222194c = r5
            java.lang.String r4 = r2.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r4)
            if (r4 == 0) goto L_0x02ae
            java.lang.Class<wo.b> r4 = p740wo.C53193b.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            wo.b r4 = (p740wo.C53193b) r4
            java.lang.String r5 = r2.getUsername()
            int r4 = r4.mo73729p1(r5)
            if (r4 != 0) goto L_0x02ae
            android.content.Context r4 = r0.f24696e
            r5 = 2131823645(0x7f110c1d, float:1.9280096E38)
            java.lang.String r4 = r4.getString(r5)
            r13.f222192a = r4
        L_0x02ae:
            java.util.HashMap<java.lang.String, eo3.a$c> r4 = r0.f222186q
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.getUsername()
            r5.append(r6)
            java.lang.String r6 = r2.getContent()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.put(r5, r13)
        L_0x02ca:
            android.widget.TextView r4 = r11.f222198d
            android.content.res.ColorStateList[] r5 = r0.f222185p
            r3 = r5[r3]
            r4.setTextColor(r3)
            android.widget.TextView r3 = r11.f222196b
            java.lang.CharSequence r4 = r13.f222192a
            r3.setText(r4)
            android.widget.TextView r3 = r11.f222197c
            java.lang.CharSequence r4 = r13.f222193b
            r3.setText(r4)
            android.widget.TextView r3 = r11.f222198d
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r4 = r0.f24696e
            java.lang.CharSequence r5 = r13.f222194c
            java.lang.String r5 = r5.toString()
            android.widget.TextView r6 = r11.f222198d
            float r6 = r6.getTextSize()
            android.text.SpannableString r1 = r1.yp0(r4, r5, r6)
            r3.setText(r1)
            long r3 = r2.mo108821o2()
            r1 = 8
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0310
            android.widget.TextView r3 = r11.f222197c
            r3.setVisibility(r1)
            goto L_0x0316
        L_0x0310:
            android.widget.TextView r3 = r11.f222197c
            r4 = 0
            r3.setVisibility(r4)
        L_0x0316:
            android.widget.ImageView r3 = r11.f222200f
            r3.setVisibility(r1)
            java.lang.String r3 = r2.getUsername()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            if (r3 == 0) goto L_0x0341
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r3 = r3.mo105907v()
            java.lang.String r4 = r2.getUsername()
            com.tencent.mm.storage.z1 r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0341
            int r3 = r3.f149512S
            if (r3 != 0) goto L_0x0341
            android.widget.ImageView r3 = r11.f222200f
            r4 = 0
            r3.setVisibility(r4)
        L_0x0341:
            android.widget.ImageView r3 = r11.f222195a
            java.lang.String r4 = r2.getUsername()
            java.lang.Class<ln.f> r5 = p196ln.C76705f.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ln.f r5 = (p196ln.C76705f) r5
            r5.mo106849z(r3, r4)
            boolean r3 = r0.f222187r
            if (r3 == 0) goto L_0x03a6
            int r3 = r2.mo108786G2()
            r4 = 100
            if (r3 <= r4) goto L_0x036c
            android.widget.TextView r3 = r11.f222199e
            java.lang.String r4 = "..."
            r3.setText(r4)
            android.widget.TextView r3 = r11.f222199e
            r4 = 0
            r3.setVisibility(r4)
            goto L_0x03a6
        L_0x036c:
            int r3 = r2.mo108786G2()
            if (r3 <= 0) goto L_0x03a0
            android.widget.TextView r3 = r11.f222199e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            int r5 = r2.mo108786G2()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
            android.widget.TextView r3 = r11.f222199e
            android.content.Context r4 = r0.f24696e
            int r5 = r2.mo108786G2()
            int r4 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r4, r5)
            r3.setBackgroundResource(r4)
            android.widget.TextView r3 = r11.f222199e
            r4 = 0
            r3.setVisibility(r4)
            goto L_0x03a6
        L_0x03a0:
            android.widget.TextView r3 = r11.f222199e
            r4 = 4
            r3.setVisibility(r4)
        L_0x03a6:
            boolean r3 = eb0.C97625j3.m125811a()
            if (r3 == 0) goto L_0x03f7
            boolean r3 = eb0.C45628s0.m50772f(r2)
            if (r3 != 0) goto L_0x03cf
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r3 = r3.mo105908w()
            com.tencent.mm.storage.i2 r3 = (com.tencent.p014mm.storage.C44660i2) r3
            boolean r3 = r3.mo69754Z(r2)
            if (r3 == 0) goto L_0x03cf
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r3 = r3.mo105908w()
            com.tencent.mm.storage.i2 r3 = (com.tencent.p014mm.storage.C44660i2) r3
            r3.mo69770i0(r2)
        L_0x03cf:
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r3 = r3.mo105908w()
            com.tencent.mm.storage.i2 r3 = (com.tencent.p014mm.storage.C44660i2) r3
            boolean r3 = r3.mo69754Z(r2)
            r4 = 2131300457(0x7f091069, float:1.8218944E38)
            if (r3 != 0) goto L_0x03ed
            android.view.View r3 = r12.findViewById(r4)
            r4 = 2131231818(0x7f08044a, float:1.8079728E38)
            r3.setBackgroundResource(r4)
            goto L_0x03f7
        L_0x03ed:
            android.view.View r3 = r12.findViewById(r4)
            r4 = 2131231817(0x7f080449, float:1.8079726E38)
            r3.setBackgroundResource(r4)
        L_0x03f7:
            com.tencent.mm.autogen.events.TalkRoomServerEvent r3 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r3.<init>()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$a r4 = r3.f154883d
            r5 = 1
            r4.f154885a = r5
            r3.publish()
            r4 = 7
            r5 = 0
            long r7 = g62.C45881a.m51165b(r2, r4, r5)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x043a
            java.lang.String r4 = r2.getUsername()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r5 = r3.f154884e
            java.lang.String r5 = r5.f154887a
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x043a
            r4 = 6
            long r5 = r2.mo108821o2()
            long r4 = g62.C45881a.m51165b(r2, r4, r5)
            r2.mo101161T2(r4)
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            java.lang.String r5 = r2.getUsername()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            r4.mo69773k0(r2, r5)
        L_0x043a:
            dd0.b r4 = dd0.C75350g.m90357a()
            if (r4 == 0) goto L_0x0477
            dd0.b r4 = dd0.C75350g.m90357a()
            java.lang.String r5 = r2.getUsername()
            sx2.j r4 = (sx2.C48497j) r4
            boolean r4 = r4.mo73129c(r5)
            if (r4 != 0) goto L_0x0451
            goto L_0x0477
        L_0x0451:
            android.widget.ImageView r1 = r11.f222201g
            r4 = 0
            r1.setVisibility(r4)
            java.lang.String r1 = r2.getUsername()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r2 = r3.f154884e
            java.lang.String r2 = r2.f154887a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x046e
            android.widget.ImageView r1 = r11.f222201g
            r2 = 2131757030(0x7f1007e6, float:1.9144984E38)
            r1.setImageResource(r2)
            goto L_0x047c
        L_0x046e:
            android.widget.ImageView r1 = r11.f222201g
            r2 = 2131757029(0x7f1007e5, float:1.9144982E38)
            r1.setImageResource(r2)
            goto L_0x047c
        L_0x0477:
            android.widget.ImageView r2 = r11.f222201g
            r2.setVisibility(r1)
        L_0x047c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: eo3.C75630a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        Cursor[] cursorArr = new Cursor[2];
        cursorArr[0] = C97625j3.m125812b().mo105879E().mo71147a(C45628s0.f123398d, this.f222184o, this.f222188s);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<String> list = this.f222184o;
        if (list != null && list.size() > 0) {
            arrayList.addAll(this.f222184o);
        }
        while (cursorArr[0].moveToNext()) {
            try {
                Cursor cursor = cursorArr[0];
                String string = cursor.getString(cursor.getColumnIndex("username"));
                arrayList.add(string);
                if (!C72996z1.m85820U5(string)) {
                    arrayList2.add(string);
                }
                Log.m105918d("MicroMsg.SearchConversationAdapter", "block user " + string);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SearchConversationAdapter", e, "", new Object[0]);
            }
        }
        cursorArr[1] = C97625j3.m125812b().mo105878D().mo71146c(this.f222188s, "@micromsg.with.all.biz.qq.com", (String) null, arrayList, false, true, true, 2, arrayList2);
        mo7998r(new MergeCursor(cursorArr));
        notifyDataSetChanged();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        HashMap<String, C75633c> hashMap;
        if (str == null || str.equals("") || (hashMap = this.f222186q) == null) {
            HashMap<String, C75633c> hashMap2 = this.f222186q;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
        } else {
            hashMap.remove(str);
        }
        mo7991f();
    }
}
