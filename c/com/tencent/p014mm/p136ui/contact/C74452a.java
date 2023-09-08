package com.tencent.p014mm.p136ui.contact;

import ai3.C112789a;
import ai3.C67047d;
import ai3.C67048e;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75029y;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.chatting.view.AvatarImageView;
import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44655f;
import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import he0.C76158j;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kg3.C76577a;
import p196ln.C76705f;
import p629ny.C76979h;
import p773yy.C79168k;
import qy2.C63347a;
import xv2.C102775d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.contact.a */
public class C74452a extends C75029y<String, C44655f> implements MStorageEx.IOnStorageChange {

    /* renamed from: A */
    public String f218893A = "";

    /* renamed from: B */
    public int[] f218894B;

    /* renamed from: C */
    public String[] f218895C;

    /* renamed from: D */
    public MMSlideDelView.C73188i f218896D;

    /* renamed from: E */
    public MMSlideDelView.C73185e f218897E;

    /* renamed from: F */
    public MMSlideDelView.C73186f f218898F = MMSlideDelView.getItemStatusCallBack();

    /* renamed from: G */
    public AddressUI.AddressUIFragment f218899G;

    /* renamed from: H */
    public Set<Integer> f218900H = new HashSet();

    /* renamed from: I */
    public int f218901I = 0;

    /* renamed from: J */
    public boolean f218902J = true;

    /* renamed from: K */
    public boolean f218903K = false;

    /* renamed from: L */
    public boolean f218904L = false;

    /* renamed from: M */
    public WeakReference<Context> f218905M;

    /* renamed from: N */
    public LinkedList<View> f218906N = new LinkedList<>();

    /* renamed from: P */
    public boolean f218907P;

    /* renamed from: Q */
    public HashMap<View, ViewStub> f218908Q = new HashMap<>();

    /* renamed from: R */
    public NoMeasuredTextView.C73213c f218909R = new C74454b();

    /* renamed from: S */
    public SparseArray<String> f218910S = new SparseArray<>();

    /* renamed from: T */
    public HashSet<String> f218911T;

    /* renamed from: w */
    public String f218912w = null;

    /* renamed from: x */
    public String f218913x = null;

    /* renamed from: y */
    public List<String> f218914y = null;

    /* renamed from: z */
    public int f218915z;

    /* renamed from: com.tencent.mm.ui.contact.a$a */
    public class C74453a implements View.OnClickListener {
        public C74453a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/AddressDrawWithCacheAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.AddressAdapter", "click avatarIv");
            if (view == null) {
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressDrawWithCacheAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C74452a aVar = C74452a.this;
            aVar.f218896D.mo96225a(view, aVar.f218897E.mo96224a(view), C0966R.C0970id.f5624k5);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressDrawWithCacheAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.a$b */
    public class C74454b implements NoMeasuredTextView.C73213c {
        public C74454b() {
        }

        /* renamed from: a */
        public CharSequence mo101876a(NoMeasuredTextView noMeasuredTextView, CharSequence charSequence, String str, int i, int i2) {
            CharSequence charSequence2;
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence;
            String str2 = str;
            float textSize = noMeasuredTextView.getPaint().getTextSize();
            int b = C76577a.m92151b(C74452a.this.f220760h, i2);
            float f = (float) b;
            noMeasuredTextView.getPaint().setTextSize(f);
            TextPaint paint = noMeasuredTextView.getPaint();
            float measureText = paint.measureText(" " + str2);
            noMeasuredTextView.getPaint().setTextSize(textSize);
            int measuredWidth = (noMeasuredTextView.getMeasuredWidth() - noMeasuredTextView.getCompoundPaddingRight()) - noMeasuredTextView.getCompoundPaddingLeft();
            double d = (double) measuredWidth;
            if (((double) measureText) >= 0.6d * d) {
                charSequence3 = TextUtils.ellipsize(charSequence4, noMeasuredTextView.getPaint(), (float) (d * 0.4d), TextUtils.TruncateAt.END);
                float measureText2 = noMeasuredTextView.getPaint().measureText(charSequence3.toString());
                noMeasuredTextView.getPaint().setTextSize(f);
                CharSequence ellipsize = TextUtils.ellipsize(str2, noMeasuredTextView.getPaint(), (((float) measuredWidth) - measureText2) - 20.0f, TextUtils.TruncateAt.END);
                noMeasuredTextView.getPaint().setTextSize(textSize);
                charSequence2 = ellipsize;
            } else {
                charSequence3 = TextUtils.ellipsize(charSequence4, noMeasuredTextView.getPaint(), ((float) measuredWidth) - measureText, TextUtils.TruncateAt.END);
                charSequence2 = str2;
            }
            Context context = C74452a.this.f220760h;
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, charSequence3 + " " + charSequence2);
            ColorStateList e = C76577a.m92154e(C74452a.this.f220760h, i);
            T1.setSpan(new TextAppearanceSpan((String) null, 0, b, e, e), charSequence3.length() + 1, charSequence3.length() + 1 + charSequence2.length(), 33);
            return T1;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.a$c */
    public static class C74455c {

        /* renamed from: a */
        public TextView f218918a;

        /* renamed from: b */
        public NoMeasuredTextView f218919b;

        /* renamed from: c */
        public ImageView f218920c;

        /* renamed from: d */
        public View f218921d;

        /* renamed from: e */
        public TextView f218922e;

        /* renamed from: f */
        public CategoryTipView f218923f;

        /* renamed from: g */
        public ViewGroup f218924g;
    }

    static {
        C76577a.m92154e(MMApplicationContext.getContext(), C0966R.color.a4r);
        C76577a.m92154e(MMApplicationContext.getContext(), C0966R.color.f3563xt);
    }

    public C74452a(Context context, String str, String str2, int i, boolean z) {
        super(true, context, 5000);
        new SparseArray();
        this.f218911T = new HashSet<>();
        new HashMap();
        this.f218905M = new WeakReference<>(context);
        this.f220760h = MMApplicationContext.getContext();
        this.f218912w = str;
        this.f218913x = str2;
        this.f218915z = i;
        this.f218903K = z;
        new LinkedList();
        new LinkedList();
        C75592q0.m90789s();
        this.f220756d = "MiscroMsg.AddressDrawWithCacheAdapter";
    }

    /* renamed from: A */
    public void mo70174A(C44655f fVar, C74455c cVar) {
        try {
            cVar.f218922e.setText((CharSequence) null);
            cVar.f218922e.setVisibility(8);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: B */
    public final boolean mo103500B() {
        return this.f218912w.equals("@micromsg.qq.com") || this.f218912w.equals("@all.contact.without.chatroom") || this.f218912w.equals("@all.contact.without.chatroom.without.openim");
    }

    /* renamed from: C */
    public Cursor mo70175C() {
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList linkedList = new LinkedList();
        linkedList.add("weixin");
        Cursor D3 = C97625j3.m125812b().mo105907v().mo69651D3(this.f218912w, this.f218913x, this.f218914y, linkedList, mo103500B(), this.f218903K);
        ((C119157j) C119157j.f356862d).mo183875f(new C74464b(this, linkedList));
        Log.m105918d("MicroMsg.AddressAdapter", "kevin setCursor : " + (System.currentTimeMillis() - currentTimeMillis));
        return D3;
    }

    /* renamed from: D */
    public String mo70176D(C44655f fVar, int i) {
        if (i < this.f218901I) {
            return mo103501F(C0966R.string.f7459gu);
        }
        int i2 = fVar.field_showHead;
        if (i2 == 31) {
            return "";
        }
        if (i2 == 123) {
            return "#";
        }
        if (i2 == 33) {
            return mo103501F(C0966R.string.f7417fp);
        }
        if (i2 == 43) {
            return mo103501F(C0966R.string.i6z);
        }
        if (i2 == 32) {
            return mo103501F(C0966R.string.f7459gu);
        }
        String str = this.f218910S.get(i2);
        if (str != null) {
            return str;
        }
        String valueOf = String.valueOf((char) fVar.field_showHead);
        this.f218910S.put(fVar.field_showHead, valueOf);
        return valueOf;
    }

    /* renamed from: E */
    public int mo70177E(C44655f fVar, int i) {
        if (i < this.f218901I) {
            return 32;
        }
        if (fVar != null) {
            return fVar.field_showHead;
        }
        Log.m105921e("MicroMsg.AddressAdapter", "contact is null, position:%d", Integer.valueOf(i));
        return -1;
    }

    /* renamed from: F */
    public final String mo103501F(int i) {
        String str = this.f218910S.get(i);
        if (str != null) {
            return str;
        }
        String string = this.f220760h.getString(i);
        this.f218910S.put(i, string);
        return string;
    }

    /* renamed from: G */
    public final void mo103502G(C74455c cVar) {
        cVar.f218924g.setVisibility(8);
        cVar.f218918a.setVisibility(8);
        cVar.f218923f.setVisibility(8);
    }

    /* renamed from: H */
    public void mo103503H() {
        this.f218911T.clear();
        this.f220757e = false;
        Log.m105924i(this.f220756d, "new cursor pasue");
    }

    /* renamed from: I */
    public void mo103504I() {
        int count = super.getCount();
        if (count != 0) {
            this.f218901I = mo104612j(0);
            C75029y<K, T>.f fVar = this.f220758f;
            if (fVar == null ? false : fVar.f192598a.mo91042w0()) {
                long currentTimeMillis = System.currentTimeMillis();
                HashSet hashSet = new HashSet();
                this.f218894B = new int[30];
                this.f218895C = new String[30];
                int i = 0;
                for (int i2 = this.f218901I; i2 < count; i2++) {
                    C44655f fVar2 = (C44655f) getItem(i2);
                    if (fVar2 != null) {
                        String D = mo70176D(fVar2, i2);
                        if (hashSet.add(D)) {
                            this.f218894B[i] = i2 - this.f218901I;
                            this.f218895C[i] = D;
                            i++;
                        }
                    } else {
                        Log.m105918d("MicroMsg.AddressAdapter", "newCursor getItem is null");
                    }
                }
                Log.m105918d("MicroMsg.AddressAdapter", "newCursor resetShowHead by Memory : " + (System.currentTimeMillis() - currentTimeMillis) + "favourCount : " + this.f218901I);
            } else {
                long currentTimeMillis2 = System.currentTimeMillis();
                this.f218894B = C45628s0.m50800t((String[]) null, this.f218912w, this.f218913x, this.f218914y, this.f218893A);
                this.f218895C = C45628s0.m50804v((String[]) null, this.f218912w, this.f218913x, this.f218893A, this.f218914y);
                Log.m105918d("MicroMsg.AddressAdapter", "kevin resetShowHead part1 : " + (System.currentTimeMillis() - currentTimeMillis2));
            }
            ((HashSet) this.f218900H).clear();
            int[] iArr = this.f218894B;
            if (iArr != null) {
                int length = iArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    ((HashSet) this.f218900H).add(Integer.valueOf(iArr[i3] - 1));
                }
            }
        }
    }

    /* renamed from: J */
    public void mo103505J(List<String> list) {
        if (this.f218915z != 2) {
            list.add(C75592q0.m90789s());
        }
        C44665r4 jo = ((C44667s4) C97625j3.m125812b().mo105877C()).mo69821jo("@t.qq.com");
        if (jo != null) {
            list.add(jo.f121095b);
        }
        int i = this.f218915z;
        if (i == 3 || i == 5 || i == 4 || i == 1 || i == 0) {
            Set<String> set = C45628s0.f123410p;
            for (String add : ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69680Z2()) {
                list.add(add);
            }
        }
        list.add("blogapp");
        this.f218914y = list;
    }

    /* renamed from: f */
    public C67047d<String> mo103506f() {
        return (C67047d) mo70175C();
    }

    /* renamed from: g */
    public C75029y<String, C44655f>.f mo103507g(C67047d<String> dVar) {
        return Looper.myLooper() != Looper.getMainLooper() ? new C75029y.C75037f(dVar) : new C75029y.C75037f(dVar, true);
    }

    public int getCount() {
        return super.getCount();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C74455c cVar;
        Context context = this.f218905M.get();
        if (context == null) {
            return view;
        }
        if (!this.f218907P) {
            for (int i2 = 0; i2 < 8; i2++) {
                this.f218906N.add(C85868k2.m106137b(context).inflate(C0966R.C0971layout.f6367cw, (ViewGroup) null));
            }
            this.f218907P = true;
        }
        C44655f fVar = (C44655f) getItem(i);
        if (view == null) {
            if (this.f218906N.size() > 0) {
                view = this.f218906N.getFirst();
                this.f218906N.removeFirst();
            } else {
                view = View.inflate(context, C0966R.C0971layout.f6367cw, (ViewGroup) null);
            }
            cVar = new C74455c();
            cVar.f218918a = (TextView) view.findViewById(C0966R.C0970id.bqq);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.bqz);
            NoMeasuredTextView noMeasuredTextView = (NoMeasuredTextView) view.findViewById(C0966R.C0970id.h_0);
            cVar.f218919b = noMeasuredTextView;
            noMeasuredTextView.setLayoutCallback(this.f218909R);
            cVar.f218919b.mo153549i(0, (float) C76577a.m92157h(this.f220760h, C0966R.dimen.f3927j7));
            cVar.f218919b.setShouldEllipsize(true);
            if (cVar.f218919b.getPaint() != null) {
                C85875k4.m106189j0(cVar.f218919b.getPaint(), 0.1f);
            }
            cVar.f218919b.setTextColor(C76577a.m92154e(this.f220760h, C0966R.color.a7f));
            cVar.f218919b.setGravity(16);
            cVar.f218920c = (ImageView) view.findViewById(C0966R.C0970id.f5624k5);
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.bqm);
            cVar.f218921d = view.findViewById(C0966R.C0970id.bqy);
            cVar.f218922e = (TextView) view.findViewById(C0966R.C0970id.f358885hn2);
            cVar.f218923f = (CategoryTipView) view.findViewById(C0966R.C0970id.bqr);
            cVar.f218924g = (ViewGroup) view.findViewById(C0966R.C0970id.bqp);
            ViewGroup.LayoutParams layoutParams = cVar.f218921d.getLayoutParams();
            layoutParams.height = (int) (((float) C76577a.m92155f(this.f220760h, C0966R.dimen.f3669az)) * C76577a.m92175z(this.f220760h));
            cVar.f218921d.setLayoutParams(layoutParams);
            view.setTag(cVar);
        } else {
            cVar = (C74455c) view.getTag();
        }
        if (fVar != null) {
            int i3 = i - 1;
            C44655f fVar2 = (C44655f) getItem(i3);
            int i4 = i + 1;
            C44655f fVar3 = (C44655f) getItem(i4);
            int E = fVar2 == null ? -1 : mo70177E(fVar2, i3);
            int E2 = mo70177E(fVar, i);
            if (fVar3 != null) {
                mo70177E(fVar3, i4);
            }
            cVar.f218923f.setTag(Integer.valueOf(E2));
            if (!this.f218902J) {
                mo103502G(cVar);
            } else if (i < 0 || E2 == E) {
                mo103502G(cVar);
            } else {
                String D = mo70176D(fVar, i);
                if (Util.isNullOrNil(D)) {
                    mo103502G(cVar);
                } else {
                    cVar.f218924g.setVisibility(0);
                    cVar.f218918a.setVisibility(0);
                    cVar.f218918a.setText(D);
                    cVar.f218923f.mo103328b(((C102775d) C86312j.m106911c(C102775d.class)).mo134166TA().mo105644d());
                }
            }
            String D2 = mo70176D(fVar, i);
            String D3 = fVar3 == null ? null : mo70176D(fVar3, i4);
            int paddingLeft = cVar.f218921d.getPaddingLeft();
            Activity activity = (Activity) this.f218905M.get();
            if (D2 == null || D2.equals(D3)) {
                cVar.f218919b.setBackground(C74942w4.m89785b(activity, C0966R.attr.f2868u6));
                cVar.f218921d.setBackground((Drawable) null);
            } else {
                cVar.f218919b.setBackground((Drawable) null);
                cVar.f218921d.setBackground(C74942w4.m89785b(activity, C0966R.attr.f2868u6));
            }
            cVar.f218921d.setPadding(paddingLeft, 0, 0, 0);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(cVar.f218920c, fVar.mo69642d());
            mo70178z(fVar, cVar);
            mo70174A(fVar, cVar);
            ((AvatarImageView) cVar.f218920c).getClass();
            ((AvatarImageView) cVar.f218920c).setTag(fVar.mo69642d());
        }
        cVar.f218920c.setOnClickListener(new C74453a());
        return view;
    }

    /* renamed from: h */
    public C112789a mo103510h() {
        return new C44655f();
    }

    public void notifyDataSetChanged() {
        C75592q0.m90789s();
        if (this.f218894B == null) {
            mo103504I();
        }
        if (super.getCount() == 0) {
            super.notifyDataSetChanged();
            return;
        }
        int j = mo104612j(0);
        this.f218901I = j;
        Log.m105925i("MicroMsg.AddressAdapter", "newcursor favourCount %d", Integer.valueOf(j));
        super.notifyDataSetChanged();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        AddressUI.AddressUIFragment addressUIFragment;
        if (obj == null || !(obj instanceof String)) {
            Log.m105919d("MicroMsg.AddressAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
        } else if (mStorageEx == C97625j3.m125812b().mo105907v()) {
            String str = (String) obj;
            if (C72996z1.m85796D5(str) || this.f218911T.contains(str)) {
                Log.m105918d("MicroMsg.AddressAdapter", "newcursor is stranger ，return");
                return;
            }
            mo104618q(str, 2);
            if (this.f218904L && (addressUIFragment = this.f218899G) != null) {
                addressUIFragment.f218421K = true;
                Log.m105918d("MicroMsg.AddressAdapter", "ADDRESS onNotifyChange");
            }
        }
    }

    /* renamed from: s */
    public ArrayList<C44655f> mo103512s(ArrayList<String> arrayList) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(arrayList.get(i));
        }
        ArrayList<C44655f> arrayList3 = new ArrayList<>(arrayList2.size());
        Cursor h4 = C97625j3.m125812b().mo105907v().mo69702h4(arrayList2);
        while (h4.moveToNext()) {
            C44655f fVar = new C44655f();
            fVar.mo69638a(h4);
            arrayList3.add(fVar);
        }
        h4.close();
        Log.m105918d("MicroMsg.AddressAdapter", "rebulidAllChangeData :" + (System.currentTimeMillis() - currentTimeMillis));
        return arrayList3;
    }

    /* renamed from: u */
    public SparseArray<String>[] mo103513u(HashSet<C75029y.C75036e<String, C44655f>> hashSet, SparseArray<String>[] sparseArrayArr) {
        SparseArray<String>[] sparseArrayArr2 = new SparseArray[sparseArrayArr.length];
        LinkedList linkedList = new LinkedList();
        linkedList.add("weixin");
        long currentTimeMillis = System.currentTimeMillis();
        Cursor v3 = C97625j3.m125812b().mo105907v().mo69727v3(this.f218912w, this.f218913x, this.f218914y, linkedList, mo103500B(), this.f218903K);
        if (v3 instanceof C67048e) {
            C67047d[] dVarArr = ((C67048e) v3).f192596f;
            int length = dVarArr.length;
            for (int i = 0; i < length; i++) {
                dVarArr[i].mo91033K0(5000);
                sparseArrayArr2[i] = new SparseArray<>();
                int i2 = 0;
                while (dVarArr[i].moveToNext()) {
                    sparseArrayArr2[i].put(i2, dVarArr[i].getString(0));
                    i2++;
                }
            }
            this.f218901I = dVarArr[0].getCount();
        } else {
            sparseArrayArr2[0] = new SparseArray<>();
            int i3 = 0;
            while (v3.moveToNext()) {
                sparseArrayArr2[0].put(i3, v3.getString(0));
                i3++;
            }
        }
        v3.close();
        Log.m105918d("MicroMsg.AddressAdapter", "refreshPosistion last :" + (System.currentTimeMillis() - currentTimeMillis));
        return sparseArrayArr2;
    }

    /* renamed from: z */
    public void mo70178z(C44655f fVar, C74455c cVar) {
        CharSequence charSequence = null;
        if (C72996z1.m85843n5(fVar.mo69642d())) {
            String wo = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(fVar.field_openImAppid, fVar.field_descWordingId);
            if (!Util.isNullOrNil(wo)) {
                if ("3552365301".equals(fVar.field_openImAppid)) {
                    wo = "@" + wo;
                }
                cVar.f218919b.mo153515g(wo, C0966R.color.a0v, 14);
            } else {
                cVar.f218919b.mo153515g((String) null, 0, 0);
            }
        } else {
            cVar.f218919b.mo153515g((String) null, 0, 0);
        }
        if (C72996z1.m85847r5(fVar.mo69642d()) || C45628s0.m50735A(fVar.mo69642d())) {
            cVar.f218919b.setCompoundRightDrawablesWithIntrinsicBounds((int) C0966R.raw.open_im_main_logo);
            cVar.f218919b.setDrawRightDrawable(true);
        } else {
            NoMeasuredTextView noMeasuredTextView = cVar.f218919b;
            if (noMeasuredTextView.f318772G) {
                noMeasuredTextView.setDrawRightDrawable(false);
            }
        }
        try {
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = this.f220760h;
            String b = fVar.mo69639b();
            String d = fVar.mo69642d();
            if (b == null || b.length() <= 0) {
                b = d;
            }
            charSequence = hVar.op0(context, b, C76577a.m92157h(this.f220760h, C0966R.dimen.f3927j7));
        } catch (Exception unused) {
        }
        if (charSequence == null) {
            charSequence = "";
        }
        cVar.f218919b.setText(charSequence);
        ((C79168k) C86312j.m106911c(C79168k.class)).mo74124Yl(cVar.f218919b, fVar.mo69642d(), C63347a.C47892c.CONTACT_LIST);
    }
}
