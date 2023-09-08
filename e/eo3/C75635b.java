package eo3;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import d62.C45286l;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import lj3.C46863b;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76706g;
import p196ln.C76708i;
import sf0.C48374j0;
import te3.C77961kx3;
import te3.C77967mx3;

/* renamed from: eo3.b */
public class C75635b extends C6975i1<C72996z1> implements C11385n {

    /* renamed from: A */
    public C46863b.C46867d f222202A = null;

    /* renamed from: B */
    public boolean f222203B = false;

    /* renamed from: o */
    public String[] f222204o;

    /* renamed from: p */
    public String f222205p;

    /* renamed from: q */
    public String f222206q;

    /* renamed from: r */
    public boolean f222207r = false;

    /* renamed from: s */
    public C72996z1 f222208s = null;

    /* renamed from: t */
    public LinkedList<C77961kx3> f222209t = new LinkedList<>();

    /* renamed from: u */
    public Context f222210u;

    /* renamed from: v */
    public List<String> f222211v = null;

    /* renamed from: w */
    public boolean f222212w = true;

    /* renamed from: x */
    public boolean f222213x = false;

    /* renamed from: y */
    public int f222214y = 1;

    /* renamed from: z */
    public C46863b f222215z = new C46863b(15, new C75639d(this));

    /* renamed from: eo3.b$a */
    public class C75636a implements Runnable {
        public C75636a() {
        }

        public void run() {
            C75635b.this.f222212w = false;
        }
    }

    /* renamed from: eo3.b$b */
    public class C75637b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f222217d;

        public C75637b(C117747y yVar) {
            this.f222217d = yVar;
        }

        public void run() {
            C77967mx3 l0 = ((C45286l) this.f222217d).mo70811l0();
            Log.m105918d("MicroMsg.SearchResultAdapter", "count " + l0.f227845D);
            if (l0.f227845D > 0) {
                for (C77961kx3 next : l0.f227846E) {
                    int i = next.f227773q;
                    Set<String> set = C45628s0.f123410p;
                    if (C72996z1.m85810M4(i)) {
                        C75635b bVar = C75635b.this;
                        if (bVar.f222209t == null) {
                            bVar.f222209t = new LinkedList<>();
                        }
                        C75635b.this.f222209t.add(next);
                    }
                }
            } else {
                String g = C48374j0.m53718g(l0.f227857d);
                Log.m105918d("MicroMsg.SearchResultAdapter", "user " + g);
                if (Util.nullAsNil(g).length() > 0) {
                    C77961kx3 kx32 = new C77961kx3();
                    kx32.f227763d = l0.f227857d;
                    kx32.f227773q = l0.f227867q;
                    kx32.f227771o = l0.f227865o;
                    kx32.f227764e = l0.f227858e;
                    kx32.f227776t = l0.f227870t;
                    kx32.f227756A = l0.f227842A;
                    kx32.f227770n = l0.f227864n;
                    kx32.f227769j = l0.f227863j;
                    kx32.f227767h = l0.f227861h;
                    kx32.f227774r = l0.f227868r;
                    kx32.f227778v = l0.f227872v;
                    kx32.f227775s = l0.f227869s;
                    kx32.f227777u = l0.f227871u;
                    kx32.f227782z = l0.f227876z;
                    ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93572u(g, C48374j0.m53715d(l0.f227862i));
                    C75635b bVar2 = C75635b.this;
                    if (bVar2.f222209t == null) {
                        bVar2.f222209t = new LinkedList<>();
                    }
                    C75635b.this.f222209t.clear();
                    int i2 = kx32.f227773q;
                    Set<String> set2 = C45628s0.f123410p;
                    if (C72996z1.m85810M4(i2)) {
                        C75635b.this.f222209t.add(kx32);
                    }
                    Log.m105918d("MicroMsg.SearchResultAdapter", "count " + C75635b.this.f222209t.size());
                }
            }
            C75635b.this.f222212w = false;
        }
    }

    /* renamed from: eo3.b$c */
    public class C75638c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f222219d;

        public C75638c(Runnable runnable) {
            this.f222219d = runnable;
        }

        public void run() {
            this.f222219d.run();
            C75635b.this.notifyDataSetChanged();
        }
    }

    /* renamed from: eo3.b$d */
    public class C75639d implements C46863b.C46866c {
        public C75639d(C75635b bVar) {
        }

        /* renamed from: a */
        public Bitmap mo63515a(String str) {
            return ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
        }
    }

    /* renamed from: eo3.b$e */
    public class C75640e implements C46863b.C46867d {
        public C75640e() {
        }

        /* renamed from: a */
        public int mo63517a() {
            LinkedList<C77961kx3> linkedList = C75635b.this.f222209t;
            if (linkedList == null) {
                return 0;
            }
            return linkedList.size();
        }

        /* renamed from: b */
        public String mo63518b(int i) {
            if (i < 0) {
                Log.m105920e("MicroMsg.SearchResultAdapter", "pos is invalid");
                return null;
            }
            C75635b bVar = C75635b.this;
            C77961kx3 t = bVar.mo105985t(i + bVar.mo7994h() + 1);
            if (t == null) {
                return null;
            }
            return t.f227763d.f141175d;
        }
    }

    /* renamed from: eo3.b$f */
    public class C75641f implements Runnable {
        public C75641f() {
        }

        public void run() {
            C75635b.this.f222212w = false;
        }
    }

    /* renamed from: eo3.b$g */
    public static class C75642g {

        /* renamed from: a */
        public MaskLayout f222223a;

        /* renamed from: b */
        public TextView f222224b;

        /* renamed from: c */
        public TextView f222225c;

        /* renamed from: d */
        public TextView f222226d;

        /* renamed from: e */
        public ProgressBar f222227e;
    }

    public C75635b(Context context, int i) {
        super(context, new C72996z1());
        this.f222210u = context;
        this.f222214y = i;
        C72996z1 z1Var = new C72996z1();
        this.f222208s = z1Var;
        z1Var.setUsername("_find_more_public_contact_");
        this.f222208s.mo62877T3();
        this.f222206q = "@micromsg.with.all.biz.qq.com";
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C72996z1 z1Var = (C72996z1) obj;
        C44668u3 v = C97625j3.m125812b().mo105907v();
        int i = C72996z1.f214113Y1;
        C72996z1 W2 = v.mo69674W2(cursor.getString(cursor.getColumnIndex("username")));
        if (W2 != null) {
            return W2;
        }
        C72996z1 z1Var2 = new C72996z1();
        z1Var2.convertFrom(cursor);
        C97625j3.m125812b().mo105907v().mo69690c4(z1Var2);
        return z1Var2;
    }

    public int getItemViewType(int i) {
        if (this.f222214y == 2) {
            return 2;
        }
        return mo105986u(i) ? 1 : 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: eo3.b$g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
            r16 = this;
            r1 = r16
            java.lang.Class<d62.i> r0 = d62.C75339i.class
            java.lang.Class<ln.f> r2 = p196ln.C76705f.class
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            boolean r4 = r16.mo7996n(r17)
            boolean r5 = r16.mo105986u(r17)
            boolean r6 = r1.f222207r
            r7 = 1
            r8 = 2131300342(0x7f090ff6, float:1.821871E38)
            r9 = 2131300353(0x7f091001, float:1.8218733E38)
            r10 = 2131300344(0x7f090ff8, float:1.8218715E38)
            r11 = 2131300347(0x7f090ffb, float:1.8218721E38)
            r12 = 2131493971(0x7f0c0453, float:1.8611437E38)
            java.lang.String r15 = ""
            r14 = 2131300351(0x7f090fff, float:1.821873E38)
            r13 = 0
            if (r6 == 0) goto L_0x019c
            if (r4 == 0) goto L_0x019c
            if (r18 == 0) goto L_0x003c
            java.lang.Object r0 = r18.getTag()
            eo3.b$g r0 = (eo3.C75635b.C75642g) r0
            if (r5 == 0) goto L_0x003c
            android.widget.ProgressBar r0 = r0.f222227e
            if (r0 != 0) goto L_0x003c
            r0 = r13
            goto L_0x003e
        L_0x003c:
            r0 = r18
        L_0x003e:
            if (r0 != 0) goto L_0x009c
            if (r5 == 0) goto L_0x0067
            android.content.Context r0 = r1.f222210u
            r4 = 2131493887(0x7f0c03ff, float:1.8611267E38)
            android.view.View r0 = android.view.View.inflate(r0, r4, r13)
            eo3.b$g r4 = new eo3.b$g
            r4.<init>()
            android.view.View r6 = r0.findViewById(r14)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4.f222225c = r6
            r6 = 2131312954(0x7f09413a, float:1.8244291E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            r4.f222227e = r6
            r0.setTag(r4)
            goto L_0x00a2
        L_0x0067:
            android.content.Context r0 = r1.f222210u
            android.view.View r0 = android.view.View.inflate(r0, r12, r13)
            eo3.b$g r4 = new eo3.b$g
            r4.<init>()
            android.view.View r6 = r0.findViewById(r11)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4.f222224b = r6
            android.view.View r6 = r0.findViewById(r10)
            com.tencent.mm.ui.base.MaskLayout r6 = (com.tencent.p014mm.p136ui.base.MaskLayout) r6
            r4.f222223a = r6
            android.view.View r6 = r0.findViewById(r14)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4.f222225c = r6
            android.view.View r6 = r0.findViewById(r9)
            android.widget.CheckBox r6 = (android.widget.CheckBox) r6
            android.view.View r6 = r0.findViewById(r8)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4.f222226d = r6
            r0.setTag(r4)
            goto L_0x00a2
        L_0x009c:
            java.lang.Object r4 = r0.getTag()
            eo3.b$g r4 = (eo3.C75635b.C75642g) r4
        L_0x00a2:
            r6 = r4
            r4 = r0
            java.lang.String r8 = "MicroMsg.SearchResultAdapter"
            if (r5 != 0) goto L_0x0128
            lj3.b$d r0 = r1.f222202A
            if (r0 != 0) goto L_0x00b3
            eo3.b$e r0 = new eo3.b$e
            r0.<init>()
            r1.f222202A = r0
        L_0x00b3:
            lj3.b r0 = r1.f222215z
            if (r0 == 0) goto L_0x00c3
            int r5 = r16.mo7994h()
            int r5 = r17 - r5
            int r5 = r5 - r7
            lj3.b$d r7 = r1.f222202A
            r0.mo72072b(r5, r7)
        L_0x00c3:
            te3.kx3 r0 = r16.mo105985t(r17)
            android.widget.TextView r5 = r6.f222224b
            r7 = 8
            r5.setVisibility(r7)
            if (r0 != 0) goto L_0x00d1
            return r4
        L_0x00d1:
            android.widget.TextView r5 = r6.f222226d
            r5.setVisibility(r7)
            com.tencent.mm.ui.base.MaskLayout r5 = r6.f222223a
            android.view.View r5 = r5.getContentView()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.f r2 = (p196ln.C76705f) r2
            te3.rv3 r7 = r0.f227763d
            java.lang.String r7 = r7.f141175d
            r2.mo106849z(r5, r7)
            int r2 = r0.f227773q
            if (r2 == 0) goto L_0x00f5
            com.tencent.mm.ui.base.MaskLayout r2 = r6.f222223a
            r2.setMaskDrawable(r13)
            goto L_0x00fa
        L_0x00f5:
            com.tencent.mm.ui.base.MaskLayout r2 = r6.f222223a
            r2.setMaskDrawable(r13)
        L_0x00fa:
            te3.rv3 r0 = r0.f227764e
            java.lang.String r0 = r0.f141175d
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            android.widget.TextView r2 = r6.f222225c     // Catch:{ Exception -> 0x011b }
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x011b }
            ny.h r3 = (p629ny.C76979h) r3     // Catch:{ Exception -> 0x011b }
            android.content.Context r5 = r1.f222210u     // Catch:{ Exception -> 0x011b }
            android.widget.TextView r7 = r6.f222225c     // Catch:{ Exception -> 0x011b }
            float r7 = r7.getTextSize()     // Catch:{ Exception -> 0x011b }
            android.text.SpannableString r0 = r3.yp0(r5, r0, r7)     // Catch:{ Exception -> 0x011b }
            r2.setText(r0)     // Catch:{ Exception -> 0x011b }
            goto L_0x019b
        L_0x011b:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r15, r2)
            android.widget.TextView r0 = r6.f222225c
            r0.setText(r15)
            goto L_0x019b
        L_0x0128:
            r2 = 0
            boolean r0 = r1.f222203B
            if (r0 == 0) goto L_0x0133
            android.widget.ProgressBar r0 = r6.f222227e
            r0.setVisibility(r2)
            goto L_0x013a
        L_0x0133:
            android.widget.ProgressBar r0 = r6.f222227e
            r2 = 8
            r0.setVisibility(r2)
        L_0x013a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "refresh  "
            r0.append(r2)
            boolean r2 = r1.f222212w
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            java.util.LinkedList<te3.kx3> r0 = r1.f222209t
            if (r0 == 0) goto L_0x015a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x017f
        L_0x015a:
            boolean r0 = r1.f222212w
            if (r0 != 0) goto L_0x017f
            android.widget.TextView r0 = r6.f222225c
            android.content.Context r2 = r1.f222210u
            r3 = 2131820827(0x7f11011b, float:1.927438E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setText(r2)
            android.widget.TextView r0 = r6.f222225c
            android.content.Context r2 = r1.f222210u
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101012(0x7f060554, float:1.7814422E38)
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            goto L_0x019b
        L_0x017f:
            android.widget.TextView r0 = r6.f222225c
            android.content.Context r2 = r1.f222210u
            r3 = 2131820828(0x7f11011c, float:1.9274382E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setText(r2)
            android.widget.TextView r0 = r6.f222225c
            android.content.Context r2 = r1.f222210u
            r3 = 2131101147(0x7f0605db, float:1.7814695E38)
            android.content.res.ColorStateList r2 = kg3.C76577a.m92154e(r2, r3)
            r0.setTextColor(r2)
        L_0x019b:
            return r4
        L_0x019c:
            int r4 = r1.f222214y
            r5 = 2
            if (r4 != r5) goto L_0x0217
            if (r18 != 0) goto L_0x01bd
            android.content.Context r2 = r1.f222210u
            r4 = 2131498136(0x7f0c1498, float:1.8619885E38)
            android.view.View r2 = android.view.View.inflate(r2, r4, r13)
            eo3.b$g r4 = new eo3.b$g
            r4.<init>()
            android.view.View r5 = r2.findViewById(r14)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f222225c = r5
            r2.setTag(r4)
            goto L_0x01c6
        L_0x01bd:
            java.lang.Object r2 = r18.getTag()
            r4 = r2
            eo3.b$g r4 = (eo3.C75635b.C75642g) r4
            r2 = r18
        L_0x01c6:
            com.tencent.mm.storage.z1 r5 = r16.getItem(r17)
            android.widget.TextView r6 = r4.f222225c
            android.content.Context r8 = r1.f222210u
            r9 = 2131101147(0x7f0605db, float:1.7814695E38)
            android.content.res.ColorStateList r8 = kg3.C76577a.m92154e(r8, r9)
            r6.setTextColor(r8)
            android.content.Context r6 = r1.f222210u     // Catch:{ Exception -> 0x020c }
            r8 = 2131838507(0x7f11462b, float:1.931024E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x020c }
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x020c }
            d62.i r0 = (d62.C75339i) r0     // Catch:{ Exception -> 0x020c }
            java.lang.String r9 = r5.getUsername()     // Catch:{ Exception -> 0x020c }
            java.lang.String r0 = r0.pv0(r5, r9)     // Catch:{ Exception -> 0x020c }
            r5 = 0
            r7[r5] = r0     // Catch:{ Exception -> 0x020c }
            java.lang.String r0 = r6.getString(r8, r7)     // Catch:{ Exception -> 0x020c }
            android.widget.TextView r5 = r4.f222225c     // Catch:{ Exception -> 0x020c }
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x020c }
            ny.h r3 = (p629ny.C76979h) r3     // Catch:{ Exception -> 0x020c }
            android.content.Context r6 = r1.f222210u     // Catch:{ Exception -> 0x020c }
            android.widget.TextView r7 = r4.f222225c     // Catch:{ Exception -> 0x020c }
            float r7 = r7.getTextSize()     // Catch:{ Exception -> 0x020c }
            android.text.SpannableString r0 = r3.yp0(r6, r0, r7)     // Catch:{ Exception -> 0x020c }
            r5.setText(r0)     // Catch:{ Exception -> 0x020c }
            goto L_0x0211
        L_0x020c:
            android.widget.TextView r0 = r4.f222225c
            r0.setText(r15)
        L_0x0211:
            android.widget.TextView r0 = r4.f222225c
            r0.setCompoundDrawablesWithIntrinsicBounds(r13, r13, r13, r13)
            return r2
        L_0x0217:
            r4 = 2131101147(0x7f0605db, float:1.7814695E38)
            if (r18 == 0) goto L_0x022a
            java.lang.Object r5 = r18.getTag()
            eo3.b$g r5 = (eo3.C75635b.C75642g) r5
            r6 = r5
            if (r5 != 0) goto L_0x0227
            r5 = r13
            goto L_0x022d
        L_0x0227:
            r5 = r18
            goto L_0x022d
        L_0x022a:
            r5 = r18
            r6 = r13
        L_0x022d:
            if (r5 != 0) goto L_0x0267
            android.content.Context r5 = r1.f222210u
            android.view.LayoutInflater r5 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r5)
            android.view.View r5 = r5.inflate(r12, r13)
            eo3.b$g r6 = new eo3.b$g
            r6.<init>()
            android.view.View r7 = r5.findViewById(r11)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f222224b = r7
            android.view.View r7 = r5.findViewById(r10)
            com.tencent.mm.ui.base.MaskLayout r7 = (com.tencent.p014mm.p136ui.base.MaskLayout) r7
            r6.f222223a = r7
            android.view.View r7 = r5.findViewById(r14)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f222225c = r7
            android.view.View r7 = r5.findViewById(r9)
            android.widget.CheckBox r7 = (android.widget.CheckBox) r7
            android.view.View r7 = r5.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f222226d = r7
            r5.setTag(r6)
        L_0x0267:
            com.tencent.mm.storage.z1 r7 = r16.getItem(r17)
            android.widget.TextView r8 = r6.f222224b
            if (r8 == 0) goto L_0x0274
            r9 = 8
            r8.setVisibility(r9)
        L_0x0274:
            android.widget.TextView r8 = r6.f222225c
            android.content.Context r9 = r1.f222210u
            java.lang.String r10 = r7.getUsername()
            boolean r10 = eb0.C45628s0.m50812z(r10)
            if (r10 != 0) goto L_0x0286
            r14 = 2131101147(0x7f0605db, float:1.7814695E38)
            goto L_0x0289
        L_0x0286:
            r14 = 2131101148(0x7f0605dc, float:1.7814698E38)
        L_0x0289:
            android.content.res.ColorStateList r4 = kg3.C76577a.m92154e(r9, r14)
            r8.setTextColor(r4)
            com.tencent.mm.ui.base.MaskLayout r4 = r6.f222223a
            android.view.View r4 = r4.getContentView()
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.f r2 = (p196ln.C76705f) r2
            java.lang.String r8 = r7.getUsername()
            r2.mo106849z(r4, r8)
            android.widget.TextView r2 = r6.f222226d
            r4 = 8
            r2.setVisibility(r4)
            int r2 = r7.mo73953E2()
            if (r2 == 0) goto L_0x02b8
            com.tencent.mm.ui.base.MaskLayout r2 = r6.f222223a
            r2.setMaskDrawable(r13)
            goto L_0x02bd
        L_0x02b8:
            com.tencent.mm.ui.base.MaskLayout r2 = r6.f222223a
            r2.setMaskDrawable(r13)
        L_0x02bd:
            di3.d r2 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0302 }
            ny.h r2 = (p629ny.C76979h) r2     // Catch:{ Exception -> 0x0302 }
            android.content.Context r3 = r1.f222210u     // Catch:{ Exception -> 0x0302 }
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0302 }
            d62.i r0 = (d62.C75339i) r0     // Catch:{ Exception -> 0x0302 }
            java.lang.String r4 = r7.getUsername()     // Catch:{ Exception -> 0x0302 }
            java.lang.String r0 = r0.getDisplayName(r4)     // Catch:{ Exception -> 0x0302 }
            android.widget.TextView r4 = r6.f222225c     // Catch:{ Exception -> 0x0302 }
            float r4 = r4.getTextSize()     // Catch:{ Exception -> 0x0302 }
            int r4 = (int) r4     // Catch:{ Exception -> 0x0302 }
            android.text.SpannableString r0 = r2.op0(r3, r0, r4)     // Catch:{ Exception -> 0x0302 }
            java.lang.String r2 = r7.getUsername()     // Catch:{ Exception -> 0x0302 }
            boolean r2 = eb0.C45628s0.m50748M(r2)     // Catch:{ Exception -> 0x0302 }
            if (r2 == 0) goto L_0x02fc
            java.lang.Class<he0.j> r2 = he0.C76158j.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0302 }
            he0.j r2 = (he0.C76158j) r2     // Catch:{ Exception -> 0x0302 }
            android.content.Context r3 = r1.f222210u     // Catch:{ Exception -> 0x0302 }
            java.lang.CharSequence r0 = r2.bm0(r3, r0)     // Catch:{ Exception -> 0x0302 }
            android.widget.TextView r2 = r6.f222225c     // Catch:{ Exception -> 0x0302 }
            r2.setText(r0)     // Catch:{ Exception -> 0x0302 }
            goto L_0x0307
        L_0x02fc:
            android.widget.TextView r2 = r6.f222225c     // Catch:{ Exception -> 0x0302 }
            r2.setText(r0)     // Catch:{ Exception -> 0x0302 }
            goto L_0x0307
        L_0x0302:
            android.widget.TextView r0 = r6.f222225c
            r0.setText(r15)
        L_0x0307:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eo3.C75635b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 3;
    }

    /* renamed from: i */
    public int mo6470i() {
        int i = 0;
        if (!this.f222207r) {
            return 0;
        }
        if (!this.f222208s.mo62936v3()) {
            i = this.f222209t.size();
        }
        return i + 1;
    }

    public boolean isEnabled(int i) {
        if (!mo105986u(i)) {
            return true;
        }
        LinkedList<C77961kx3> linkedList = this.f222209t;
        return !(linkedList == null || linkedList.size() == 0) || this.f222212w;
    }

    /* renamed from: l */
    public void mo1332l() {
        mo5580b();
        mo105988x(new C75646f(this, false));
    }

    /* renamed from: o */
    public void mo1333o() {
        mo105988x(new C75646f(this, false));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.SearchResultAdapter", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        if (yVar.getType() != 106) {
            Log.m105920e("MicroMsg.SearchResultAdapter", "error type");
            return;
        }
        this.f222203B = false;
        if (C74785j2.C6981a.m7247a(this.f222210u, i, i2, str, 7)) {
            this.f222212w = false;
        } else if (i == 4 && i2 == -4) {
            mo105988x(new C75641f());
        } else if (i == 0 && i2 == 0) {
            mo105988x(new C75637b(yVar));
        } else {
            mo105988x(new C75636a());
        }
    }

    /* renamed from: s */
    public C72996z1 getItem(int i) {
        return mo7996n(i) ? (C72996z1) this.f24695d : (C72996z1) super.getItem(i);
    }

    /* renamed from: t */
    public C77961kx3 mo105985t(int i) {
        try {
            Log.m105918d("MicroMsg.SearchResultAdapter", "position " + i + " size " + this.f222209t.size() + "  " + (i - mo7994h()));
            return this.f222209t.get((i - mo7994h()) - 1);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SearchResultAdapter", e, "", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = mo7994h();
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo105986u(int r3) {
        /*
            r2 = this;
            boolean r0 = r2.f222207r
            if (r0 == 0) goto L_0x0013
            int r0 = r2.mo7994h()
            if (r3 != r0) goto L_0x0013
            int r1 = r2.mo6470i()
            int r0 = r0 + r1
            if (r3 >= r0) goto L_0x0013
            r3 = 1
            return r3
        L_0x0013:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: eo3.C75635b.mo105986u(int):boolean");
    }

    /* renamed from: w */
    public boolean mo105987w(String str) {
        List<String> list = this.f222211v;
        if (list == null || str == null) {
            return true;
        }
        for (String equals : list) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    public final void mo105988x(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            notifyDataSetChanged();
            return;
        }
        MMHandlerThread.postToMainThread(new C75638c(runnable));
    }

    /* renamed from: z */
    public void mo105989z(boolean z) {
        this.f222213x = z;
        if (z) {
            this.f222208s.mo62877T3();
        }
    }
}
