package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.p136ui.base.RealAlphabetScrollBar;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1805j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C45759r0;
import f62.C75700k0;
import g62.C32330n;
import g62.C75880o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jr2.C99019x;
import k20.C60958c;
import k20.C9556a;
import lu3.C88654b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import os2.C11766m0;
import p154fy.C87121j;
import p196ln.C76705f;
import p629ny.C76979h;
import p910lj.C76701a;
import qo3.C77407n;
import qo3.C89779i0;
import sf0.C48374j0;
import tc0.C48623d;
import te3.C48684a93;
import te3.C48825b93;
import te3.C50482n20;
import te3.C51163rv3;
import tm2.C14049d;
import xm2.C78858a0;
import xm2.C78865x;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI */
public class UnfamiliarContactDetailUI extends MMActivity implements C11385n {

    /* renamed from: B */
    public static final String f205859B = new String(Character.toChars(123));

    /* renamed from: A */
    public C89779i0 f205860A = null;

    /* renamed from: d */
    public boolean f205861d;

    /* renamed from: e */
    public boolean f205862e;

    /* renamed from: f */
    public boolean f205863f;

    /* renamed from: g */
    public RecyclerView f205864g;

    /* renamed from: h */
    public TextView f205865h;

    /* renamed from: i */
    public View f205866i;

    /* renamed from: j */
    public View f205867j;

    /* renamed from: n */
    public View f205868n;

    /* renamed from: o */
    public View f205869o;

    /* renamed from: p */
    public TextView f205870p;

    /* renamed from: q */
    public C71124h f205871q;

    /* renamed from: r */
    public HashMap<String, Integer> f205872r = new HashMap<>();

    /* renamed from: s */
    public HashMap<Integer, String> f205873s = new HashMap<>();

    /* renamed from: t */
    public ArrayList<C71125i> f205874t = new ArrayList<>();

    /* renamed from: u */
    public HashSet<Integer> f205875u = new HashSet<>();

    /* renamed from: v */
    public C71129k f205876v;

    /* renamed from: w */
    public int f205877w = -1;

    /* renamed from: x */
    public HashSet<String> f205878x = new HashSet<>();

    /* renamed from: y */
    public C78858a0 f205879y;

    /* renamed from: z */
    public boolean f205880z;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$l */
    public enum C42980l {
        OVER_ONE_MIN,
        NORMAL
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$o */
    public interface C42981o {
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$a */
    public class C71113a implements MenuItem.OnMenuItemClickListener {
        public C71113a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            UnfamiliarContactDetailUI unfamiliarContactDetailUI = UnfamiliarContactDetailUI.this;
            unfamiliarContactDetailUI.f205880z = !unfamiliarContactDetailUI.f205880z;
            unfamiliarContactDetailUI.f205875u.clear();
            UnfamiliarContactDetailUI unfamiliarContactDetailUI2 = UnfamiliarContactDetailUI.this;
            UnfamiliarContactDetailUI.m83583H7(unfamiliarContactDetailUI2, unfamiliarContactDetailUI2.f205880z);
            UnfamiliarContactDetailUI unfamiliarContactDetailUI3 = UnfamiliarContactDetailUI.this;
            if (unfamiliarContactDetailUI3.f205880z) {
                unfamiliarContactDetailUI3.f205867j.setEnabled(false);
                UnfamiliarContactDetailUI.this.f205868n.setEnabled(false);
                UnfamiliarContactDetailUI unfamiliarContactDetailUI4 = UnfamiliarContactDetailUI.this;
                unfamiliarContactDetailUI4.updateOptionMenuText(1, unfamiliarContactDetailUI4.getString(C0966R.string.k6g));
            } else {
                unfamiliarContactDetailUI3.updateOptionMenuText(1, unfamiliarContactDetailUI3.getString(C0966R.string.k6m));
            }
            C71124h hVar = UnfamiliarContactDetailUI.this.f205871q;
            if (hVar != null) {
                hVar.notifyDataSetChanged();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$b */
    public class C71114b implements MenuItem.OnMenuItemClickListener {
        public C71114b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            UnfamiliarContactDetailUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$c */
    public class C71115c implements C71132n {
        public C71115c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$d */
    public class C71116d implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$d$a */
        public class C71117a implements DialogInterface.OnClickListener {
            public C71117a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                if (UnfamiliarContactDetailUI.this.f205876v != null) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(C1805j.CTRL_INDEX, UnfamiliarContactDetailUI.this.f205876v);
                    C71129k kVar = UnfamiliarContactDetailUI.this.f205876v;
                    kVar.f205912i = 0;
                    kVar.f205910g = 0;
                    kVar.f205911h = 0;
                    kVar.f205913j.clear();
                    kVar.f205914n.clear();
                    kVar.mo97819a();
                    C71132n nVar = kVar.f205908e;
                    if (nVar != null) {
                        UnfamiliarContactDetailUI unfamiliarContactDetailUI = UnfamiliarContactDetailUI.this;
                        String str = UnfamiliarContactDetailUI.f205859B;
                        unfamiliarContactDetailUI.mo97808J7(true);
                    }
                    ((C119157j) C119157j.f356862d).mo183875f(kVar);
                }
                UnfamiliarContactDetailUI.m83583H7(UnfamiliarContactDetailUI.this, false);
            }
        }

        public C71116d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76879j.m92718L(UnfamiliarContactDetailUI.this.getContext(), true, UnfamiliarContactDetailUI.this.getContext().getString(C0966R.string.k6p), UnfamiliarContactDetailUI.this.getContext().getString(C0966R.string.blq), UnfamiliarContactDetailUI.this.getContext().getString(C0966R.string.f7944x1), UnfamiliarContactDetailUI.this.getContext().getString(C0966R.string.f7926wf), new C71117a(), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$e */
    public class C71118e implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$e$a */
        public class C71119a implements C11182m0 {
            public C71119a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107159q(0, UnfamiliarContactDetailUI.this.getString(C0966R.string.h_1), UnfamiliarContactDetailUI.this.getString(C0966R.string.io4), UnfamiliarContactDetailUI.this.getResources().getDrawable(C0966R.raw.circle_notreceive), false);
                e0Var.mo107159q(1, UnfamiliarContactDetailUI.this.getString(C0966R.string.h_3), UnfamiliarContactDetailUI.this.getString(C0966R.string.io4), UnfamiliarContactDetailUI.this.getResources().getDrawable(C0966R.raw.circle_notvisible), false);
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$e$b */
        public class C71120b implements C11184p0 {
            public C71120b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123470p(C1805j.CTRL_INDEX, UnfamiliarContactDetailUI.this.f205876v);
                UnfamiliarContactDetailUI unfamiliarContactDetailUI = UnfamiliarContactDetailUI.this;
                HashSet<Integer> hashSet = unfamiliarContactDetailUI.f205875u;
                unfamiliarContactDetailUI.mo97808J7(true);
                if (i == 0) {
                    C71131m.f205920d += hashSet.size();
                } else if (i == 1) {
                    C71131m.f205919c += hashSet.size();
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C71138b4(unfamiliarContactDetailUI, hashSet, i));
                UnfamiliarContactDetailUI.m83583H7(UnfamiliarContactDetailUI.this, false);
                C71124h hVar = UnfamiliarContactDetailUI.this.f205871q;
                if (hVar != null) {
                    hVar.notifyDataSetChanged();
                }
            }
        }

        public C71118e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77407n nVar = new C77407n((Context) UnfamiliarContactDetailUI.this, 1, false);
            nVar.f225771i = new C71119a();
            nVar.f225782p = new C71120b();
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$f */
    public class C71121f implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$f$a */
        public class C71122a implements Runnable {
            public C71122a() {
            }

            public void run() {
                UnfamiliarContactDetailUI.this.f205871q.notifyDataSetChanged();
            }
        }

        public C71121f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckBox checkBox = (CheckBox) UnfamiliarContactDetailUI.this.f205869o.findViewById(C0966R.C0970id.bab);
            checkBox.setChecked(!checkBox.isChecked());
            if (checkBox.isChecked()) {
                for (int i = 0; i < UnfamiliarContactDetailUI.this.f205874t.size(); i++) {
                    UnfamiliarContactDetailUI.this.f205875u.add(Integer.valueOf(i));
                }
            } else {
                UnfamiliarContactDetailUI.this.f205875u.clear();
            }
            if (UnfamiliarContactDetailUI.this.f205875u.size() > 0) {
                UnfamiliarContactDetailUI.this.f205868n.setEnabled(true);
                UnfamiliarContactDetailUI.this.f205867j.setEnabled(true);
            } else {
                UnfamiliarContactDetailUI.this.f205868n.setEnabled(false);
                UnfamiliarContactDetailUI.this.f205867j.setEnabled(false);
            }
            UnfamiliarContactDetailUI.this.f205864g.post(new C71122a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$g */
    public class C71123g implements VerticalScrollBar.C6756b {
        public C71123g() {
        }

        /* renamed from: S0 */
        public void mo5638S0(String str) {
            UnfamiliarContactDetailUI unfamiliarContactDetailUI = UnfamiliarContactDetailUI.this;
            HashMap<String, Integer> hashMap = unfamiliarContactDetailUI.f205872r;
            int intValue = (hashMap == null || !hashMap.containsKey(str)) ? -1 : unfamiliarContactDetailUI.f205872r.get(str).intValue();
            Log.m105925i("MicroMsg.UnfamiliarContactUI", "[onScollBarTouch] showHead:%s pos:%s", str, Integer.valueOf(intValue));
            if (intValue != -1) {
                RecyclerView recyclerView = UnfamiliarContactDetailUI.this.f205864g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(intValue));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$7", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$7", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$h */
    public class C71124h extends RecyclerView.C16613e {
        public C71124h() {
        }

        /* renamed from: F4 */
        public C71125i mo97816F4(int i) {
            return UnfamiliarContactDetailUI.this.f205874t.size() > i ? UnfamiliarContactDetailUI.this.f205874t.get(i) : new C71125i(UnfamiliarContactDetailUI.this, new C72996z1());
        }

        public int getItemCount() {
            return UnfamiliarContactDetailUI.this.f205874t.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            if (zVar instanceof C71126j) {
                C71126j jVar = (C71126j) zVar;
                jVar.f205900E.setTag(Integer.valueOf(i));
                jVar.f205902G.setTag(Integer.valueOf(i));
                C71125i iVar = UnfamiliarContactDetailUI.this.f205874t.get(i);
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) jVar.f205905z.getContentView(), iVar.f205895c.getUsername());
                jVar.f205896A.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(UnfamiliarContactDetailUI.this.getContext(), iVar.f205894b, jVar.f205896A.getTextSize()));
                jVar.f205899D.setVisibility(iVar.f205895c.mo62943y3() ? 0 : 8);
                ImageView imageView = jVar.f205898C;
                String username = iVar.f205895c.getUsername();
                if (C99019x.m128974f() != null && UnfamiliarContactDetailUI.this.f205878x.size() == 0) {
                    UnfamiliarContactDetailUI.this.f205878x.addAll(((C11766m0) C99019x.m128974f()).mo11651Ow(5));
                }
                imageView.setVisibility(UnfamiliarContactDetailUI.this.f205878x.contains(username) ? 0 : 8);
                if (UnfamiliarContactDetailUI.this.f205873s.containsKey(Integer.valueOf(i))) {
                    jVar.f205897B.setVisibility(0);
                    jVar.f205897B.setText(UnfamiliarContactDetailUI.this.f205873s.get(Integer.valueOf(i)));
                } else {
                    jVar.f205897B.setVisibility(8);
                }
                if (UnfamiliarContactDetailUI.this.f205880z) {
                    LinearLayout linearLayout = jVar.f205903H;
                    linearLayout.setPadding(linearLayout.getPaddingLeft(), jVar.f205903H.getPaddingTop(), 0, jVar.f205903H.getPaddingBottom());
                    if (UnfamiliarContactDetailUI.this.f205875u.contains(Integer.valueOf(i))) {
                        jVar.f205901F.setChecked(true);
                    } else {
                        jVar.f205901F.setChecked(false);
                    }
                    jVar.f205900E.setVisibility(0);
                    return;
                }
                LinearLayout linearLayout2 = jVar.f205903H;
                linearLayout2.setPadding(linearLayout2.getPaddingLeft(), jVar.f205903H.getPaddingTop(), (int) UnfamiliarContactDetailUI.this.getResources().getDimension(C0966R.dimen.f3905if), jVar.f205903H.getPaddingBottom());
                jVar.f205900E.setVisibility(8);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C71126j(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.caz, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$i */
    public class C71125i {

        /* renamed from: a */
        public String f205893a;

        /* renamed from: b */
        public String f205894b;

        /* renamed from: c */
        public C72996z1 f205895c;

        public C71125i(UnfamiliarContactDetailUI unfamiliarContactDetailUI, C72996z1 z1Var) {
            this.f205895c = z1Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$j */
    public class C71126j extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f205896A;

        /* renamed from: B */
        public TextView f205897B;

        /* renamed from: C */
        public ImageView f205898C;

        /* renamed from: D */
        public ImageView f205899D;

        /* renamed from: E */
        public LinearLayout f205900E;

        /* renamed from: F */
        public CheckBox f205901F;

        /* renamed from: G */
        public View f205902G;

        /* renamed from: H */
        public LinearLayout f205903H;

        /* renamed from: z */
        public MaskLayout f205905z;

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$j$a */
        public class C71127a implements View.OnClickListener {
            public C71127a(UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int intValue = ((Integer) view.getTag()).intValue();
                CheckBox checkBox = C71126j.this.f205901F;
                checkBox.setChecked(!checkBox.isChecked());
                if (C71126j.this.f205901F.isChecked()) {
                    UnfamiliarContactDetailUI.this.f205875u.add(Integer.valueOf(intValue));
                } else {
                    UnfamiliarContactDetailUI.this.f205875u.remove(Integer.valueOf(intValue));
                }
                if (UnfamiliarContactDetailUI.this.f205875u.size() == 0) {
                    UnfamiliarContactDetailUI.this.f205868n.setEnabled(false);
                    UnfamiliarContactDetailUI.this.f205867j.setEnabled(false);
                } else {
                    UnfamiliarContactDetailUI.this.f205868n.setEnabled(true);
                    UnfamiliarContactDetailUI.this.f205867j.setEnabled(true);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$j$b */
        public class C71128b implements View.OnClickListener {
            public C71128b(UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
            }

            public void onClick(View view) {
                C44673z4 Lo;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int intValue = ((Integer) view.getTag()).intValue();
                C71125i F4 = UnfamiliarContactDetailUI.this.f205871q.mo97816F4(intValue);
                Log.m105925i("MicroMsg.UnfamiliarContactUI", "position:%s", Integer.valueOf(intValue), F4.f205894b);
                C71126j jVar = C71126j.this;
                if (UnfamiliarContactDetailUI.this.f205880z) {
                    C71131m.f205921e++;
                } else {
                    C71131m.f205922f++;
                }
                String str = F4.f205894b;
                String username = F4.f205895c.getUsername();
                String nickname = F4.f205895c.getNickname();
                if (Util.isNullOrNil(str) && (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mm0()).mo69630Lo(username)) != null && !Util.isNullOrNil(Lo.field_encryptUsername)) {
                    str = Lo.field_conRemark;
                }
                if (!Util.isNullOrNil(username)) {
                    Intent intent = new Intent();
                    intent.putExtra("Contact_User", username);
                    intent.putExtra("Contact_RemarkName", str);
                    intent.putExtra("Contact_Nick", nickname);
                    ((C67654r1) C14049d.m13403b()).mo93174g(intent, UnfamiliarContactDetailUI.this);
                    UnfamiliarContactDetailUI.this.f205877w = intValue;
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C71126j(View view) {
            super(view);
            this.f205902G = view;
            this.f205905z = (MaskLayout) view.findViewById(C0966R.C0970id.bm9);
            this.f205896A = (TextView) view.findViewById(C0966R.C0970id.bph);
            this.f205897B = (TextView) view.findViewById(C0966R.C0970id.bm8);
            this.f205898C = (ImageView) view.findViewById(C0966R.C0970id.bqg);
            this.f205899D = (ImageView) view.findViewById(C0966R.C0970id.bqh);
            this.f205900E = (LinearLayout) view.findViewById(C0966R.C0970id.bac);
            this.f205901F = (CheckBox) view.findViewById(C0966R.C0970id.bab);
            this.f205903H = (LinearLayout) view.findViewById(C0966R.C0970id.fa7);
            this.f205900E.setOnClickListener(new C71127a(UnfamiliarContactDetailUI.this));
            view.setOnClickListener(new C71128b(UnfamiliarContactDetailUI.this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$k */
    public class C71129k extends C88654b implements C11385n {

        /* renamed from: e */
        public C71132n f205908e;

        /* renamed from: f */
        public Collection<Integer> f205909f;

        /* renamed from: g */
        public int f205910g = 0;

        /* renamed from: h */
        public int f205911h = 0;

        /* renamed from: i */
        public int f205912i = 0;

        /* renamed from: j */
        public LinkedList<String> f205913j = new LinkedList<>();

        /* renamed from: n */
        public LinkedList<C75880o> f205914n = new LinkedList<>();

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$k$a */
        public class C71130a implements Runnable {
            public C71130a() {
            }

            public void run() {
                C71129k kVar = C71129k.this;
                C71132n nVar = kVar.f205908e;
                if (nVar != null) {
                    int size = UnfamiliarContactDetailUI.this.f205875u.size();
                    int i = C71129k.this.f205911h;
                    C71115c cVar = (C71115c) nVar;
                    cVar.getClass();
                    C71131m.f205917a += size;
                    UnfamiliarContactDetailUI unfamiliarContactDetailUI = UnfamiliarContactDetailUI.this;
                    String str = UnfamiliarContactDetailUI.f205859B;
                    unfamiliarContactDetailUI.mo97808J7(false);
                    UnfamiliarContactDetailUI.this.f205865h.setText(UnfamiliarContactDetailUI.this.getString(C0966R.string.k6k) + "(" + UnfamiliarContactDetailUI.this.f205874t.size() + ")");
                    C71124h hVar = UnfamiliarContactDetailUI.this.f205871q;
                    if (hVar != null) {
                        hVar.notifyDataSetChanged();
                    }
                    if (i < size) {
                        Log.m105929w("MicroMsg.UnfamiliarContactUI", "[onDelSuccess] realDeleteCount:%s count:%s", Integer.valueOf(i), Integer.valueOf(size));
                        C76879j.m92748s(UnfamiliarContactDetailUI.this.getContext(), UnfamiliarContactDetailUI.this.getString(C0966R.string.k6h, new Object[]{Integer.valueOf(size - i)}), "");
                    }
                    UnfamiliarContactDetailUI.this.f205875u.clear();
                }
            }
        }

        public C71129k(Collection<Integer> collection, C71132n nVar) {
            this.f205909f = collection;
            this.f205908e = nVar;
        }

        /* renamed from: a */
        public boolean mo97819a() {
            super.mo97819a();
            if (this.f205908e != null) {
                UnfamiliarContactDetailUI.this.f205875u.clear();
                C71115c cVar = (C71115c) this.f205908e;
                UnfamiliarContactDetailUI unfamiliarContactDetailUI = UnfamiliarContactDetailUI.this;
                String str = UnfamiliarContactDetailUI.f205859B;
                unfamiliarContactDetailUI.mo97808J7(false);
                TextView textView = UnfamiliarContactDetailUI.this.f205865h;
                textView.setText(UnfamiliarContactDetailUI.this.getString(C0966R.string.k6k) + "(" + UnfamiliarContactDetailUI.this.f205874t.size() + ")");
                C71124h hVar = UnfamiliarContactDetailUI.this.f205871q;
                if (hVar != null) {
                    hVar.notifyDataSetChanged();
                }
            }
            return false;
        }

        public String getKey() {
            return "delete_contact_task";
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C48623d.C48626c cVar;
            C48825b93 b932;
            LinkedList<Integer> linkedList;
            Class cls = C75700k0.class;
            if (yVar.getType() == 681) {
                C48623d dVar = (C48623d) yVar;
                C48623d.C48624a aVar = dVar.f130154e;
                if (aVar == null || (cVar = aVar.f130157b) == null) {
                    Log.m105920e("MicroMsg.UnfamiliarContactUI", "[onSceneEnd] rr is null!");
                    return;
                }
                C48684a93 a932 = cVar.f130159a;
                int i3 = a932.f130390d;
                if (i3 != 0 || (b932 = a932.f130391e) == null || (linkedList = b932.f131020e) == null) {
                    Log.m105921e("MicroMsg.UnfamiliarContactUI", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", Integer.valueOf(i3));
                    return;
                }
                ArrayList arrayList = (ArrayList) dVar.f130155f;
                Log.m105925i("MicroMsg.UnfamiliarContactUI", "[onSceneEnd] list size:%s, result:%s", Integer.valueOf(arrayList.size()), Integer.valueOf(linkedList.size()));
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    C75880o oVar = (C75880o) arrayList.get(i4);
                    if (oVar.mo58568b() != 4) {
                        Log.m105929w("MicroMsg.UnfamiliarContactUI", "cmdId:%s operation:%s", Integer.valueOf(oVar.mo58568b()), oVar.toString());
                    } else {
                        this.f205910g--;
                        C50482n20 n202 = (C50482n20) oVar.f222536j;
                        if (linkedList.get(i4).intValue() == 0) {
                            this.f205911h++;
                            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(C48374j0.m53718g(n202.f138337d));
                            if (z1Var != null) {
                                z1Var.mo62935u4();
                                C75604z3.m90836h(z1Var.getUsername(), (z3$$g) null);
                                ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(z1Var.getUsername(), 15);
                                ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
                                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f(z1Var.getUsername());
                                this.f205913j.add(z1Var.getUsername());
                            }
                        } else {
                            Log.m105921e("MicroMsg.UnfamiliarContactUI", "delete contact fail! ret:%s", linkedList.get(i4), C48374j0.m53718g(n202.f138337d));
                        }
                    }
                }
                if (this.f205910g <= 0) {
                    Iterator<String> it = this.f205913j.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        Iterator<C71125i> it4 = UnfamiliarContactDetailUI.this.f205874t.iterator();
                        while (it4.hasNext()) {
                            if (it4.next().f205895c.getUsername().equals(next)) {
                                it4.remove();
                            }
                        }
                    }
                    UnfamiliarContactDetailUI unfamiliarContactDetailUI = UnfamiliarContactDetailUI.this;
                    unfamiliarContactDetailUI.mo97807I7(unfamiliarContactDetailUI.f205874t);
                    UnfamiliarContactDetailUI.this.runOnUiThread(new C71130a());
                }
            }
        }

        public void run() {
            this.f205910g = this.f205909f.size();
            for (Integer intValue : this.f205909f) {
                int intValue2 = intValue.intValue();
                this.f205912i++;
                int size = this.f205909f.size();
                int i = this.f205912i;
                C71124h hVar = UnfamiliarContactDetailUI.this.f205871q;
                if (hVar != null) {
                    C72996z1 z1Var = hVar.mo97816F4(intValue2).f205895c;
                    if (C72996z1.m85843n5(z1Var.getUsername())) {
                        ((C45759r0) C86312j.m106911c(C45759r0.class)).mo71241e9(z1Var.getUsername());
                    } else {
                        C50482n20 n202 = new C50482n20();
                        C51163rv3 rv32 = new C51163rv3();
                        rv32.f141175d = Util.nullAsNil(z1Var.getUsername());
                        rv32.f141176e = true;
                        n202.f138337d = rv32;
                        this.f205914n.add(new C32330n(4, n202));
                        if (this.f205914n.size() % 20 == 0 || i == size) {
                            C86709a0.m107528h();
                            C86709a0.m107529k().f251779b.mo123460f(new C48623d(this.f205914n));
                            this.f205914n.clear();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$m */
    public static class C71131m {

        /* renamed from: a */
        public static int f205917a;

        /* renamed from: b */
        public static int f205918b;

        /* renamed from: c */
        public static int f205919c;

        /* renamed from: d */
        public static int f205920d;

        /* renamed from: e */
        public static int f205921e;

        /* renamed from: f */
        public static int f205922f;
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI$n */
    public interface C71132n {
    }

    /* renamed from: H7 */
    public static void m83583H7(UnfamiliarContactDetailUI unfamiliarContactDetailUI, boolean z) {
        unfamiliarContactDetailUI.getClass();
        if (!z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(unfamiliarContactDetailUI, C0966R.C0968anim.f2469dt);
            loadAnimation.setAnimationListener(new C5346d4(unfamiliarContactDetailUI));
            unfamiliarContactDetailUI.f205866i.startAnimation(loadAnimation);
        } else {
            Animation loadAnimation2 = AnimationUtils.loadAnimation(unfamiliarContactDetailUI, C0966R.C0968anim.f2471dv);
            loadAnimation2.setAnimationListener(new C5414z3(unfamiliarContactDetailUI));
            unfamiliarContactDetailUI.f205866i.startAnimation(loadAnimation2);
        }
        unfamiliarContactDetailUI.f205880z = z;
        if (z) {
            unfamiliarContactDetailUI.updateOptionMenuText(1, unfamiliarContactDetailUI.getString(C0966R.string.k6g));
            return;
        }
        unfamiliarContactDetailUI.updateOptionMenuText(1, unfamiliarContactDetailUI.getString(C0966R.string.k6m));
        ((CheckBox) unfamiliarContactDetailUI.f205869o.findViewById(C0966R.C0970id.bab)).setChecked(false);
    }

    /* renamed from: I7 */
    public final void mo97807I7(List<C71125i> list) {
        this.f205872r.clear();
        this.f205873s.clear();
        int i = 0;
        String str = null;
        for (C71125i next : list) {
            if (f205859B.equalsIgnoreCase(next.f205893a)) {
                next.f205893a = "#";
            }
            String str2 = next.f205893a;
            if (!str2.equalsIgnoreCase(str)) {
                this.f205872r.put(str2.toUpperCase(), Integer.valueOf(i));
                this.f205873s.put(Integer.valueOf(i), str2.toUpperCase());
            }
            i++;
            str = str2;
        }
    }

    /* renamed from: J7 */
    public final void mo97808J7(boolean z) {
        Log.m105925i("MicroMsg.UnfamiliarContactUI", "[setProgress] isVisible:%s", Boolean.valueOf(z));
        if (z) {
            this.f205860A = C89779i0.m112248e(this, getString(C0966R.string.k6j), true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        C89779i0 i0Var = this.f205860A;
        if (i0Var != null && i0Var.isShowing()) {
            this.f205860A.dismiss();
            this.f205860A = null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.by9;
    }

    public void initView() {
        super.initView();
        setMMTitle((int) C0966R.string.j1h);
        addTextOptionMenu(1, getString(C0966R.string.k6m), new C71113a());
        setBackBtn(new C71114b());
        View findViewById = findViewById(C0966R.C0970id.jel);
        int i = 8;
        int i2 = this.f205861d ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = findViewById(C0966R.C0970id.jen);
        int i3 = this.f205863f ? 0 : 8;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Integer.valueOf(i3));
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById3 = findViewById(C0966R.C0970id.jem);
        if (this.f205862e) {
            i = 0;
        }
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f205864g = (RecyclerView) findViewById(C0966R.C0970id.kzu);
        this.f205866i = findViewById(C0966R.C0970id.ag_);
        this.f205865h = (TextView) findViewById(C0966R.C0970id.grj);
        this.f205876v = new C71129k(this.f205875u, new C71115c());
        View findViewById4 = findViewById(C0966R.C0970id.kzr);
        this.f205867j = findViewById4;
        findViewById4.setOnClickListener(new C71116d());
        View findViewById5 = findViewById(C0966R.C0970id.kzs);
        this.f205868n = findViewById5;
        findViewById5.setOnClickListener(new C71118e());
        View findViewById6 = findViewById(C0966R.C0970id.kzt);
        this.f205869o = findViewById6;
        findViewById6.setOnClickListener(new C71121f());
        this.f205870p = (TextView) findViewById(C0966R.C0970id.kms);
        this.f205864g.setLayoutManager(new LinearLayoutManager(this));
        C71124h hVar = new C71124h();
        this.f205871q = hVar;
        this.f205864g.setAdapter(hVar);
        ((RealAlphabetScrollBar) findViewById(C0966R.C0970id.kzv)).setOnScrollBarTouchListener(new C71123g());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(291, this);
        this.f205861d = getIntent().getBooleanExtra("half_year_not_chat", false);
        this.f205862e = getIntent().getBooleanExtra("half_year_not_response", false);
        this.f205863f = getIntent().getBooleanExtra("has_not_same_chatroom", false);
        initView();
        C78858a0 a0Var = new C78858a0(this.f205861d, this.f205862e, this.f205863f, new C71141c4(this));
        this.f205879y = a0Var;
        a0Var.f231693m = System.currentTimeMillis();
        ((C71141c4) a0Var.f231692l).mo97829a(C42980l.NORMAL);
        a0Var.f231685e.postToWorker(new C78865x(a0Var));
    }

    public void onDestroy() {
        super.onDestroy();
        boolean z = this.f205861d | (this.f205863f ? (char) 2 : 0) | (this.f205862e ? (char) 4 : 0);
        C115669n.INSTANCE.mo160131h(14434, Integer.valueOf(z ? 1 : 0), Integer.valueOf(C71131m.f205918b), Integer.valueOf(C71131m.f205917a), Integer.valueOf(C71131m.f205922f), Integer.valueOf(C71131m.f205919c), Integer.valueOf(C71131m.f205921e), Integer.valueOf(C71131m.f205920d));
        Log.m105925i("MicroMsg.UnfamiliarContactUI", "[%s:%s:%s:%s:%s:%s:%s]", Integer.valueOf(z), Integer.valueOf(C71131m.f205918b), Integer.valueOf(C71131m.f205917a), Integer.valueOf(C71131m.f205922f), Integer.valueOf(C71131m.f205919c), Integer.valueOf(C71131m.f205921e), Integer.valueOf(C71131m.f205920d));
        C71131m.f205917a = 0;
        C71131m.f205918b = 0;
        C71131m.f205919c = 0;
        C71131m.f205920d = 0;
        C71131m.f205921e = 0;
        C71131m.f205922f = 0;
        C86709a0.m107524d().mo123470p(291, this);
        C86709a0.m107524d().mo123470p(C1805j.CTRL_INDEX, this.f205876v);
        C78858a0 a0Var = this.f205879y;
        Log.m105925i("MicroMsg.UnfamiliarContactEngine", "[onDestroy] [%s:%s:%s]", Boolean.valueOf(a0Var.f231682b), Boolean.valueOf(a0Var.f231681a), Boolean.valueOf(a0Var.f231683c));
        C78858a0.C53377b bVar = a0Var.f231691k;
        if (bVar != null) {
            C86709a0.m107524d().mo123470p(JsApiSetAudioState.CTRL_INDEX, bVar);
        }
        C88654b bVar2 = a0Var.f231694n;
        if (bVar2 != null) {
            bVar2.mo97819a();
        }
        a0Var.f231685e.quit();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
        int i = this.f205877w;
        if (-1 != i) {
            boolean z = false;
            if (-1 != i) {
                C71125i iVar = this.f205874t.get(i);
                C72996z1 z1Var = iVar.f205895c;
                C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
                if (z1Var2.mo62927s3() || !z1Var.mo62927s3()) {
                    iVar.f205895c = z1Var2;
                } else {
                    this.f205874t.remove(this.f205877w);
                    z = true;
                }
            }
            if (z) {
                C71131m.f205918b++;
            }
            this.f205877w = -1;
        }
        this.f205878x.clear();
        C71124h hVar = this.f205871q;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.UnfamiliarContactUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " " + yVar.getType());
        if (!(i == 0 && i2 == 0)) {
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.k6o), 1).show();
        }
        if (yVar.getType() == 291) {
            mo97808J7(false);
            this.f205878x.clear();
            this.f205871q.notifyDataSetChanged();
        }
    }
}
