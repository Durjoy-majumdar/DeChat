package hg0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lj3.C46863b;
import p196ln.C76705f;
import p196ln.C76708i;
import p823sg.C90193h;
import te3.C49174do2;

/* renamed from: hg0.q */
public class C76176q extends BaseAdapter {

    /* renamed from: d */
    public Context f223189d;

    /* renamed from: e */
    public LinkedList<C49174do2> f223190e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C49174do2> f223191f = new LinkedList<>();

    /* renamed from: g */
    public List<String[]> f223192g;

    /* renamed from: h */
    public List<String[]> f223193h = new LinkedList();

    /* renamed from: i */
    public int[] f223194i;

    /* renamed from: j */
    public int f223195j = 1;

    /* renamed from: n */
    public C76182f f223196n;

    /* renamed from: o */
    public C46863b f223197o = new C46863b(15, new C76177a(this));

    /* renamed from: p */
    public C46863b.C46867d f223198p = null;

    /* renamed from: hg0.q$a */
    public class C76177a implements C46863b.C46866c {
        public C76177a(C76176q qVar) {
        }

        /* renamed from: a */
        public Bitmap mo63515a(String str) {
            return ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
        }
    }

    /* renamed from: hg0.q$b */
    public class C76178b implements C46863b.C46867d {
        public C76178b() {
        }

        /* renamed from: a */
        public int mo63517a() {
            return C76176q.this.getCount();
        }

        /* renamed from: b */
        public String mo63518b(int i) {
            if (i < 0 || i >= C76176q.this.getCount()) {
                Log.m105920e("MicroMsg.FriendAdapter", "pos is invalid");
                return null;
            }
            C49174do2 do22 = C76176q.this.f223190e.get(i);
            if (do22 == null) {
                return null;
            }
            return do22.f132451e;
        }
    }

    /* renamed from: hg0.q$c */
    public class C76179c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f223200d;

        public C76179c(int i) {
            this.f223200d = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/model/FriendAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76176q qVar = C76176q.this;
            int i = this.f223200d;
            int i2 = qVar.f223195j;
            if (i2 == 1) {
                qVar.f223194i[i] = 0;
            } else if (i2 == 2) {
                qVar.f223194i[i] = 0;
            }
            qVar.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/model/FriendAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hg0.q$d */
    public class C76180d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f223202d;

        public C76180d(int i) {
            this.f223202d = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/model/FriendAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76176q qVar = C76176q.this;
            int i = this.f223202d;
            int i2 = qVar.f223195j;
            if (i2 == 1) {
                qVar.f223194i[i] = 1;
            } else if (i2 == 2) {
                qVar.f223194i[i] = 2;
            }
            qVar.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/model/FriendAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hg0.q$e */
    public class C76181e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f223204d;

        public C76181e(int i) {
            this.f223204d = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/model/FriendAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76176q qVar = C76176q.this;
            int i = this.f223204d;
            int i2 = qVar.f223195j;
            if (i2 == 1) {
                qVar.f223194i[i] = 1;
            } else if (i2 == 2) {
                qVar.f223194i[i] = 2;
            }
            qVar.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/model/FriendAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hg0.q$f */
    public interface C76182f {
        void notifyDataSetChanged();
    }

    /* renamed from: hg0.q$g */
    public static class C76183g {

        /* renamed from: a */
        public ImageView f223206a;

        /* renamed from: b */
        public TextView f223207b;

        /* renamed from: c */
        public TextView f223208c;

        /* renamed from: d */
        public Button f223209d;

        /* renamed from: e */
        public Button f223210e;

        /* renamed from: f */
        public TextView f223211f;

        /* renamed from: g */
        public TextView f223212g;
    }

    public C76176q(Context context, C76182f fVar, int i) {
        this.f223189d = context;
        this.f223195j = i;
        this.f223196n = fVar;
        this.f223194i = new int[this.f223190e.size()];
    }

    /* renamed from: a */
    public final void mo106432a(C49174do2 do22, String[] strArr) {
        String str;
        Iterator<C49174do2> it = this.f223191f.iterator();
        while (it.hasNext()) {
            String str2 = it.next().f132450d;
            if (str2 != null && (str = do22.f132450d) != null && str2.equals(str)) {
                Log.m105918d("MicroMsg.FriendAdapter", "tigerreg mobile already added");
                return;
            }
        }
        this.f223191f.add(do22);
        ((LinkedList) this.f223193h).add(new String[]{strArr[2], strArr[1]});
    }

    /* renamed from: b */
    public int mo106433b() {
        int i = 0;
        for (int i2 : this.f223194i) {
            int i3 = this.f223195j;
            if (i3 != 1) {
                if (i3 == 2) {
                    if (i2 != 2) {
                    }
                }
            } else if (i2 != 1) {
            }
            i++;
        }
        return i;
    }

    /* renamed from: d */
    public boolean mo106434d() {
        int[] iArr = this.f223194i;
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = this.f223194i;
            if (i >= iArr2.length) {
                return true;
            }
            int i2 = iArr2[i];
            int i3 = this.f223195j;
            if (i3 == 1) {
                if (i2 == 0) {
                    return false;
                }
            } else if (i3 == 2 && i2 == 0) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: f */
    public void mo106435f(boolean z) {
        int i = this.f223195j;
        int i2 = 0;
        if (i == 1) {
            while (true) {
                int[] iArr = this.f223194i;
                if (i2 >= iArr.length) {
                    break;
                }
                iArr[i2] = z;
                i2++;
            }
        } else if (i == 2) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f223194i;
                if (i3 >= iArr2.length) {
                    break;
                }
                iArr2[i3] = z != 0 ? 2 : 0;
                i3++;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: g */
    public void mo106436g(LinkedList<C49174do2> linkedList) {
        if (linkedList != null) {
            this.f223191f.clear();
            this.f223190e.clear();
            ((LinkedList) this.f223193h).clear();
            for (String[] next : this.f223192g) {
                Iterator<C49174do2> it = linkedList.iterator();
                while (it.hasNext()) {
                    C49174do2 next2 = it.next();
                    int i = this.f223195j;
                    if (i == 1) {
                        int i2 = next2.f132452f;
                        if ((i2 == 1 || i2 == 0) && !Util.isNullOrNil(next[2]) && next2.f132450d.equals(C90193h.m112878f(next[2].getBytes()))) {
                            mo106432a(next2, next);
                        }
                    } else if (i == 2 && next2.f132452f == 2 && !Util.isNullOrNil(next[2]) && next2.f132450d.equals(C90193h.m112878f(next[2].getBytes()))) {
                        mo106432a(next2, next);
                    }
                }
            }
        }
        this.f223194i = new int[this.f223191f.size()];
        this.f223190e.addAll(this.f223191f);
        this.f223191f.clear();
    }

    public int getCount() {
        return this.f223190e.size();
    }

    public Object getItem(int i) {
        return this.f223190e.get(i);
    }

    public long getItemId(int i) {
        return (long) this.f223190e.get(i).hashCode();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C76183g gVar;
        if (this.f223195j == 1) {
            if (this.f223198p == null) {
                this.f223198p = new C76178b();
            }
            C46863b bVar = this.f223197o;
            if (bVar != null) {
                bVar.mo72072b(i, this.f223198p);
            }
        }
        C49174do2 do22 = this.f223190e.get(i);
        if (view == null) {
            gVar = new C76183g();
            int i2 = this.f223195j;
            if (i2 == 1) {
                view = View.inflate(this.f223189d, C0966R.C0971layout.a8b, (ViewGroup) null);
                gVar.f223207b = (TextView) view.findViewById(C0966R.C0970id.f358757gw2);
                gVar.f223208c = (TextView) view.findViewById(C0966R.C0970id.gvv);
                gVar.f223209d = (Button) view.findViewById(C0966R.C0970id.gvw);
                gVar.f223210e = (Button) view.findViewById(C0966R.C0970id.gvy);
                gVar.f223206a = (ImageView) view.findViewById(C0966R.C0970id.ef9);
                gVar.f223211f = (TextView) view.findViewById(C0966R.C0970id.f358758gw3);
                gVar.f223212g = (TextView) view.findViewById(C0966R.C0970id.gw6);
                view.setTag(gVar);
            } else if (i2 == 2) {
                view = View.inflate(this.f223189d, C0966R.C0971layout.a8c, (ViewGroup) null);
                gVar.f223207b = (TextView) view.findViewById(C0966R.C0970id.f358757gw2);
                gVar.f223208c = (TextView) view.findViewById(C0966R.C0970id.gvv);
                gVar.f223209d = (Button) view.findViewById(C0966R.C0970id.gvw);
                gVar.f223210e = (Button) view.findViewById(C0966R.C0970id.gvy);
                gVar.f223211f = (TextView) view.findViewById(C0966R.C0970id.f358758gw3);
                gVar.f223212g = (TextView) view.findViewById(C0966R.C0970id.gw6);
                view.setTag(gVar);
            }
        } else {
            gVar = (C76183g) view.getTag();
        }
        gVar.f223212g.setOnClickListener(new C76179c(i));
        int i3 = this.f223195j;
        if (i3 == 1) {
            if (!Util.isNullOrNil(((String[]) ((LinkedList) this.f223193h).get(i))[1])) {
                gVar.f223207b.setText(((String[]) ((LinkedList) this.f223193h).get(i))[1]);
            } else if (Util.isNullOrNil(do22.f132455i)) {
                gVar.f223207b.setText(do22.f132451e);
            } else {
                gVar.f223207b.setText(do22.f132455i);
            }
            gVar.f223209d.setOnClickListener(new C76180d(i));
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(gVar.f223206a, do22.f132451e);
        } else if (i3 == 2) {
            gVar.f223207b.setText(((String[]) ((LinkedList) this.f223193h).get(i))[1]);
            gVar.f223210e.setOnClickListener(new C76181e(i));
        }
        int i4 = this.f223194i[i];
        if (i4 == 0) {
            int i5 = this.f223195j;
            if (i5 == 1) {
                gVar.f223208c.setVisibility(8);
                gVar.f223209d.setVisibility(0);
                gVar.f223210e.setVisibility(8);
                gVar.f223211f.setVisibility(8);
                gVar.f223212g.setVisibility(8);
            } else if (i5 == 2) {
                gVar.f223208c.setVisibility(8);
                gVar.f223209d.setVisibility(8);
                gVar.f223210e.setVisibility(0);
                gVar.f223211f.setVisibility(8);
                gVar.f223212g.setVisibility(8);
            }
        } else if (i4 == 1) {
            gVar.f223209d.setVisibility(8);
            gVar.f223208c.setVisibility(0);
            gVar.f223211f.setVisibility(0);
            gVar.f223212g.setVisibility(0);
        } else if (i4 == 2) {
            gVar.f223209d.setVisibility(8);
            gVar.f223210e.setVisibility(8);
            gVar.f223208c.setVisibility(0);
            gVar.f223211f.setVisibility(0);
            gVar.f223212g.setVisibility(0);
        } else if (i4 == 3) {
            gVar.f223209d.setVisibility(8);
            gVar.f223208c.setVisibility(0);
            gVar.f223211f.setVisibility(0);
            gVar.f223212g.setVisibility(0);
        }
        return view;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        C76182f fVar = this.f223196n;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }
}
