package p1123ii;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.chatroom.p015ui.C104608i2;
import com.tencent.p014mm.chatroom.p015ui.SelectDateUI;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import p203mi.C109628a;

/* renamed from: ii.b */
public class C108464b extends RecyclerView.C16613e<C108466b> implements C104608i2.C104610b {

    /* renamed from: d */
    public final TypedArray f324782d;

    /* renamed from: e */
    public final Context f324783e;

    /* renamed from: f */
    public final C108463a f324784f;

    /* renamed from: g */
    public final Calendar f324785g;

    /* renamed from: h */
    public final C108465a<C109628a> f324786h;

    /* renamed from: i */
    public final Collection<C109628a> f324787i;

    /* renamed from: j */
    public final Integer f324788j;

    /* renamed from: n */
    public final Integer f324789n;

    /* renamed from: o */
    public final boolean f324790o;

    /* renamed from: ii.b$a */
    public static class C108465a<K> implements Serializable {

        /* renamed from: d */
        public K f324791d;

        /* renamed from: e */
        public K f324792e;
    }

    /* renamed from: ii.b$b */
    public static class C108466b extends RecyclerView.C16631z {

        /* renamed from: z */
        public final C104608i2 f324793z;

        public C108466b(View view, C104608i2.C104610b bVar) {
            super(view);
            C104608i2 i2Var = (C104608i2) view;
            this.f324793z = i2Var;
            i2Var.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            i2Var.setClickable(true);
            i2Var.setOnDayClickListener(bVar);
        }
    }

    public C108464b(Context context, C108463a aVar, TypedArray typedArray, long j, Collection<C109628a> collection) {
        this.f324782d = typedArray;
        Calendar instance = Calendar.getInstance();
        this.f324785g = instance;
        this.f324789n = Integer.valueOf(typedArray.getInt(15, instance.get(2) % 12));
        if (-1 != j) {
            instance.setTimeInMillis(j);
        }
        this.f324788j = Integer.valueOf(typedArray.getInt(13, instance.get(2)));
        this.f324790o = typedArray.getBoolean(16, false);
        this.f324786h = new C108465a<>();
        this.f324787i = collection;
        this.f324783e = context;
        this.f324784f = aVar;
        if (typedArray.getBoolean(10, false)) {
            mo159009F4(new C109628a(System.currentTimeMillis()));
        }
    }

    /* renamed from: F4 */
    public void mo159009F4(C109628a aVar) {
        ((SelectDateUI) this.f324784f).mo148174H7(aVar);
        if (this.f324790o) {
            C108465a<C109628a> aVar2 = this.f324786h;
            K k = aVar2.f324791d;
            if (k != null && aVar2.f324792e == null) {
                aVar2.f324792e = aVar;
                if (((C109628a) k).f328200c < aVar.f328200c) {
                    for (int i = 0; i < (((C109628a) this.f324786h.f324791d).f328200c - aVar.f328200c) - 1; i++) {
                        ((SelectDateUI) this.f324784f).mo148174H7(aVar);
                    }
                }
                this.f324784f.getClass();
            } else if (aVar2.f324792e != null) {
                aVar2.f324791d = aVar;
                aVar2.f324792e = null;
            } else {
                aVar2.f324791d = aVar;
            }
        } else {
            this.f324786h.f324791d = aVar;
        }
        notifyDataSetChanged();
    }

    public int getItemCount() {
        ((SelectDateUI) this.f324784f).getClass();
        int i = ((new C109628a(System.currentTimeMillis()).f328201d - this.f324785g.get(1)) + 1) * 12;
        if (this.f324788j.intValue() != -1) {
            i -= this.f324788j.intValue();
        }
        return this.f324789n.intValue() != -1 ? i - ((12 - this.f324789n.intValue()) - 1) : i;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C104608i2 i2Var = ((C108466b) zVar).f324793z;
        HashMap hashMap = new HashMap();
        int i7 = i % 12;
        int intValue = (this.f324788j.intValue() + i7) % 12;
        int intValue2 = (i / 12) + this.f324785g.get(1) + ((this.f324788j.intValue() + i7) / 12);
        C108465a<C109628a> aVar = this.f324786h;
        K k = aVar.f324791d;
        int i8 = -1;
        if (k != null) {
            C109628a aVar2 = (C109628a) k;
            i3 = aVar2.f328199b;
            i2 = aVar2.f328200c;
            i4 = aVar2.f328201d;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = -1;
        }
        K k2 = aVar.f324792e;
        if (k2 != null) {
            C109628a aVar3 = (C109628a) k2;
            int i9 = aVar3.f328199b;
            i5 = aVar3.f328200c;
            int i15 = i9;
            i8 = aVar3.f328201d;
            i6 = i15;
        } else {
            i6 = -1;
            i5 = -1;
        }
        i2Var.f310610R = 6;
        i2Var.requestLayout();
        hashMap.put("selected_begin_year", Integer.valueOf(i4));
        hashMap.put("selected_last_year", Integer.valueOf(i8));
        hashMap.put("selected_begin_month", Integer.valueOf(i2));
        hashMap.put("selected_last_month", Integer.valueOf(i5));
        hashMap.put("selected_begin_day", Integer.valueOf(i3));
        hashMap.put("selected_last_day", Integer.valueOf(i6));
        hashMap.put("year", Integer.valueOf(intValue2));
        hashMap.put("month", Integer.valueOf(intValue));
        hashMap.put("week_start", Integer.valueOf(this.f324785g.getFirstDayOfWeek()));
        i2Var.setMarkDate(this.f324787i);
        i2Var.setMonthParams(hashMap);
        i2Var.invalidate();
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C108466b(new C104608i2(this.f324783e, this.f324782d), this);
    }
}
