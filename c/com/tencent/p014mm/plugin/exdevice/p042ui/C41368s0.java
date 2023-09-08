package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.exdevice.p042ui.C41345l1;
import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceLikeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import te3.n85;
import tv2.C14096e;
import tv2.C52366c;
import v71.C37689c;
import v71.C52778d;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.s0 */
public class C41368s0 extends BaseAdapter {

    /* renamed from: d */
    public Context f111364d;

    /* renamed from: e */
    public List<C41345l1> f111365e;

    /* renamed from: f */
    public Map<String, String> f111366f;

    /* renamed from: g */
    public String f111367g = C75592q0.m90789s();

    /* renamed from: h */
    public String f111368h;

    /* renamed from: i */
    public C41341k1 f111369i;

    /* renamed from: j */
    public String f111370j;

    /* renamed from: n */
    public boolean f111371n = false;

    /* renamed from: o */
    public n85 f111372o;

    /* renamed from: p */
    public List<C41345l1> f111373p;

    /* renamed from: q */
    public C41345l1.C41347b f111374q = new C41345l1.C41347b();

    /* renamed from: r */
    public View.OnClickListener f111375r = new C41370b();

    /* renamed from: s */
    public View.OnClickListener f111376s = new C41371c();

    /* renamed from: t */
    public View.OnClickListener f111377t = new C41372d();

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.s0$a */
    public class C41369a implements ExdeviceLikeView.C41269a {

        /* renamed from: a */
        public final /* synthetic */ C52778d f111378a;

        public C41369a(C52778d dVar) {
            this.f111378a = dVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.s0$b */
    public class C41370b implements View.OnClickListener {
        public C41370b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.ExdeviceRankAdapter", "hy: user clicked on the content");
            int intValue = ((Integer) view.getTag()).intValue();
            ((ExdeviceRankInfoUI) C41368s0.this.f111369i).mo64374J7(C41368s0.this.f111365e.get(intValue).f111320a.field_username);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.s0$c */
    public class C41371c implements View.OnClickListener {
        public C41371c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C41368s0 s0Var = C41368s0.this;
            ((ExdeviceRankInfoUI) s0Var.f111369i).mo64374J7(s0Var.f111367g);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.s0$d */
    public class C41372d implements View.OnClickListener {
        public C41372d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExdeviceRankInfoUI exdeviceRankInfoUI = (ExdeviceRankInfoUI) C41368s0.this.f111369i;
            exdeviceRankInfoUI.getClass();
            C14096e.m13447a(31);
            exdeviceRankInfoUI.mo64377M7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.s0$e */
    public static final class C41373e {

        /* renamed from: a */
        public View f111383a;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.s0$f */
    public static final class C41374f {

        /* renamed from: a */
        public View f111384a;

        /* renamed from: b */
        public View f111385b;

        /* renamed from: c */
        public TextView f111386c;

        /* renamed from: d */
        public ImageView f111387d;

        /* renamed from: e */
        public NoMeasuredTextView f111388e;

        /* renamed from: f */
        public TextView f111389f;

        /* renamed from: g */
        public ExdeviceLikeView f111390g;

        /* renamed from: h */
        public View f111391h;

        /* renamed from: i */
        public View f111392i;

        /* renamed from: j */
        public View f111393j;

        /* renamed from: k */
        public TextView f111394k;

        /* renamed from: l */
        public View f111395l;

        /* renamed from: m */
        public WeImageView f111396m;

        /* renamed from: n */
        public TextView f111397n;

        /* renamed from: o */
        public TextView f111398o;

        /* renamed from: p */
        public TextView f111399p;

        /* renamed from: q */
        public TextView f111400q;

        /* renamed from: r */
        public LinearLayout f111401r;
    }

    public C41368s0(Context context, String str) {
        this.f111364d = context;
        this.f111370j = str;
    }

    /* renamed from: a */
    public List<C41345l1> mo64436a(ArrayList<C37689c> arrayList, ArrayList<C52778d> arrayList2, boolean z) {
        if (arrayList == null) {
            try {
                arrayList = new ArrayList<>();
            } catch (Exception unused) {
                Log.m105928w("MicroMsg.ExdeviceRankAdapter", "ap: rank exception,null info");
                return new ArrayList();
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        List<C41345l1> d = mo64438d(arrayList, arrayList2, z);
        this.f111373p = d;
        return d;
    }

    /* renamed from: b */
    public C52778d mo64437b(String str, ArrayList<C52778d> arrayList) {
        if (arrayList == null) {
            return null;
        }
        Iterator<C52778d> it = arrayList.iterator();
        while (it.hasNext()) {
            C52778d next = it.next();
            if (str.equalsIgnoreCase(next.field_username)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final List<C41345l1> mo64438d(ArrayList<C37689c> arrayList, ArrayList<C52778d> arrayList2, boolean z) {
        boolean z2;
        LinkedList linkedList = new LinkedList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        C52778d b = mo64437b(this.f111367g, arrayList2);
        if (b != null) {
            C41345l1.C41347b bVar = this.f111374q;
            bVar.f111327e = b;
            bVar.f111324b = 3;
            if (b.field_score == 0) {
                ((C52366c) C86312j.m106911c(C52366c.class)).mo73382s6((Activity) this.f111364d, this.f111367g);
            }
        } else {
            C41345l1.C41347b bVar2 = this.f111374q;
            bVar2.f111327e = null;
            bVar2.f111325c = this.f111370j;
            bVar2.f111326d = this.f111367g;
            bVar2.f111324b = 7;
        }
        if (z) {
            this.f111374q.f111323a = 2;
        } else {
            this.f111374q.f111323a = 1;
        }
        arrayList3.add(this.f111374q.mo64423a());
        C41345l1.C41347b bVar3 = this.f111374q;
        bVar3.f111323a = 0;
        arrayList3.add(bVar3.mo64423a());
        mo64439f(linkedList, this.f111367g);
        ArrayList arrayList4 = new ArrayList();
        Log.m105919d("MicroMsg.ExdeviceRankAdapter", "ap: follow size %s, %s", Integer.valueOf(linkedList.size()), linkedList.toString());
        Iterator<C52778d> it = arrayList2.iterator();
        while (it.hasNext()) {
            C52778d next = it.next();
            C41345l1.C41347b bVar4 = this.f111374q;
            bVar4.f111327e = next;
            bVar4.f111323a = 1;
            bVar4.f111324b = 4;
            arrayList4.add(bVar4.mo64423a());
            if (linkedList.size() > 0) {
                String str = next.field_username;
                try {
                    Iterator it4 = linkedList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((C37689c) it4.next()).field_username.equalsIgnoreCase(str)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (Exception e) {
                    Log.m105918d("MicroMsg.ExdeviceRankAdapter", e.toString());
                }
                z2 = false;
                if (z2) {
                    C41345l1.C41347b bVar5 = this.f111374q;
                    bVar5.f111327e = next;
                    bVar5.f111323a = 1;
                    bVar5.f111324b = 2;
                    arrayList3.add(bVar5.mo64423a());
                    mo64439f(linkedList, next.field_username);
                }
            }
        }
        if (linkedList.size() > 0) {
            Iterator it5 = linkedList.iterator();
            while (it5.hasNext()) {
                C41345l1.C41347b bVar6 = this.f111374q;
                bVar6.f111326d = ((C37689c) it5.next()).field_username;
                bVar6.f111325c = this.f111370j;
                bVar6.f111327e = null;
                bVar6.f111323a = 1;
                bVar6.f111324b = 6;
                arrayList3.add(bVar6.mo64423a());
            }
        }
        if (arrayList3.size() > 2) {
            ((C41345l1) arrayList3.get(arrayList3.size() - 1)).f111322c = ((C41345l1) arrayList3.get(arrayList3.size() - 1)).f111322c | 2 | 1;
            C41345l1.C41347b bVar7 = this.f111374q;
            bVar7.f111323a = 0;
            bVar7.f111327e = null;
            arrayList3.add(bVar7.mo64423a());
        }
        if (arrayList4.size() > 1) {
            ((C41345l1) arrayList4.get(arrayList4.size() - 1)).f111322c = 5;
        }
        arrayList3.addAll(arrayList4);
        Log.m105919d("MicroMsg.ExdeviceRankAdapter", "rank: %d %s", Integer.valueOf(arrayList2.size()), arrayList2.toString());
        Log.m105919d("MicroMsg.ExdeviceRankAdapter", "all: %s %s", Integer.valueOf(arrayList3.size()), arrayList3.toString());
        return arrayList3;
    }

    /* renamed from: f */
    public final void mo64439f(LinkedList<C37689c> linkedList, String str) {
        if (linkedList != null) {
            Iterator<C37689c> it = linkedList.iterator();
            while (it.hasNext()) {
                C37689c next = it.next();
                if (next.field_username.equalsIgnoreCase(str)) {
                    Log.m105919d("MicroMsg.ExdeviceRankAdapter", "username: %s remove", next.toString());
                    it.remove();
                }
            }
        }
    }

    /* renamed from: g */
    public void mo64440g(n85 n85) {
        Log.m105925i("MicroMsg.ExdeviceRankAdapter", "setMySelfInfo: mySelfInfo:%s", n85);
        this.f111372o = n85;
    }

    public int getCount() {
        List<C41345l1> list = this.f111365e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object getItem(int i) {
        return this.f111365e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return this.f111365e.get(i).f111321b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v40, resolved type: com.tencent.mm.plugin.exdevice.ui.s0$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0587  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r32, android.view.View r33, android.view.ViewGroup r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r34
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            java.lang.Class<ln.f> r4 = p196ln.C76705f.class
            java.util.List<com.tencent.mm.plugin.exdevice.ui.l1> r5 = r0.f111365e
            java.lang.Object r5 = r5.get(r1)
            com.tencent.mm.plugin.exdevice.ui.l1 r5 = (com.tencent.p014mm.plugin.exdevice.p042ui.C41345l1) r5
            v71.d r12 = r5.f111320a
            java.util.List<com.tencent.mm.plugin.exdevice.ui.l1> r5 = r0.f111365e
            java.lang.Object r5 = r5.get(r1)
            com.tencent.mm.plugin.exdevice.ui.l1 r5 = (com.tencent.p014mm.plugin.exdevice.p042ui.C41345l1) r5
            int r6 = r31.getItemViewType(r32)
            int r5 = r5.f111322c
            r7 = 2
            r8 = 1
            r13 = 0
            if (r33 != 0) goto L_0x0156
            android.content.Context r10 = r0.f111364d
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r11 = 2131301090(0x7f0912e2, float:1.8220228E38)
            if (r6 == 0) goto L_0x0053
            if (r6 == r8) goto L_0x0046
            if (r6 == r7) goto L_0x0039
            r2 = r33
            goto L_0x0068
        L_0x0039:
            r14 = 2131494298(0x7f0c059a, float:1.86121E38)
            android.view.View r2 = r10.inflate(r14, r2, r13)
            com.tencent.mm.plugin.exdevice.ui.s0$f r10 = new com.tencent.mm.plugin.exdevice.ui.s0$f
            r10.<init>()
            goto L_0x0069
        L_0x0046:
            r14 = 2131494296(0x7f0c0598, float:1.8612096E38)
            android.view.View r2 = r10.inflate(r14, r2, r13)
            com.tencent.mm.plugin.exdevice.ui.s0$f r10 = new com.tencent.mm.plugin.exdevice.ui.s0$f
            r10.<init>()
            goto L_0x0069
        L_0x0053:
            r14 = 2131494297(0x7f0c0599, float:1.8612098E38)
            android.view.View r2 = r10.inflate(r14, r2, r13)
            com.tencent.mm.plugin.exdevice.ui.s0$e r10 = new com.tencent.mm.plugin.exdevice.ui.s0$e
            r10.<init>()
            android.view.View r14 = r2.findViewById(r11)
            r10.f111383a = r14
            r2.setTag(r10)
        L_0x0068:
            r10 = 0
        L_0x0069:
            if (r10 == 0) goto L_0x0167
            r14 = 2131300357(0x7f091005, float:1.8218741E38)
            android.view.View r14 = r2.findViewById(r14)
            r10.f111384a = r14
            r14 = 2131306599(0x7f092867, float:1.8231402E38)
            android.view.View r14 = r2.findViewById(r14)
            r10.f111385b = r14
            r14 = 2131301760(0x7f091580, float:1.8221587E38)
            android.view.View r14 = r2.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r10.f111386c = r14
            r14 = 2131301763(0x7f091583, float:1.8221593E38)
            android.view.View r14 = r2.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r10.f111387d = r14
            r14 = 2131301764(0x7f091584, float:1.8221595E38)
            android.view.View r14 = r2.findViewById(r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r14 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r14
            r10.f111388e = r14
            r14 = 2131301722(0x7f09155a, float:1.822151E38)
            android.view.View r14 = r2.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r10.f111389f = r14
            r14 = 2131301750(0x7f091576, float:1.8221567E38)
            android.view.View r14 = r2.findViewById(r14)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r14 = (com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceLikeView) r14
            r10.f111390g = r14
            android.view.View r11 = r2.findViewById(r11)
            r10.f111391h = r11
            r11 = 2131301765(0x7f091585, float:1.8221597E38)
            android.view.View r11 = r2.findViewById(r11)
            r10.f111393j = r11
            r11 = 2131301741(0x7f09156d, float:1.8221548E38)
            android.view.View r11 = r2.findViewById(r11)
            r10.f111392i = r11
            r11 = 2131313457(0x7f094331, float:1.8245311E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f111394k = r11
            r11 = 2131297250(0x7f0903e2, float:1.821244E38)
            android.view.View r11 = r2.findViewById(r11)
            r10.f111395l = r11
            r11 = 2131297245(0x7f0903dd, float:1.821243E38)
            android.view.View r11 = r2.findViewById(r11)
            com.tencent.mm.ui.widget.imageview.WeImageView r11 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r11
            r10.f111396m = r11
            r11 = 2131297253(0x7f0903e5, float:1.8212446E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f111397n = r11
            r11 = 2131297247(0x7f0903df, float:1.8212434E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f111398o = r11
            r11 = 2131297248(0x7f0903e0, float:1.8212436E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f111399p = r11
            r11 = 2131297249(0x7f0903e1, float:1.8212438E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f111400q = r11
            r11 = 2131297246(0x7f0903de, float:1.8212432E38)
            android.view.View r11 = r2.findViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r10.f111401r = r11
            com.tencent.mm.ui.base.NoMeasuredTextView r11 = r10.f111388e
            if (r11 == 0) goto L_0x0152
            android.content.Context r14 = r0.f111364d
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131165400(0x7f0700d8, float:1.7945016E38)
            float r14 = r14.getDimension(r15)
            r11.mo153549i(r13, r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r11 = r10.f111388e
            android.content.Context r14 = r0.f111364d
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131100486(0x7f060346, float:1.7813355E38)
            int r14 = r14.getColor(r15)
            r11.setTextColor((int) r14)
            com.tencent.mm.ui.base.NoMeasuredTextView r11 = r10.f111388e
            r11.setSingleLine(r8)
            com.tencent.mm.ui.base.NoMeasuredTextView r11 = r10.f111388e
            r11.setShouldEllipsize(r8)
        L_0x0152:
            r2.setTag(r10)
            goto L_0x0167
        L_0x0156:
            if (r6 == r8) goto L_0x015e
            if (r6 == r7) goto L_0x015e
            r2 = r33
            r14 = 0
            goto L_0x0168
        L_0x015e:
            java.lang.Object r2 = r33.getTag()
            r10 = r2
            com.tencent.mm.plugin.exdevice.ui.s0$f r10 = (com.tencent.p014mm.plugin.exdevice.p042ui.C41368s0.C41374f) r10
            r2 = r33
        L_0x0167:
            r14 = r10
        L_0x0168:
            if (r12 == 0) goto L_0x05e9
            if (r14 == 0) goto L_0x05e9
            java.lang.String r10 = r0.f111367g
            java.lang.String r11 = r12.field_username
            boolean r10 = r10.equalsIgnoreCase(r11)
            if (r10 == 0) goto L_0x0179
            r0.f111371n = r8
            goto L_0x017b
        L_0x0179:
            r0.f111371n = r13
        L_0x017b:
            if (r6 != r7) goto L_0x01b0
            android.widget.TextView r1 = r14.f111386c
            int r3 = r12.field_ranknum
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.setText(r3)
            android.widget.TextView r1 = r14.f111389f
            int r3 = r12.field_score
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.setText(r3)
            di3.d r1 = di3.C86312j.m106911c(r4)
            ln.f r1 = (p196ln.C76705f) r1
            android.widget.ImageView r3 = r14.f111387d
            java.lang.String r4 = r12.field_username
            r1.mo106849z(r3, r4)
            android.view.View r1 = r14.f111384a
            android.view.View$OnClickListener r3 = r0.f111376s
            r1.setOnClickListener(r3)
            android.widget.TextView r1 = r14.f111394k
            android.view.View$OnClickListener r3 = r0.f111377t
            r1.setOnClickListener(r3)
            goto L_0x05e9
        L_0x01b0:
            r6 = r5 & 2
            if (r6 == r7) goto L_0x01db
            java.lang.String r6 = r12.field_username
            java.lang.String r10 = r0.f111368h
            boolean r6 = r6.equalsIgnoreCase(r10)
            if (r6 == 0) goto L_0x01db
            java.lang.String r6 = r0.f111367g
            java.lang.String r10 = r0.f111368h
            boolean r6 = r6.equalsIgnoreCase(r10)
            if (r6 != 0) goto L_0x01db
            android.view.View r6 = r14.f111385b
            android.content.Context r10 = r0.f111364d
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131100480(0x7f060340, float:1.7813343E38)
            int r10 = r10.getColor(r11)
            r6.setBackgroundColor(r10)
            goto L_0x01ed
        L_0x01db:
            android.view.View r6 = r14.f111385b
            android.content.Context r10 = r0.f111364d
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131100479(0x7f06033f, float:1.781334E38)
            int r10 = r10.getColor(r11)
            r6.setBackgroundColor(r10)
        L_0x01ed:
            r5 = r5 & r8
            r15 = 8
            if (r5 != r8) goto L_0x0236
            android.view.View r5 = r14.f111391h
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r6.mo10233c(r10)
            java.lang.Object[] r17 = r6.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter"
            java.lang.String r19 = "getView"
            java.lang.String r20 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r5
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r6 = r6.mo10231a(r13)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r17 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter"
            java.lang.String r18 = "getView"
            java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0279
        L_0x0236:
            android.view.View r5 = r14.f111391h
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r6.mo10233c(r10)
            java.lang.Object[] r24 = r6.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter"
            java.lang.String r26 = "getView"
            java.lang.String r27 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r5
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r6 = r6.mo10231a(r13)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r24 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter"
            java.lang.String r25 = "getView"
            java.lang.String r26 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x0279:
            int r5 = r12.field_ranknum
            r6 = 100
            if (r5 < r6) goto L_0x0293
            android.widget.TextView r5 = r14.f111386c
            android.content.Context r6 = r0.f111364d
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131165402(0x7f0700da, float:1.794502E38)
            int r6 = r6.getDimensionPixelSize(r10)
            float r6 = (float) r6
            r5.setTextSize(r13, r6)
            goto L_0x02a6
        L_0x0293:
            android.widget.TextView r5 = r14.f111386c
            android.content.Context r6 = r0.f111364d
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131165401(0x7f0700d9, float:1.7945018E38)
            int r6 = r6.getDimensionPixelSize(r10)
            float r6 = (float) r6
            r5.setTextSize(r13, r6)
        L_0x02a6:
            int r5 = r12.field_ranknum
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x02b2
            android.widget.TextView r5 = r14.f111386c
            r5.setText(r6)
            goto L_0x02c8
        L_0x02b2:
            android.widget.TextView r5 = r14.f111386c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            int r11 = r12.field_ranknum
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r5.setText(r10)
        L_0x02c8:
            int r5 = r12.field_score
            r10 = 10000(0x2710, float:1.4013E-41)
            if (r5 < r10) goto L_0x02e1
            android.widget.TextView r5 = r14.f111389f
            android.content.Context r10 = r0.f111364d
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131100485(0x7f060345, float:1.7813353E38)
            int r10 = r10.getColor(r11)
            r5.setTextColor(r10)
            goto L_0x02f3
        L_0x02e1:
            android.widget.TextView r5 = r14.f111389f
            android.content.Context r10 = r0.f111364d
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131100484(0x7f060344, float:1.781335E38)
            int r10 = r10.getColor(r11)
            r5.setTextColor(r10)
        L_0x02f3:
            android.widget.TextView r5 = r14.f111389f
            int r10 = r12.field_score
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r5.setText(r10)
            boolean r5 = r0.f111371n
            if (r5 == 0) goto L_0x0317
            te3.n85 r5 = r0.f111372o
            if (r5 == 0) goto L_0x0317
            int r10 = r12.field_score
            if (r10 != 0) goto L_0x0317
            int r5 = r5.f138486e
            if (r10 == r5) goto L_0x0317
            android.widget.TextView r10 = r14.f111389f
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r10.setText(r5)
        L_0x0317:
            di3.d r4 = di3.C86312j.m106911c(r4)
            ln.f r4 = (p196ln.C76705f) r4
            android.widget.ImageView r5 = r14.f111387d
            java.lang.String r10 = r12.field_username
            r4.mo106849z(r5, r10)
            boolean r4 = r0.f111371n
            if (r4 != 0) goto L_0x0370
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            java.lang.String r5 = r12.field_username
            boolean r4 = r4.mo69724s3(r5)
            if (r4 != 0) goto L_0x0370
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f111366f
            if (r4 == 0) goto L_0x0370
            java.lang.String r5 = r12.field_username
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0370
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r14.f111388e
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r5 = r0.f111364d
            java.util.Map<java.lang.String, java.lang.String> r10 = r0.f111366f
            java.lang.String r11 = r12.field_username
            java.lang.Object r10 = r10.get(r11)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            com.tencent.mm.ui.base.NoMeasuredTextView r11 = r14.f111388e
            float r11 = r11.getTextSize()
            android.text.SpannableString r3 = r3.yp0(r5, r10, r11)
            r4.setText((java.lang.CharSequence) r3)
            goto L_0x0395
        L_0x0370:
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = r14.f111388e
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r5 = r0.f111364d
            java.lang.Class<d62.i> r10 = d62.C75339i.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            d62.i r10 = (d62.C75339i) r10
            java.lang.String r11 = r12.field_username
            java.lang.String r10 = r10.getDisplayName(r11)
            com.tencent.mm.ui.base.NoMeasuredTextView r11 = r14.f111388e
            float r11 = r11.getTextSize()
            android.text.SpannableString r3 = r3.yp0(r5, r10, r11)
            r4.setText((java.lang.CharSequence) r3)
        L_0x0395:
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r3 = r14.f111390g
            int r4 = r12.field_likecount
            r3.setLikeNum(r4)
            boolean r3 = r0.f111371n
            if (r3 == 0) goto L_0x03af
            te3.n85 r3 = r0.f111372o
            if (r3 == 0) goto L_0x03af
            int r3 = r3.f138488g
            int r4 = r12.field_likecount
            if (r3 == r4) goto L_0x03af
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r4 = r14.f111390g
            r4.setLikeNum(r3)
        L_0x03af:
            boolean r3 = r0.f111371n
            if (r3 == 0) goto L_0x03cc
            int r3 = r12.field_likecount
            if (r3 != 0) goto L_0x03c6
            te3.n85 r3 = r0.f111372o
            if (r3 == 0) goto L_0x03c0
            int r3 = r3.f138488g
            if (r3 == 0) goto L_0x03c0
            goto L_0x03c6
        L_0x03c0:
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r3 = r14.f111390g
            r3.setSelfLikeState(r13)
            goto L_0x03d3
        L_0x03c6:
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r3 = r14.f111390g
            r3.setSelfLikeState(r8)
            goto L_0x03d3
        L_0x03cc:
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r3 = r14.f111390g
            int r4 = r12.field_selfLikeState
            r3.setSelfLikeState(r4)
        L_0x03d3:
            int r3 = r12.field_score
            if (r3 > 0) goto L_0x03e2
            boolean r3 = r0.f111371n
            if (r3 == 0) goto L_0x03dc
            goto L_0x03e2
        L_0x03dc:
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r3 = r14.f111390g
            r3.setClickable(r13)
            goto L_0x03f1
        L_0x03e2:
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r3 = r14.f111390g
            r3.setClickable(r8)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView r3 = r14.f111390g
            com.tencent.mm.plugin.exdevice.ui.s0$a r4 = new com.tencent.mm.plugin.exdevice.ui.s0$a
            r4.<init>(r12)
            r3.setOnLikeViewClickListener(r4)
        L_0x03f1:
            bl3.r r3 = bl3.C39818r.f106831a
            android.content.Context r4 = r0.f111364d
            bl3.r$a r3 = r3.mo62443b(r4)
            java.lang.Class<c81.q> r4 = c81.C0435q.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            r10 = r3
            c81.q r10 = (c81.C0435q) r10
            r10.getClass()
            java.lang.Class<kr0.w0> r3 = kr0.C76629w0.class
            te3.pa4 r4 = r12.field_sportRecord
            if (r4 == 0) goto L_0x0584
            int r5 = r4.f139686o
            if (r5 == 0) goto L_0x0416
            if (r5 == r8) goto L_0x0416
            if (r5 != r7) goto L_0x0414
            goto L_0x0416
        L_0x0414:
            r5 = 0
            goto L_0x0417
        L_0x0416:
            r5 = 1
        L_0x0417:
            if (r5 == 0) goto L_0x041b
            r11 = r4
            goto L_0x041c
        L_0x041b:
            r11 = 0
        L_0x041c:
            if (r11 == 0) goto L_0x0584
            android.view.View r4 = r14.f111395l
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r5.mo10233c(r9)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/exdevice/uic/SportRankUIC"
            java.lang.String r19 = "handleRankRecordView"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/exdevice/rank/storage/info/ExdeviceRankInfo;Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$ExdeviceRankHolder;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r4
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r5.mo10231a(r13)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/exdevice/uic/SportRankUIC"
            java.lang.String r18 = "handleRankRecordView"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/exdevice/rank/storage/info/ExdeviceRankInfo;Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$ExdeviceRankHolder;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.TextView r4 = r14.f111397n
            java.lang.String r5 = "holder.appBrandNickNameTV"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.TextView r5 = r14.f111398o
            te3.pa4 r9 = r12.field_sportRecord
            java.lang.String r9 = r9.f139681g
            r5.setText(r9)
            android.widget.TextView r5 = r14.f111399p
            te3.pa4 r9 = r12.field_sportRecord
            int r9 = r9.f139682h
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r5.setText(r9)
            android.widget.TextView r5 = r14.f111400q
            te3.pa4 r9 = r12.field_sportRecord
            java.lang.String r9 = r9.f139683i
            r5.setText(r9)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r14.f111396m
            java.lang.String r9 = "holder.appBrandIconIV"
            gy3.C87412m.m108593f(r5, r9)
            int r9 = r11.f139686o
            r13 = 2131099806(0x7f06009e, float:1.7811976E38)
            if (r9 != 0) goto L_0x04e9
            te3.pa4 r6 = r12.field_sportRecord
            java.lang.String r6 = r6.f139678d
            java.lang.String r7 = "21f9d636b41b25be"
            boolean r6 = gy3.C87412m.m108589b(r7, r6)
            if (r6 != 0) goto L_0x04b2
            di3.d r3 = di3.C86312j.m106911c(r3)
            kr0.w0 r3 = (kr0.C76629w0) r3
            te3.pa4 r6 = r12.field_sportRecord
            java.lang.String r6 = r6.f139678d
            c81.m r7 = new c81.m
            r7.<init>(r10, r4, r5)
            r3.Ws0(r6, r7)
            goto L_0x04d9
        L_0x04b2:
            r6 = 2131837361(0x7f1141b1, float:1.9307915E38)
            r4.setText(r6)
            r6 = 2131756220(0x7f1004bc, float:1.9143341E38)
            r5.setImageResource(r6)
            android.app.Activity r6 = r10.getContext()
            int r6 = kg3.C76577a.m92153d(r6, r13)
            r5.setColorFilter(r6)
            di3.d r3 = di3.C86312j.m106911c(r3)
            kr0.w0 r3 = (kr0.C76629w0) r3
            java.lang.String r6 = r11.f139678d
            c81.n r7 = new c81.n
            r7.<init>(r10, r4, r5)
            r3.Ws0(r6, r7)
        L_0x04d9:
            android.widget.LinearLayout r3 = r14.f111401r
            if (r3 == 0) goto L_0x0584
            c81.o r4 = new c81.o
            r4.<init>(r11, r10)
            r3.setOnClickListener(r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0582
        L_0x04e9:
            if (r9 != r8) goto L_0x055c
            te3.pa4 r3 = r12.field_sportRecord
            java.lang.String r3 = r3.f139679e
            r4.setText(r3)
            hc0.c$b r3 = new hc0.c$b
            r3.<init>()
            r3.f59345a = r8
            r3.f59346b = r8
            r3.f59364t = r8
            hc0.c r3 = r3.mo32666a()
            gc0.a r6 = gc0.C20828a.m22825b()
            java.lang.String r7 = r11.f139685n
            r6.mo32519h(r7, r5, r3)
            java.lang.String r3 = r11.f139684j
            if (r3 == 0) goto L_0x0517
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0515
            goto L_0x0517
        L_0x0515:
            r3 = 0
            goto L_0x0518
        L_0x0517:
            r3 = 1
        L_0x0518:
            if (r3 != 0) goto L_0x0559
            org.json.JSONObject r9 = new org.json.JSONObject
            java.lang.String r3 = r11.f139684j
            r9.<init>(r3)
            java.lang.String r3 = "jump_type"
            int r3 = r9.optInt(r3)
            if (r3 == 0) goto L_0x052b
            r7 = 1
            goto L_0x052c
        L_0x052b:
            r7 = 0
        L_0x052c:
            android.app.Activity r6 = r10.getContext()
            java.lang.String r8 = "context"
            gy3.C87412m.m108594g(r6, r8)
            if (r7 == 0) goto L_0x053f
            r8 = 2131099851(0x7f0600cb, float:1.7812067E38)
            int r6 = kg3.C76577a.m92153d(r6, r8)
            goto L_0x0543
        L_0x053f:
            int r6 = kg3.C76577a.m92153d(r6, r13)
        L_0x0543:
            d81.d r8 = new d81.d
            r8.<init>(r4, r6, r5)
            zp3.C23564m.m28136f(r8)
            android.widget.LinearLayout r4 = r14.f111401r
            if (r4 == 0) goto L_0x0584
            c81.p r5 = new c81.p
            r6 = r5
            r8 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4.setOnClickListener(r5)
        L_0x0559:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0582
        L_0x055c:
            if (r9 != r7) goto L_0x0580
            java.lang.String r3 = "SimpleUIComponent"
            java.lang.String r7 = "handleRankRecordView: sportRecord.recordSourceType == SportProfileUIC.RECORD_SOURCE_TYPE_WINTER_OLYMPIC "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            r3 = 2131825367(0x7f1112d7, float:1.9283588E38)
            r4.setText(r3)
            r3 = 2131756879(0x7f10074f, float:1.9144678E38)
            r5.setImageResource(r3)
            android.widget.TextView r3 = r14.f111398o
            r3.setText(r6)
            android.widget.TextView r3 = r14.f111399p
            r3.setText(r6)
            android.widget.TextView r3 = r14.f111400q
            r3.setText(r6)
        L_0x0580:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0582:
            r9 = r3
            goto L_0x0585
        L_0x0584:
            r9 = 0
        L_0x0585:
            if (r9 != 0) goto L_0x05c9
            android.view.View r3 = r14.f111395l
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r4.mo10233c(r5)
            java.lang.Object[] r18 = r4.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/exdevice/uic/SportRankUIC"
            java.lang.String r20 = "handleRankRecordView"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/exdevice/rank/storage/info/ExdeviceRankInfo;Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$ExdeviceRankHolder;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r18 = "com/tencent/mm/plugin/exdevice/uic/SportRankUIC"
            java.lang.String r19 = "handleRankRecordView"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/exdevice/rank/storage/info/ExdeviceRankInfo;Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$ExdeviceRankHolder;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x05c9:
            android.view.View r3 = r14.f111392i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r32)
            r3.setTag(r4)
            android.view.View r3 = r14.f111392i
            android.view.View$OnClickListener r4 = r0.f111375r
            r3.setOnClickListener(r4)
            android.view.View r3 = r14.f111393j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r32)
            r3.setTag(r1)
            android.view.View r1 = r14.f111393j
            android.view.View$OnClickListener r3 = r0.f111375r
            r1.setOnClickListener(r3)
        L_0x05e9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.C41368s0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 3;
    }

    public boolean isEnabled(int i) {
        return false;
    }
}
