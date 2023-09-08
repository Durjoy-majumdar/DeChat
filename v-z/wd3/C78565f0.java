package wd3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.patmsg.p086ui.AvatarPatTipImageView;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import hc0.C20937c;
import he0.C76158j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p196ln.C76705f;
import p609mp.C76804d;
import p629ny.C76979h;
import pj3.C47511g;
import qe0.C47806g;
import vd3.C78399i;

/* renamed from: wd3.f0 */
public class C78565f0 extends BaseAdapter {

    /* renamed from: G */
    public static int f230132G = 19;

    /* renamed from: H */
    public static int f230133H = 5;

    /* renamed from: A */
    public int f230134A = 12;

    /* renamed from: B */
    public String f230135B;

    /* renamed from: C */
    public String f230136C;

    /* renamed from: D */
    public C20937c f230137D = null;

    /* renamed from: E */
    public boolean f230138E = true;

    /* renamed from: F */
    public boolean f230139F = false;

    /* renamed from: d */
    public C76804d f230140d;

    /* renamed from: e */
    public List<String> f230141e = new ArrayList();

    /* renamed from: f */
    public ArrayList<C72996z1> f230142f = new ArrayList<>();

    /* renamed from: g */
    public Context f230143g;

    /* renamed from: h */
    public boolean f230144h;

    /* renamed from: i */
    public boolean f230145i;

    /* renamed from: j */
    public boolean f230146j = false;

    /* renamed from: n */
    public boolean f230147n = false;

    /* renamed from: o */
    public boolean f230148o = false;

    /* renamed from: p */
    public C44661m1 f230149p;

    /* renamed from: q */
    public List<C72996z1> f230150q = new ArrayList();

    /* renamed from: r */
    public List<Object> f230151r = new ArrayList();

    /* renamed from: s */
    public int f230152s = 0;

    /* renamed from: t */
    public int f230153t = 0;

    /* renamed from: u */
    public C78399i f230154u;

    /* renamed from: v */
    public boolean f230155v = false;

    /* renamed from: w */
    public boolean f230156w = false;

    /* renamed from: x */
    public boolean f230157x = false;

    /* renamed from: y */
    public boolean f230158y = true;

    /* renamed from: z */
    public boolean f230159z = false;

    /* renamed from: wd3.f0$a */
    public class C78566a {

        /* renamed from: a */
        public Object f230160a;

        /* renamed from: b */
        public int f230161b;

        public C78566a(C78565f0 f0Var, Object obj, int i) {
            this.f230160a = obj;
            this.f230161b = i;
        }
    }

    /* renamed from: wd3.f0$b */
    public class C78567b {

        /* renamed from: a */
        public AvatarPatTipImageView f230162a;

        /* renamed from: b */
        public ImageView f230163b;

        /* renamed from: c */
        public TextView f230164c;

        /* renamed from: d */
        public TextView f230165d;

        /* renamed from: e */
        public TextView f230166e;

        /* renamed from: f */
        public ImageView f230167f;

        /* renamed from: g */
        public ImageView f230168g;

        public C78567b(C78565f0 f0Var) {
        }
    }

    public C78565f0(Context context) {
        this.f230143g = context;
        this.f230144h = false;
        context.getResources().getDimensionPixelSize(C0966R.dimen.f3623g);
    }

    /* renamed from: a */
    public boolean mo108544a(int i) {
        C47511g gVar;
        if (this.f230144h) {
            return false;
        }
        if (i < this.f230153t) {
            this.f230144h = true;
            C76804d dVar = this.f230140d;
            if (!(dVar == null || (gVar = C72741a.this.f211665b) == null)) {
                gVar.notifyDataSetChanged();
            }
        }
        return true;
    }

    /* renamed from: b */
    public final C78567b mo108545b(View view) {
        C78567b bVar = new C78567b(this);
        bVar.f230168g = (ImageView) view.findViewById(C0966R.C0970id.ivq);
        bVar.f230162a = (AvatarPatTipImageView) view.findViewById(C0966R.C0970id.iwa);
        bVar.f230163b = (ImageView) view.findViewById(C0966R.C0970id.ivp);
        bVar.f230164c = (TextView) view.findViewById(C0966R.C0970id.iw7);
        bVar.f230165d = (TextView) view.findViewById(C0966R.C0970id.iw8);
        bVar.f230166e = (TextView) view.findViewById(C0966R.C0970id.iw_);
        bVar.f230167f = (ImageView) view.findViewById(C0966R.C0970id.ivr);
        bVar.f230162a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setTag(bVar);
        return bVar;
    }

    /* renamed from: d */
    public boolean mo108546d(int i) {
        return i < this.f230153t;
    }

    /* renamed from: f */
    public void mo108547f() {
        C47511g gVar;
        List<String> list = this.f230141e;
        if (list != null || this.f230142f != null) {
            if (!this.f230158y) {
                ArrayList<C72996z1> arrayList = this.f230142f;
                if (arrayList != null) {
                    Log.m105919d("MicroMsg.ContactsListArchAdapter", "initData memberContactList.size %d", Integer.valueOf(arrayList.size()));
                    ((ArrayList) this.f230150q).clear();
                    if (this.f230142f.size() > 0) {
                        Iterator<C72996z1> it = this.f230142f.iterator();
                        while (it.hasNext()) {
                            ((ArrayList) this.f230150q).add(it.next());
                        }
                    }
                    this.f230153t = ((ArrayList) this.f230150q).size();
                }
            } else if (list != null) {
                Log.m105919d("MicroMsg.ContactsListArchAdapter", "initData memberList.size %d", Integer.valueOf(list.size()));
                ((ArrayList) this.f230150q).clear();
                ((ArrayList) this.f230151r).clear();
                LinkedList linkedList = new LinkedList();
                if (this.f230141e.size() > 0) {
                    int i = 1;
                    for (String next : this.f230141e) {
                        if (this.f230146j) {
                            ((ArrayList) this.f230151r).add(((C78585u0) C86312j.m106911c(C78585u0.class)).mo73838LN(next));
                        } else {
                            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next);
                            C44661m1 m1Var = this.f230149p;
                            if (m1Var == null || !next.equals(m1Var.field_roomowner)) {
                                C44661m1 m1Var2 = this.f230149p;
                                if (m1Var2 == null || !m1Var2.mo69793u2(z1Var.getUsername())) {
                                    linkedList.add(new C78566a(this, z1Var, 100));
                                } else {
                                    linkedList.add(new C78566a(this, z1Var, i));
                                    i++;
                                }
                            } else {
                                linkedList.add(new C78566a(this, z1Var, 0));
                            }
                        }
                    }
                    if (this.f230138E) {
                        Collections.sort(linkedList, new C78563e0(this));
                    }
                    if (!this.f230146j) {
                        Iterator it4 = linkedList.iterator();
                        while (it4.hasNext()) {
                            ((ArrayList) this.f230150q).add((C72996z1) ((C78566a) it4.next()).f230160a);
                        }
                    }
                }
                if (this.f230146j) {
                    this.f230153t = ((ArrayList) this.f230151r).size();
                } else if (this.f230145i) {
                    C44661m1 m1Var3 = this.f230149p;
                    if (m1Var3 == null || m1Var3.mo69797y2()) {
                        int size = ((ArrayList) this.f230150q).size();
                        int i2 = f230132G;
                        this.f230153t = size >= i2 + -1 ? i2 - 1 : ((ArrayList) this.f230150q).size();
                    } else {
                        int size2 = ((ArrayList) this.f230150q).size();
                        int i3 = f230132G;
                        if (size2 < i3) {
                            i3 = ((ArrayList) this.f230150q).size();
                        }
                        this.f230153t = i3;
                    }
                } else {
                    this.f230153t = ((ArrayList) this.f230150q).size();
                }
            }
            int i4 = this.f230153t;
            if (i4 == 0) {
                this.f230152s = f230133H;
            } else {
                boolean z = this.f230156w;
                if (z && this.f230155v && this.f230157x) {
                    int i5 = f230133H;
                    this.f230152s = (((i4 + 2) / i5) + 1) * i5;
                } else if ((z && this.f230155v && !this.f230157x) || ((z && !this.f230155v && this.f230157x) || (!z && this.f230155v && this.f230157x))) {
                    int i6 = f230133H;
                    this.f230152s = (((i4 + 1) / i6) + 1) * i6;
                } else if ((z && !this.f230155v && !this.f230157x) || ((!z && this.f230155v && !this.f230157x) || (!z && !this.f230155v && this.f230157x))) {
                    int i7 = f230133H;
                    this.f230152s = ((i4 / i7) + 1) * i7;
                } else if (!z && !this.f230155v && !this.f230157x) {
                    int i8 = f230133H;
                    this.f230152s = (((i4 - 1) / i8) + 1) * i8;
                }
            }
            Log.m105918d("MicroMsg.ContactsListArchAdapter", "Number Size  contactSize :" + this.f230153t + " realySize : " + this.f230152s);
            C76804d dVar = this.f230140d;
            if (dVar != null && (gVar = C72741a.this.f211665b) != null) {
                gVar.notifyDataSetChanged();
            }
        }
    }

    public int getCount() {
        return this.f230159z ? Math.min(this.f230134A, this.f230152s) : this.f230152s;
    }

    public Object getItem(int i) {
        if (i < this.f230153t) {
            return this.f230146j ? ((ArrayList) this.f230151r).get(i) : ((ArrayList) this.f230150q).get(i);
        }
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        char c;
        Object obj;
        C72996z1 z1Var;
        C78567b bVar;
        SpannableString spannableString;
        String str;
        String str2;
        String str3;
        int i2 = i;
        View view2 = view;
        Class cls = C78585u0.class;
        Class cls2 = C76979h.class;
        int i3 = this.f230153t;
        if (i2 < i3) {
            if (this.f230146j) {
                obj = getItem(i);
                z1Var = null;
            } else {
                z1Var = (C72996z1) getItem(i);
                obj = null;
            }
            c = 0;
        } else if (i2 != i3 || !this.f230156w) {
            int i4 = i3 + 1;
            if (i2 == i4 && this.f230155v) {
                z1Var = null;
                obj = null;
                c = 4;
            } else if ((i2 != i4 || !this.f230157x || this.f230155v) && (i2 != i3 + 2 || !this.f230157x || !this.f230155v)) {
                z1Var = null;
                obj = null;
                c = 2;
            } else {
                z1Var = null;
                obj = null;
                c = 5;
            }
        } else {
            z1Var = null;
            obj = null;
            c = 3;
        }
        if (view2 == null) {
            view2 = View.inflate(this.f230143g, C0966R.C0971layout.btx, (ViewGroup) null);
            bVar = mo108545b(view2);
        } else {
            bVar = (C78567b) view.getTag();
            if (bVar == null) {
                bVar = mo108545b(view2);
            }
        }
        if (f230133H == 4 || this.f230139F) {
            int dimensionPixelSize = this.f230143g.getResources().getDimensionPixelSize(C0966R.dimen.f3921j0);
            bVar.f230162a.getLayoutParams().height = dimensionPixelSize;
            bVar.f230162a.getLayoutParams().width = dimensionPixelSize;
        } else {
            int dimensionPixelSize2 = this.f230143g.getResources().getDimensionPixelSize(C0966R.dimen.f3919iy);
            bVar.f230162a.getLayoutParams().height = dimensionPixelSize2;
            bVar.f230162a.getLayoutParams().width = dimensionPixelSize2;
        }
        bVar.f230168g.setVisibility(8);
        bVar.f230166e.setVisibility(8);
        view2.setImportantForAccessibility(0);
        if (c == 0) {
            bVar.f230162a.setVisibility(0);
            if (this.f230145i) {
                if (!Util.isNullOrNil(z1Var.mo73969n2())) {
                    str3 = z1Var.mo73969n2();
                } else {
                    String username = z1Var.getUsername();
                    C44661m1 m1Var = this.f230149p;
                    str3 = m1Var == null ? null : m1Var.mo69789q2(username);
                }
                if (Util.isNullOrNil(str3)) {
                    str3 = z1Var.mo73969n2();
                }
                if (Util.isNullOrNil(str3)) {
                    str3 = z1Var.mo62909j3();
                }
                spannableString = ((C76979h) C86312j.m106911c(cls2)).yp0(this.f230143g, str3, bVar.f230164c.getTextSize());
            } else {
                spannableString = this.f230146j ? ((C76979h) C86312j.m106911c(cls2)).yp0(this.f230143g, ((C78585u0) C86312j.m106911c(cls)).Hj0(obj), bVar.f230164c.getTextSize()) : C72996z1.m85843n5(z1Var.getUsername()) ? ((C76158j) C86312j.m106911c(C76158j.class)).D30(MMApplicationContext.getContext(), z1Var.mo62898f(), z1Var.mo73980x2(), (int) bVar.f230164c.getTextSize()) : ((C76979h) C86312j.m106911c(cls2)).yp0(this.f230143g, z1Var.mo62898f(), bVar.f230164c.getTextSize());
            }
            if (spannableString instanceof SpannableString) {
                bVar.f230164c.setVisibility(8);
                bVar.f230165d.setVisibility(0);
                bVar.f230165d.setText(spannableString);
            } else {
                bVar.f230164c.setVisibility(0);
                bVar.f230165d.setVisibility(8);
                bVar.f230164c.setText(spannableString);
            }
            String a = C47806g.m53116a(z1Var);
            if (Util.isNullOrNil((CharSequence) a)) {
                a = C47806g.m53117b(z1Var);
            }
            if (TextUtils.isEmpty(a)) {
                bVar.f230166e.setVisibility(8);
            } else {
                bVar.f230166e.setVisibility(0);
                bVar.f230166e.setText(a);
            }
            bVar.f230162a.setContentDescription("");
            if (this.f230146j) {
                C20828a.m22825b().mo32519h(((C78585u0) C86312j.m106911c(cls)).mo73839gb(obj), bVar.f230162a, this.f230137D);
                bVar.f230162a.setBackgroundDrawable((Drawable) null);
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(bVar.f230162a, z1Var.getUsername());
                if (bVar.f230162a.getDrawable() instanceof C78399i.C78400a) {
                    C78399i.C78400a aVar = (C78399i.C78400a) bVar.f230162a.getDrawable();
                    C78399i iVar = this.f230154u;
                    if (iVar != null) {
                        iVar.f229724e.add(new WeakReference(aVar));
                    }
                }
                bVar.f230162a.setTagUsername(z1Var.getUsername());
                bVar.f230162a.setTagTalker(this.f230135B);
                if (C72996z1.m85807K5(this.f230135B)) {
                    bVar.f230162a.setTagScene(4);
                } else {
                    bVar.f230162a.setTagScene(3);
                }
            }
            if (this.f230146j) {
                if (!this.f230144h || ((str2 = this.f230136C) != null && str2.equals(((C78585u0) C86312j.m106911c(cls)).mo73841rv(obj)))) {
                    bVar.f230163b.setVisibility(8);
                } else {
                    bVar.f230163b.setVisibility(0);
                }
            } else if (!this.f230144h || ((str = this.f230136C) != null && str.equals(z1Var.getUsername()))) {
                bVar.f230163b.setVisibility(8);
            } else {
                bVar.f230163b.setVisibility(0);
            }
        } else if (c == 3) {
            bVar.f230164c.setVisibility(i2 == 0 ? 8 : 4);
            bVar.f230165d.setVisibility(i2 == 0 ? 8 : 4);
            bVar.f230163b.setVisibility(8);
            if (this.f230144h) {
                bVar.f230162a.setVisibility(4);
            } else {
                bVar.f230162a.setVisibility(0);
                if (this.f230146j) {
                    C20828a.m22825b().mo32519h("", bVar.f230162a, this.f230137D);
                    bVar.f230162a.setBackgroundDrawable((Drawable) null);
                }
                bVar.f230162a.setImageResource(C0966R.C0969drawable.f4552fu);
                bVar.f230162a.setContentDescription(this.f230143g.getString(C0966R.string.f7397f5));
            }
        } else if (c == 4) {
            bVar.f230164c.setVisibility(1 == i2 ? 8 : 4);
            bVar.f230165d.setVisibility(1 == i2 ? 8 : 4);
            bVar.f230163b.setVisibility(8);
            if (this.f230144h || this.f230153t == 0) {
                bVar.f230162a.setVisibility(4);
            } else {
                bVar.f230162a.setVisibility(0);
                if (this.f230146j) {
                    C20828a.m22825b().mo32519h("", bVar.f230162a, this.f230137D);
                    bVar.f230162a.setBackgroundDrawable((Drawable) null);
                }
                bVar.f230162a.setImageResource(C0966R.C0969drawable.f4553fv);
                bVar.f230162a.setContentDescription(this.f230143g.getString(C0966R.string.f360333by1));
            }
        } else if (c == 5) {
            bVar.f230164c.setVisibility(i2 == 0 ? 8 : 4);
            bVar.f230165d.setVisibility(i2 == 0 ? 8 : 4);
            bVar.f230163b.setVisibility(8);
            if (this.f230144h) {
                bVar.f230162a.setVisibility(4);
            } else {
                bVar.f230162a.setVisibility(0);
                if (this.f230146j) {
                    C20828a.m22825b().mo32519h("", bVar.f230162a, this.f230137D);
                    bVar.f230162a.setBackgroundDrawable((Drawable) null);
                }
                bVar.f230162a.setImageResource(C0966R.C0969drawable.f4554fw);
                bVar.f230162a.setContentDescription(this.f230143g.getString(C0966R.string.gvy));
            }
        } else if (c == 2) {
            if (this.f230146j) {
                C20828a.m22825b().mo32519h("", bVar.f230162a, this.f230137D);
            }
            bVar.f230164c.setVisibility(4);
            bVar.f230165d.setVisibility(4);
            bVar.f230163b.setVisibility(8);
            bVar.f230162a.setVisibility(4);
            bVar.f230162a.setImageResource(C0966R.C0969drawable.ags);
            bVar.f230162a.setBackgroundResource(C0966R.C0969drawable.ags);
            view2.setImportantForAccessibility(4);
        }
        if (!this.f230146j) {
            bVar.f230167f.setVisibility(8);
        } else if (obj == null) {
            bVar.f230167f.setVisibility(8);
        }
        return view2;
    }
}
