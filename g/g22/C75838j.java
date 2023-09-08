package g22;

import a22.C67001a;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.RecyclerView;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72955b2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import e22.C75529q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: g22.j */
public class C75838j extends RecyclerView.C16613e<C75529q0> implements C75845k {

    /* renamed from: A */
    public C75844f f222460A = null;

    /* renamed from: d */
    public boolean f222461d = true;

    /* renamed from: e */
    public ArrayList<C72955b2> f222462e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<String> f222463f = new ArrayList<>();

    /* renamed from: g */
    public List<String> f222464g = new LinkedList();

    /* renamed from: h */
    public Context f222465h;

    /* renamed from: i */
    public C75839a f222466i;

    /* renamed from: j */
    public C16665p f222467j;

    /* renamed from: n */
    public int f222468n = 0;

    /* renamed from: o */
    public int f222469o = 0;

    /* renamed from: p */
    public int f222470p = -1;

    /* renamed from: q */
    public int f222471q = -1;

    /* renamed from: r */
    public HashMap<Integer, Integer> f222472r = new HashMap<>();

    /* renamed from: s */
    public C72955b2 f222473s = new C72955b2();

    /* renamed from: t */
    public boolean f222474t = false;

    /* renamed from: u */
    public String f222475u = MMApplicationContext.getString(C0966R.string.mx7);

    /* renamed from: v */
    public View.OnTouchListener f222476v = null;

    /* renamed from: w */
    public boolean f222477w = false;

    /* renamed from: x */
    public boolean f222478x = false;

    /* renamed from: y */
    public long f222479y;

    /* renamed from: z */
    public boolean f222480z = true;

    /* renamed from: g22.j$a */
    public static class C75839a extends C72955b2 {

        /* renamed from: B */
        public List<String> f222481B;

        /* renamed from: C */
        public int f222482C;
    }

    /* renamed from: g22.j$b */
    public class C75840b extends C75529q0 {

        /* renamed from: G */
        public View f222483G;

        public C75840b(C75838j jVar, View view) {
            super(view);
            this.f222483G = view.findViewById(C0966R.C0970id.fhc);
        }
    }

    /* renamed from: g22.j$c */
    public class C75841c extends C75529q0 {

        /* renamed from: G */
        public View f222484G;

        public C75841c(C75838j jVar, View view) {
            super(view);
            this.f222484G = view.findViewById(C0966R.C0970id.hh9);
        }
    }

    /* renamed from: g22.j$d */
    public class C75842d extends C75529q0 {
        public C75842d(C75838j jVar, View view) {
            super(view, 0);
        }
    }

    /* renamed from: g22.j$e */
    public class C75843e extends C75529q0 {
        public C75843e(C75838j jVar, View view) {
            super(view);
        }
    }

    /* renamed from: g22.j$f */
    public interface C75844f {
        /* renamed from: W */
        void mo95116W(View view, int i);

        /* renamed from: a */
        void mo95117a(Intent intent);

        /* renamed from: b */
        void mo95118b(C75529q0 q0Var, int i);
    }

    public C75838j(Context context) {
        this.f222465h = context;
        C72955b2 b2Var = this.f222473s;
        b2Var.field_labelID = -2000000;
        b2Var.field_isTemporary = true;
    }

    /* renamed from: F4 */
    public C72955b2 mo106121F4(int i) {
        ArrayList<C72955b2> arrayList = this.f222462e;
        if (arrayList == null || i > arrayList.size()) {
            return null;
        }
        return this.f222462e.get(i);
    }

    /* renamed from: G4 */
    public void mo106122G4() {
        if (this.f222460A != null) {
            Intent intent = new Intent(this.f222465h, LabelSearchUI.class);
            int i = this.f222468n;
            if (i == 1 || i == 3) {
                intent.putExtra("edit_mode_state", 1);
            } else {
                intent.putExtra("edit_mode_state", 0);
            }
            intent.putExtra("contact_has_choose_label_list", Util.listToString(this.f222463f, ","));
            if (this.f222468n == 3) {
                intent.putExtra("contact_search_label_need_toast_after_choose", false);
                intent.putExtra("contact_search_label_enable_choose_empty_label", false);
                intent.putExtra("contact_search_label_choose_duplicate", true);
                intent.putExtra("contact_search_label_show_member_count", true);
            }
            this.f222460A.mo95117a(intent);
            Log.m105925i("MicroMsg.LabelAdapter", "gotoSearchPage: showSelectStatus:%d", Integer.valueOf(this.f222468n));
        }
    }

    /* renamed from: O4 */
    public void mo106123O4() {
        Log.m105924i("MicroMsg.LabelAdapter", "resetStatus: ");
        ArrayList<String> arrayList = this.f222463f;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f222469o = 0;
        this.f222470p = -1;
    }

    /* renamed from: a3 */
    public void mo105849a3() {
    }

    /* renamed from: e */
    public void mo105850e() {
    }

    public int getItemCount() {
        ArrayList<C72955b2> arrayList = this.f222462e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        C72955b2 b2Var = this.f222462e.get(i);
        if (b2Var != null && b2Var.field_labelID == -1000000) {
            return 2;
        }
        if (b2Var != null && b2Var.field_labelID == -2000000) {
            return 3;
        }
        if (b2Var != null && b2Var.field_labelID == -3000000) {
            return 4;
        }
        HashMap<Integer, Integer> hashMap = this.f222472r;
        return (hashMap == null || !hashMap.containsKey(Integer.valueOf(b2Var.field_labelID)) || this.f222472r.get(Integer.valueOf(b2Var.field_labelID)).intValue() <= 0) ? 1 : 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        HashMap<Integer, Integer> hashMap;
        int i2 = i;
        C75529q0 q0Var = (C75529q0) zVar;
        Class cls = C75700k0.class;
        int itemViewType = getItemViewType(i2);
        C72955b2 F4 = mo106121F4(i2);
        if (itemViewType == 3 && (q0Var instanceof C75840b)) {
            if (this.f222468n == 1) {
                View view = ((C75840b) q0Var).f222483G;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/label/ui/ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/label/ui/ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = ((C75840b) q0Var).f222483G;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/label/ui/ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/label/ui/ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((C75840b) q0Var).f222483G.setOnClickListener(new C75832d(this));
        } else if (itemViewType != 4) {
            Context context = this.f222465h;
            q0Var.f221915z.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(context, F4.field_labelName, C76577a.m92157h(context, C0966R.dimen.f3927j7)));
            q0Var.f221910B.setOnClickListener(new C75833e(this, q0Var, i2));
            if (this.f222468n != 1) {
                q0Var.f221910B.setLongClickable(true);
                q0Var.f221910B.setOnLongClickListener(new C75834f(this, q0Var, i2));
            }
            if (itemViewType == 0 || itemViewType == 1) {
                q0Var.f221910B.setOnTouchListener(new C75835g(this, i2, q0Var));
            }
            int i3 = this.f222468n;
            if (i3 == 2 || i3 == 1 || i3 == 3) {
                if (1 == i3) {
                    WeImageView weImageView = q0Var.f221912D;
                    Context context2 = this.f222465h;
                    weImageView.setImageDrawable(C74933u4.m89768e(context2, C0966R.raw.icons_outlined_drag, C76577a.m92153d(context2, this.f222461d ? C0966R.color.FG_2 : C0966R.color.FG_3)));
                    q0Var.f221912D.setIconColor(this.f222465h.getResources().getColor(this.f222461d ? C0966R.color.FG_2 : C0966R.color.FG_3));
                    q0Var.f221912D.setContentDescription(this.f222465h.getString(C0966R.string.g1s));
                } else {
                    WeImageView weImageView2 = q0Var.f221912D;
                    Context context3 = this.f222465h;
                    weImageView2.setImageDrawable(C74933u4.m89768e(context3, C0966R.raw.sns_label_more_btn, context3.getResources().getColor(C0966R.color.BW_50)));
                    q0Var.f221912D.setIconColor(this.f222465h.getResources().getColor(C0966R.color.FG_4));
                }
                q0Var.f221912D.setVisibility(0);
                int i4 = this.f222468n;
                if (i4 == 1 && (itemViewType == 0 || itemViewType == 1)) {
                    q0Var.f221911C.setVisibility(0);
                } else if (i4 == 2 || i4 == 3) {
                    q0Var.f221911C.setVisibility(0);
                } else {
                    q0Var.f221911C.setVisibility(8);
                }
                int i5 = this.f222468n;
                if (2 == i5) {
                    q0Var.f221912D.setOnClickListener(new C75836h(this, F4));
                } else if (3 == i5) {
                    q0Var.f221912D.setOnClickListener(new C75837i(this, F4));
                }
            } else {
                q0Var.f221912D.setVisibility(8);
                q0Var.f221911C.setVisibility(8);
            }
            HashMap<Integer, Integer> hashMap2 = this.f222472r;
            if (hashMap2 == null || !hashMap2.containsKey(Integer.valueOf(F4.field_labelID))) {
                q0Var.f221909A.setVisibility(0);
                q0Var.f221909A.setText("(0)");
            } else {
                q0Var.f221909A.setVisibility(0);
                TextView textView = q0Var.f221909A;
                textView.setText("(" + this.f222472r.get(Integer.valueOf(F4.field_labelID)) + ")");
            }
            List list = null;
            if (this.f222468n == 1 || (hashMap = this.f222472r) == null || !hashMap.containsKey(Integer.valueOf(F4.field_labelID))) {
                TextView textView2 = q0Var.f221913E;
                if (textView2 != null) {
                    if (this.f222468n == 1) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setVisibility(4);
                    }
                }
            } else {
                TextView textView3 = q0Var.f221913E;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    if (itemViewType != 2) {
                        list = ((C67001a) C28250a.m38138a()).mo90973k(String.valueOf(F4.field_labelID));
                    }
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            C86709a0.m107528h();
                            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get((String) list.get(i6));
                            if (!Util.isNullOrNil(z1Var.mo73974r2())) {
                                String r2 = z1Var.mo73974r2();
                                if (r2.contains("" + F4.field_labelID)) {
                                    if (!TextUtils.isEmpty(z1Var.getNickname())) {
                                        arrayList.add(z1Var.getNickname());
                                    } else {
                                        arrayList.add(z1Var.mo62913l2());
                                    }
                                }
                            }
                            if (i6 > 10) {
                                break;
                            }
                        }
                        q0Var.f221913E.setText(Util.listToString(arrayList, this.f222475u));
                    }
                }
            }
            if (itemViewType == 2) {
                C75841c cVar = (C75841c) q0Var;
                View view5 = cVar.f221910B;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/label/ui/ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/label/ui/ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (cVar.f222484G != null) {
                    if (getItemCount() <= 1) {
                        View view7 = cVar.f222484G;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(8);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/label/ui/ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/label/ui/ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View view9 = cVar.f222484G;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(0);
                        View view10 = view9;
                        C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/label/ui/ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view10, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/label/ui/ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                q0Var.f221909A.setVisibility(0);
                TextView textView4 = q0Var.f221913E;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                C75839a aVar6 = (C75839a) F4;
                List<String> list2 = aVar6.f222481B;
                if (aVar6.f222482C > 0) {
                    TextView textView5 = q0Var.f221909A;
                    textView5.setText("(" + aVar6.f222482C + ")");
                } else {
                    q0Var.f221909A.setText("(0)");
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < list2.size(); i7++) {
                    C86709a0.m107528h();
                    arrayList2.add(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(list2.get(i7)).getNickname());
                    if (i7 > 10) {
                        break;
                    }
                }
                q0Var.f221913E.setText(Util.listToString(arrayList2, this.f222475u));
                q0Var.f221912D.setVisibility(8);
                q0Var.f221911C.setVisibility(8);
            }
            if (itemViewType == 0) {
                ViewGroup.LayoutParams layoutParams = q0Var.f221910B.getLayoutParams();
                if (this.f222468n == 1) {
                    layoutParams.height = (int) this.f222465h.getResources().getDimension(C0966R.dimen.aco);
                } else {
                    layoutParams.height = (int) this.f222465h.getResources().getDimension(C0966R.dimen.acp);
                }
                q0Var.f221910B.setLayoutParams(layoutParams);
            }
            CheckBox checkBox = q0Var.f221911C;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                q0Var.f221911C.setChecked(this.f222463f.contains(String.valueOf(F4.field_labelID)));
                if (!this.f222474t) {
                    q0Var.f221911C.setEnabled(true);
                } else if (q0Var.f221911C.isChecked()) {
                    q0Var.f221911C.setEnabled(true);
                } else {
                    q0Var.f221911C.setEnabled(false);
                }
            }
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 3) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6358cn, viewGroup, false);
            C75840b bVar = new C75840b(this, inflate);
            inflate.setTag(bVar);
            return bVar;
        } else if (i == 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7083xp, viewGroup, false);
            C75841c cVar = new C75841c(this, inflate2);
            inflate2.setTag(cVar);
            return cVar;
        } else if (i == 0) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7082xo, viewGroup, false);
            C75529q0 q0Var = new C75529q0(inflate3);
            inflate3.setTag(q0Var);
            return q0Var;
        } else if (i == 1) {
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7084xq, viewGroup, false);
            C75843e eVar = new C75843e(this, inflate4);
            inflate4.setTag(eVar);
            return eVar;
        } else if (i != 4) {
            return null;
        } else {
            View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d1e, viewGroup, false);
            C75842d dVar = new C75842d(this, inflate5);
            inflate5.setTag(dVar);
            return dVar;
        }
    }
}
