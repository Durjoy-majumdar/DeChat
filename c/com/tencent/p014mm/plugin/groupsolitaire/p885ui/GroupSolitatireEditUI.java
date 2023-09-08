package com.tencent.p014mm.plugin.groupsolitaire.p885ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k20.C9556a;
import ke3.C88144b;
import nc0.C76850a;
import nj3.C76879j;
import p1136n3.C109678b;
import p447aw.C103918d;
import p629ny.C76979h;
import qg0.C12215a;
import sz1.C77815b;
import wz1.C78747b;
import wz1.C78757e;
import xz1.C79013a;
import xz1.C79014b;
import yz1.C79188f;
import yz1.C79192n;
import yz1.C79193o;
import yz1.C79194p;
import z51.C79305f;

/* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI */
public class GroupSolitatireEditUI extends BaseMvvmActivity implements C7020t0 {

    /* renamed from: U */
    public static final /* synthetic */ int f198377U = 0;

    /* renamed from: A */
    public int f198378A;

    /* renamed from: B */
    public C79013a f198379B = null;

    /* renamed from: C */
    public C79013a f198380C = null;

    /* renamed from: D */
    public String f198381D = "";

    /* renamed from: E */
    public C44661m1 f198382E;

    /* renamed from: F */
    public boolean f198383F = false;

    /* renamed from: G */
    public boolean f198384G = false;

    /* renamed from: H */
    public int f198385H;

    /* renamed from: I */
    public boolean f198386I;

    /* renamed from: J */
    public boolean f198387J = false;

    /* renamed from: K */
    public boolean f198388K = false;

    /* renamed from: L */
    public boolean f198389L = false;

    /* renamed from: M */
    public ArrayList<View> f198390M = new ArrayList<>();

    /* renamed from: N */
    public boolean f198391N = false;

    /* renamed from: P */
    public Rect f198392P;

    /* renamed from: Q */
    public Rect f198393Q;

    /* renamed from: R */
    public C79188f f198394R;

    /* renamed from: S */
    public TextWatcher f198395S = new C69021a();

    /* renamed from: T */
    public View.OnTouchListener f198396T = new C69034m();

    /* renamed from: d */
    public RelativeLayout f198397d;

    /* renamed from: e */
    public ScrollView f198398e;

    /* renamed from: f */
    public CdnImageView f198399f;

    /* renamed from: g */
    public TextView f198400g;

    /* renamed from: h */
    public MMEditText f198401h;

    /* renamed from: i */
    public View f198402i;

    /* renamed from: j */
    public View f198403j;

    /* renamed from: n */
    public LinearLayout f198404n;

    /* renamed from: o */
    public ImageButton f198405o;

    /* renamed from: p */
    public MMEditText f198406p;

    /* renamed from: q */
    public LinearLayout f198407q;

    /* renamed from: r */
    public RelativeLayout f198408r;

    /* renamed from: s */
    public RelativeLayout f198409s;

    /* renamed from: t */
    public RelativeLayout f198410t;

    /* renamed from: u */
    public View f198411u;

    /* renamed from: v */
    public View f198412v;

    /* renamed from: w */
    public GestureDetector f198413w;

    /* renamed from: x */
    public KeyboardHeightProvider f198414x;

    /* renamed from: y */
    public boolean f198415y = false;

    /* renamed from: z */
    public int f198416z;

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$a */
    public class C69021a implements TextWatcher {

        /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$a$a */
        public class C69022a implements Runnable {
            public C69022a() {
            }

            public void run() {
                GroupSolitatireEditUI groupSolitatireEditUI = GroupSolitatireEditUI.this;
                GroupSolitatireEditUI.m81318J7(groupSolitatireEditUI, groupSolitatireEditUI.f198384G);
            }
        }

        public C69021a() {
        }

        public void afterTextChanged(Editable editable) {
            long currentTimeMillis = System.currentTimeMillis();
            GroupSolitatireEditUI groupSolitatireEditUI = GroupSolitatireEditUI.this;
            int i = GroupSolitatireEditUI.f198377U;
            groupSolitatireEditUI.mo95047Q7();
            if (GroupSolitatireEditUI.this.f198412v instanceof MMEditText) {
                String obj = editable.toString();
                try {
                    obj = ((C79305f) C86312j.m106911c(C79305f.class)).mo109308IF(obj);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "afterTextChanged() emojiSoftBank2Unicode %s %s", e.getClass().getSimpleName(), e.getMessage());
                }
                int intValue = ((Integer) ((MMEditText) GroupSolitatireEditUI.this.f198412v).getTag(C0966R.C0970id.erm)).intValue();
                Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "afterTextChanged() str:%s type:%s", obj, Integer.valueOf(intValue));
                int y = C78747b.m95125y(obj);
                if (intValue == 1) {
                    if (y > C78747b.m95121u() * 2) {
                        int l = C78747b.m95112l(obj, C78747b.m95121u() * 2);
                        editable.delete(l, editable.length());
                        obj = obj.substring(0, l);
                    }
                    C79013a aVar = GroupSolitatireEditUI.this.f198379B;
                    aVar.f232001H = obj;
                    aVar.f232005L = 1;
                } else if (intValue == 2) {
                    GroupSolitatireEditUI.this.f198379B.f232002I = obj;
                } else if (intValue == 3) {
                    C79014b bVar = (C79014b) ((MMEditText) GroupSolitatireEditUI.this.f198412v).getTag(C0966R.C0970id.erk);
                    if (bVar != null) {
                        if (y > C78747b.m95122v() * 2) {
                            int l2 = C78747b.m95112l(obj, C78747b.m95122v() * 2);
                            editable.delete(l2, editable.length());
                            obj = obj.substring(0, l2);
                        }
                        bVar.f232014e = obj;
                    }
                } else if (intValue == 4) {
                    if (y > C78747b.m95120t() * 2) {
                        int l3 = C78747b.m95112l(obj, C78747b.m95120t() * 2);
                        editable.delete(l3, editable.length());
                        obj = obj.substring(0, l3);
                    }
                    GroupSolitatireEditUI.this.f198379B.f232003J = obj;
                }
            }
            GroupSolitatireEditUI.this.mo95050T7(false);
            GroupSolitatireEditUI.this.f198412v.postDelayed(new C69022a(), 100);
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "startTime:%s interTime:%s", Long.valueOf(currentTimeMillis), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$b */
    public class C69023b implements DialogInterface.OnClickListener {
        public C69023b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "back_dialot ok");
            C78757e wx02 = ((C77815b) C86312j.m106911c(C77815b.class)).wx0();
            GroupSolitatireEditUI groupSolitatireEditUI = GroupSolitatireEditUI.this;
            C79013a aVar = groupSolitatireEditUI.f198379B;
            int i2 = groupSolitatireEditUI.f198385H;
            if (i2 == 3 || i2 == 4) {
                i2 = 3;
            }
            wx02.mo108686g(aVar, i2, 2, groupSolitatireEditUI.f198383F);
            GroupSolitatireEditUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$c */
    public class C69024c implements DialogInterface.OnClickListener {
        public C69024c(GroupSolitatireEditUI groupSolitatireEditUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "back_dialot cancel");
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$d */
    public class C69025d implements Runnable {
        public C69025d() {
        }

        public void run() {
            KeyboardHeightProvider keyboardHeightProvider = GroupSolitatireEditUI.this.f198414x;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104022e();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$e */
    public class C69026e implements Runnable {
        public C69026e() {
        }

        public void run() {
            GroupSolitatireEditUI.this.showVKB();
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$f */
    public class C69027f implements Runnable {
        public C69027f() {
        }

        public void run() {
            GroupSolitatireEditUI.this.showVKB();
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$g */
    public class C69028g implements Runnable {
        public C69028g() {
        }

        public void run() {
            ((MMEditText) GroupSolitatireEditUI.this.f198412v).setCursorVisible(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$h */
    public class C69029h implements Runnable {
        public C69029h() {
        }

        public void run() {
            ((MMEditText) GroupSolitatireEditUI.this.f198412v).setCursorVisible(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$i */
    public class C69030i implements Animator.AnimatorListener {
        public C69030i() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            View view;
            GroupSolitatireEditUI groupSolitatireEditUI = GroupSolitatireEditUI.this;
            if (groupSolitatireEditUI.f198384G) {
                groupSolitatireEditUI.mo95049S7(4);
                return;
            }
            groupSolitatireEditUI.getClass();
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 1; i <= groupSolitatireEditUI.f198379B.f232007N.size(); i++) {
                    C79014b bVar = groupSolitatireEditUI.f198379B.f232007N.get(Integer.valueOf(i));
                    if (bVar != null) {
                        if (!Util.isNullOrNil(bVar.f232014e.trim()) || groupSolitatireEditUI.f198390M.get(i - 1).getTag() != null) {
                            arrayList2.add(bVar);
                        } else {
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                }
                Collections.sort(arrayList, new C79192n(groupSolitatireEditUI));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (num.intValue() - 1 < groupSolitatireEditUI.f198390M.size() && (view = groupSolitatireEditUI.f198390M.get(num.intValue() - 1)) != null) {
                        groupSolitatireEditUI.f198404n.removeView(view);
                        groupSolitatireEditUI.f198390M.remove(num.intValue() - 1);
                    }
                }
                Iterator<View> it4 = groupSolitatireEditUI.f198390M.iterator();
                int i2 = 0;
                while (it4.hasNext()) {
                    i2++;
                    ((TextView) it4.next().findViewById(C0966R.C0970id.erg)).setText(i2 + "");
                }
                groupSolitatireEditUI.f198379B.f232007N.clear();
                Iterator it5 = arrayList2.iterator();
                int i3 = 0;
                while (it5.hasNext()) {
                    i3++;
                    groupSolitatireEditUI.f198379B.f232007N.put(Integer.valueOf(i3), (C79014b) it5.next());
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "updateContent Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
            if (GroupSolitatireEditUI.this.f198379B.f232007N.size() < C78747b.m95123w()) {
                GroupSolitatireEditUI.this.mo95049S7(0);
            }
            GroupSolitatireEditUI.this.f198407q.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            GroupSolitatireEditUI groupSolitatireEditUI = GroupSolitatireEditUI.this;
            if (groupSolitatireEditUI.f198384G) {
                groupSolitatireEditUI.f198407q.setVisibility(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$j */
    public class C69031j implements Runnable {
        public C69031j() {
        }

        public void run() {
            GroupSolitatireEditUI groupSolitatireEditUI = GroupSolitatireEditUI.this;
            GroupSolitatireEditUI.m81318J7(groupSolitatireEditUI, groupSolitatireEditUI.f198384G);
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$k */
    public class C69032k implements DialogInterface.OnClickListener {
        public C69032k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(GroupSolitatireEditUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$l */
    public class C69033l implements Runnable {
        public C69033l() {
        }

        public void run() {
            GroupSolitatireEditUI.this.showVKB();
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$m */
    public class C69034m implements View.OnTouchListener {
        public C69034m() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getActionMasked() == 1 && (view instanceof MMEditText) && GroupSolitatireEditUI.this.f198383F) {
                ((MMEditText) view).setCursorVisible(true);
            }
            if (motionEvent.getActionMasked() == 1 && (view instanceof MMEditText)) {
                MMEditText mMEditText = (MMEditText) view;
                if (((Integer) mMEditText.getTag(C0966R.C0970id.erm)).intValue() == 3 && GroupSolitatireEditUI.this.f198389L) {
                    mMEditText.setCursorVisible(true);
                }
            }
            GroupSolitatireEditUI groupSolitatireEditUI = GroupSolitatireEditUI.this;
            MMEditText mMEditText2 = (MMEditText) view;
            int i = GroupSolitatireEditUI.f198377U;
            groupSolitatireEditUI.getClass();
            if (mMEditText2.getLineCount() > mMEditText2.getMaxLines()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                GroupSolitatireEditUI.this.f198388K = true;
                if (motionEvent.getAction() == 1) {
                    GroupSolitatireEditUI.this.f198388K = false;
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$n */
    public class C69035n implements MenuItem.OnMenuItemClickListener {
        public C69035n() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GroupSolitatireEditUI groupSolitatireEditUI = GroupSolitatireEditUI.this;
            int i = GroupSolitatireEditUI.f198377U;
            groupSolitatireEditUI.mo95046P7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$o */
    public class C69036o implements Runnable {
        public C69036o() {
        }

        public void run() {
            GroupSolitatireEditUI.this.f198398e.fullScroll(33);
        }
    }

    /* renamed from: I7 */
    public static void m81317I7(GroupSolitatireEditUI groupSolitatireEditUI) {
        boolean z;
        Pair pair;
        String str;
        String str2;
        String str3;
        String str4;
        C79013a aVar;
        String str5;
        GroupSolitatireEditUI groupSolitatireEditUI2 = groupSolitatireEditUI;
        Class cls = C77815b.class;
        boolean z2 = true;
        groupSolitatireEditUI2.f198391N = true;
        if (groupSolitatireEditUI2.f198415y && (aVar = groupSolitatireEditUI2.f198379B) != null && (str5 = aVar.f232002I) != null && !Util.isNullOrNil(str5.trim())) {
            groupSolitatireEditUI2.f198379B.f232002I = groupSolitatireEditUI2.getString(C0966R.string.ffg) + " " + groupSolitatireEditUI2.f198379B.f232002I.trim();
            C79013a aVar2 = groupSolitatireEditUI2.f198379B;
            aVar2.field_key = C78747b.m95115o(aVar2);
        }
        C79013a f = ((C77815b) C86312j.m106911c(cls)).vx0().mo108668f(groupSolitatireEditUI2.f198381D, groupSolitatireEditUI2.f198379B.field_key);
        C78747b.m95108h(f);
        if (groupSolitatireEditUI2.f198383F) {
            z = f != null;
            f = C78747b.m95089A(groupSolitatireEditUI2.f198379B, f, C75592q0.m90789s(), 2);
        } else {
            z = false;
        }
        C79013a l2 = f == null ? null : f.clone();
        C79013a I = C78747b.m95097I(groupSolitatireEditUI2.f198379B, f, C75592q0.m90789s(), true, false);
        if (I.f232008P) {
            C78747b.m95126z(I);
        }
        if (f != null && f.field_active == 0 && I.f232007N.size() > 1) {
            ((C77815b) C86312j.m106911c(cls)).wx0().mo108681b(I, C75592q0.m90789s());
        }
        I.field_lastActiveTime = (long) C31543z5.m39455e();
        C78747b.m95099K(I, f != null, false);
        int i = groupSolitatireEditUI2.f198385H;
        long j = -1;
        if ((i == 4 || i == 5) || (groupSolitatireEditUI2.f198383F && f != null)) {
            String str6 = "sendGroupSolitatire() ret:%s";
            String str7 = "MicroMsg.groupsolitaire.PluginGroupSolitaire";
            C77815b bVar = (C77815b) C86312j.m106911c(cls);
            String str8 = groupSolitatireEditUI2.f198381D;
            C79013a aVar3 = groupSolitatireEditUI2.f198379B;
            boolean z3 = f == null;
            bVar.getClass();
            String j2 = C78747b.m95110j(aVar3);
            C68070l.C68072b bVar2 = new C68070l.C68072b();
            bVar2.f195570f = j2;
            bVar2.f195582i = 53;
            bVar2.f195637v2 = new Pair<>(I.field_key, C78747b.m95101a(j2, I, z));
            Pair<Integer, Long> qE = C80996q.C1279a.m1369a().mo112827qE(bVar2, "", "", str8, "", (byte[]) null);
            if (!z3 || qE == null) {
                str = j2;
                str2 = str7;
                if (!z3) {
                    ((C77815b) C86312j.m106911c(cls)).wx0().mo108688i(I, l2, 2);
                }
            } else {
                str = j2;
                ((C77815b) C86312j.m106911c(cls)).wx0().mo108680a(((Long) qE.second).longValue(), I, l2, false, 2);
                str2 = str7;
            }
            if (qE != null) {
                C78747b.m95100L(((Long) qE.second).longValue(), C75592q0.m90789s(), I);
            }
            Log.m105925i(str2, str6, qE);
            if (qE != null) {
                j = ((Long) qE.second).longValue();
            }
            pair = new Pair(Long.valueOf(j), str);
        } else {
            String str9 = groupSolitatireEditUI2.f198381D;
            boolean z4 = groupSolitatireEditUI2.f198383F;
            ((C77815b) C86312j.m106911c(cls)).getClass();
            String j3 = C78747b.m95110j(I);
            C68070l.C68072b bVar3 = new C68070l.C68072b();
            bVar3.f195570f = j3;
            bVar3.f195582i = 53;
            bVar3.f195637v2 = new Pair<>(I.field_key, C78747b.m95101a(j3, I, z));
            Pair<Integer, Long> qE2 = C80996q.C1279a.m1369a().mo112827qE(bVar3, "", "", str9, "", (byte[]) null);
            if (!z4 || qE2 == null) {
                str3 = "MicroMsg.groupsolitaire.PluginGroupSolitaire";
                str4 = "sendGroupSolitatire() ret:%s";
                if (!z4) {
                    ((C77815b) C86312j.m106911c(cls)).wx0().mo108688i(I, l2, 2);
                }
            } else {
                str3 = "MicroMsg.groupsolitaire.PluginGroupSolitaire";
                ((C77815b) C86312j.m106911c(cls)).wx0().mo108680a(((Long) qE2.second).longValue(), I, l2, false, 2);
                str4 = "sendGroupSolitatire() ret:%s";
            }
            if (qE2 != null) {
                C78747b.m95100L(((Long) qE2.second).longValue(), C75592q0.m90789s(), I);
            }
            Log.m105925i(str3, str4, qE2);
            if (qE2 != null) {
                j = ((Long) qE2.second).longValue();
            }
            pair = new Pair(Long.valueOf(j), j3);
        }
        Intent intent = new Intent();
        intent.putExtra("key_group_solitatire_content", (String) pair.second);
        groupSolitatireEditUI2.setResult(-1, intent);
        if (((Long) pair.first).longValue() >= 0) {
            int i2 = 3;
            if (I.field_msgSvrId == 0) {
                C78757e wx02 = ((C77815b) C86312j.m106911c(cls)).wx0();
                long longValue = ((Long) pair.first).longValue();
                C79013a aVar4 = groupSolitatireEditUI2.f198379B;
                int i3 = groupSolitatireEditUI2.f198385H;
                if (!(i3 == 3 || i3 == 4)) {
                    z2 = false;
                }
                if (!z2) {
                    i2 = i3;
                }
                boolean z5 = groupSolitatireEditUI2.f198383F;
                wx02.getClass();
                if (longValue >= 0 && aVar4 != null) {
                    C78757e.C78759b bVar4 = new C78757e.C78759b(wx02);
                    bVar4.f230484a = aVar4.field_username;
                    bVar4.f230485b = (long) i2;
                    bVar4.f230487d = aVar4.field_key;
                    if (z5) {
                        bVar4.f230486c = 2;
                    } else {
                        bVar4.f230486c = 1;
                    }
                    wx02.f230479c.put(Long.valueOf(longValue), bVar4);
                }
            } else {
                C78757e wx03 = ((C77815b) C86312j.m106911c(cls)).wx0();
                int i4 = groupSolitatireEditUI2.f198385H;
                if (!(i4 == 3 || i4 == 4)) {
                    z2 = false;
                }
                if (z2) {
                    i4 = 3;
                }
                wx03.mo108686g(I, i4, 3, groupSolitatireEditUI2.f198383F);
            }
        }
        groupSolitatireEditUI.finish();
    }

    /* renamed from: J7 */
    public static void m81318J7(GroupSolitatireEditUI groupSolitatireEditUI, boolean z) {
        View view = groupSolitatireEditUI.f198412v;
        if (view != null) {
            groupSolitatireEditUI.f198378A = ((MMEditText) view).getSelectionStart();
            int height = ((WindowManager) groupSolitatireEditUI.getSystemService("window")).getDefaultDisplay().getHeight();
            groupSolitatireEditUI.f198412v.getGlobalVisibleRect(groupSolitatireEditUI.f198393Q);
            Rect rect = groupSolitatireEditUI.f198393Q;
            if (rect.bottom > height) {
                rect.bottom = height;
            }
            int height2 = (groupSolitatireEditUI.f198416z + groupSolitatireEditUI.f198407q.getHeight()) - (height - groupSolitatireEditUI.f198393Q.bottom);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) groupSolitatireEditUI.f198411u.getLayoutParams();
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "screenHeight - (moveHeight + mKeyBoardLl.getHeight()):%s ", Integer.valueOf(height - (groupSolitatireEditUI.f198416z + groupSolitatireEditUI.f198407q.getHeight())));
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "focusViewRect.bottom.bottom：%s，screenHeight：%s,move：%s", Integer.valueOf(groupSolitatireEditUI.f198393Q.bottom), Integer.valueOf(height), Integer.valueOf(height2));
            if (!z) {
                layoutParams.height = 0;
                groupSolitatireEditUI.f198411u.setLayoutParams(layoutParams);
            } else if (groupSolitatireEditUI.f198393Q.bottom > height - (groupSolitatireEditUI.f198416z + groupSolitatireEditUI.f198407q.getHeight()) && groupSolitatireEditUI.f198416z != 0) {
                if (groupSolitatireEditUI.f198406p.isShown()) {
                    groupSolitatireEditUI.f198406p.getGlobalVisibleRect(groupSolitatireEditUI.f198392P);
                } else {
                    groupSolitatireEditUI.f198403j.getGlobalVisibleRect(groupSolitatireEditUI.f198392P);
                }
                Rect rect2 = groupSolitatireEditUI.f198392P;
                if (rect2.bottom > height) {
                    rect2.bottom = height;
                }
                layoutParams.height = (height - rect2.bottom) + height2;
                groupSolitatireEditUI.f198411u.setLayoutParams(layoutParams);
                groupSolitatireEditUI.f198411u.postDelayed(new C79193o(groupSolitatireEditUI, height2), 100);
            }
        }
    }

    /* renamed from: H7 */
    public final void mo95040H7(String str) {
        ((MMEditText) this.f198412v).requestFocus();
        this.f198404n.postDelayed(new C69033l(), 200);
        Editable text = ((MMEditText) this.f198412v).getText();
        int i = this.f198378A;
        text.insert(i, str + "; ");
    }

    /* renamed from: K7 */
    public final void mo95041K7(boolean z) {
        C79014b bVar = new C79014b();
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.ayq, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.erg)).setText((this.f198379B.f232007N.size() + 1) + "");
        MMEditText mMEditText = (MMEditText) inflate.findViewById(C0966R.C0970id.erf);
        CharSequence O7 = mo95045O7(C75592q0.m90789s(), false);
        if (!Util.isNullOrNil(O7)) {
            mMEditText.setText(O7 + " ");
            bVar.f232014e = O7 + "";
        }
        bVar.f232010a = C75592q0.m90789s();
        C79013a aVar = this.f198379B;
        bVar.f232012c = aVar.f232004K;
        bVar.f232015f = aVar.f232007N.size() + 1;
        mMEditText.setTag(C0966R.C0970id.erm, 3);
        mMEditText.setTag(C0966R.C0970id.erk, bVar);
        mMEditText.requestFocus();
        mMEditText.setFocusable(true);
        mMEditText.setFocusableInTouchMode(true);
        mMEditText.addTextChangedListener(this.f198395S);
        mMEditText.setOnTouchListener(this.f198396T);
        mMEditText.setOnFocusChangeListener(new C79194p(this, mMEditText));
        mMEditText.setMaxLines(10);
        HashMap<Integer, C79014b> hashMap = this.f198379B.f232007N;
        hashMap.put(Integer.valueOf(hashMap.size() + 1), bVar);
        this.f198404n.addView(inflate);
        this.f198390M.add(inflate);
        inflate.post(new C69027f());
        mo95050T7(z);
    }

    /* renamed from: L7 */
    public void mo95042L7(int i) {
        Class cls = C77815b.class;
        View view = this.f198412v;
        int i2 = 0;
        if (view == null || !(view instanceof MMEditText)) {
            ((C77815b) C86312j.m106911c(cls)).wx0().mo108683d(this.f198379B, i, 0);
            return;
        }
        int intValue = ((Integer) ((MMEditText) view).getTag(C0966R.C0970id.erm)).intValue();
        if (intValue == 1) {
            i2 = 1;
        } else if (intValue == 2) {
            i2 = 3;
        } else if (intValue == 3) {
            i2 = 4;
        } else if (intValue == 4) {
            i2 = 2;
        }
        ((C77815b) C86312j.m106911c(cls)).wx0().mo108683d(this.f198379B, i, i2);
    }

    /* renamed from: M7 */
    public final Pair<Boolean, Boolean> mo95043M7() {
        HashSet hashSet = new HashSet();
        boolean z = true;
        for (int i = 1; i <= this.f198380C.f232007N.size(); i++) {
            C79014b bVar = this.f198380C.f232007N.get(Integer.valueOf(i));
            if (Util.isEqual(bVar.f232010a, C75592q0.m90789s())) {
                hashSet.add(bVar);
            }
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (int i2 = 1; i2 <= this.f198379B.f232007N.size(); i2++) {
            C79014b bVar2 = this.f198379B.f232007N.get(Integer.valueOf(i2));
            if (Util.isEqual(bVar2.f232010a, C75592q0.m90789s()) && !Util.isNullOrNil(bVar2.f232014e.trim())) {
                arrayList.add(bVar2);
                hashSet2.add(bVar2);
            }
        }
        boolean z2 = false;
        if (hashSet.size() == arrayList.size()) {
            boolean z3 = arrayList.size() != hashSet2.size();
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!hashSet.contains((C79014b) it.next())) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            z2 = z3;
        }
        return new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* renamed from: N7 */
    public final int mo95044N7(MMEditText mMEditText) {
        if (this.f198416z == 0) {
            return 10;
        }
        float height = ((float) (((WindowManager) getSystemService("window")).getDefaultDisplay().getHeight() - ((this.f198416z + this.f198407q.getHeight()) + C74942w4.m89784a(this, 145)))) / ((float) mMEditText.getLineHeight());
        if (height <= 0.0f) {
            height = 10.0f;
        }
        return (int) height;
    }

    /* renamed from: O7 */
    public final CharSequence mo95045O7(String str, boolean z) {
        String str2;
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (!z || Util.isNullOrNil(z1Var.mo73969n2())) {
            String username = z1Var.getUsername();
            C44661m1 m1Var = this.f198382E;
            str2 = m1Var == null ? null : m1Var.mo69789q2(username);
        } else {
            str2 = z1Var.mo73969n2();
        }
        if (Util.isNullOrNil(str2)) {
            str2 = z1Var.mo73969n2();
        }
        if (Util.isNullOrNil(str2)) {
            str2 = z1Var.mo62909j3();
        }
        if (Util.isNullOrNil(str2)) {
            str2 = z1Var.getUsername();
        }
        return ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), str2);
    }

    /* renamed from: P7 */
    public final boolean mo95046P7() {
        if (this.f198387J) {
            C76879j.m92710D(this, getString(C0966R.string.ff_), "", getString(C0966R.string.ff9), getString(C0966R.string.ff8), false, new C69023b(), new C69024c(this), C0966R.color.a_0);
        } else {
            C78757e wx02 = ((C77815b) C86312j.m106911c(C77815b.class)).wx0();
            C79013a aVar = this.f198379B;
            int i = this.f198385H;
            if (i == 3 || i == 4) {
                i = 3;
            }
            wx02.mo108686g(aVar, i, 1, this.f198383F);
            finish();
        }
        return true;
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        ObjectAnimator objectAnimator;
        boolean z2 = this.f198384G;
        if (i > 0) {
            this.f198384G = true;
        } else {
            this.f198384G = false;
        }
        if (!z2 && this.f198384G) {
            Iterator<View> it = this.f198390M.iterator();
            while (it.hasNext()) {
                it.next().setTag((Object) null);
            }
        }
        if (i != 0) {
            this.f198416z = i;
        }
        if (this.f198383F) {
            MMEditText mMEditText = this.f198401h;
            mMEditText.setMaxLines(mo95044N7(mMEditText));
            MMEditText mMEditText2 = this.f198406p;
            mMEditText2.setMaxLines(mo95044N7(mMEditText2));
        }
        View view = this.f198412v;
        if (view != null) {
            if (!this.f198384G) {
                view.post(new C69028g());
            } else {
                view.postDelayed(new C69029h(), 100);
            }
        }
        if (this.f198384G) {
            if (this.f198407q.getTranslationY() != 0.0f) {
                this.f198407q.setTranslationY(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(this.f198407q, "translationY", new float[]{0.0f, (float) (-this.f198416z)});
        } else {
            LinearLayout linearLayout = this.f198407q;
            objectAnimator = ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{linearLayout.getTranslationY(), 0.0f});
        }
        objectAnimator.setDuration(175);
        objectAnimator.setInterpolator(new C109678b());
        objectAnimator.addListener(new C69030i());
        objectAnimator.start();
        mo95047Q7();
        View view2 = this.f198412v;
        if (view2 != null) {
            view2.postDelayed(new C69031j(), 50);
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onInputPanelChange() isKeyboardShow:%s keyboardHeight:%s moveHeight:%s", Boolean.valueOf(this.f198384G), Integer.valueOf(i), Integer.valueOf(this.f198416z));
        }
    }

    /* renamed from: Q7 */
    public final void mo95047Q7() {
        if (this.f198397d.findFocus() == null) {
            Log.m105918d("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "mRootContainer.findFocus() is null");
            return;
        }
        View findFocus = this.f198397d.findFocus();
        this.f198412v = findFocus;
        this.f198378A = ((MMEditText) findFocus).getSelectionStart();
    }

    /* renamed from: R7 */
    public final void mo95048R7() {
        Class cls = C103918d.class;
        if (!C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            boolean z1 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(this, "android.permission.ACCESS_FINE_LOCATION", 64, (String) null, (String) null);
            Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "summerper checkPermission checkLocation[%b]", Boolean.valueOf(z1));
            if (!z1) {
                return;
            }
        } else if (!((C103918d) C86312j.m106911c(cls)).Lb0(this, "android.permission.ACCESS_FINE_LOCATION")) {
            if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                C12215a.m11778c(this, getResources().getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30764, true);
                return;
            }
            ((C103918d) C86312j.m106911c(cls)).mo125790zt(this, "android.permission.ACCESS_FINE_LOCATION", 64);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
        intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
        intent.putExtra("map_view_type", 3);
        C88144b.m109795m(this, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 4097);
    }

    /* renamed from: S7 */
    public final void mo95049S7(int i) {
        if (this.f198386I) {
            this.f198405o.setVisibility(8);
        } else {
            this.f198405o.setVisibility(i);
        }
    }

    /* renamed from: T7 */
    public final void mo95050T7(boolean z) {
        boolean z2;
        int i = 1;
        while (true) {
            if (i > this.f198379B.f232007N.size()) {
                z2 = false;
                break;
            }
            C79014b bVar = this.f198379B.f232007N.get(Integer.valueOf(i));
            if (bVar != null && !Util.isNullOrNil(bVar.f232014e.trim())) {
                z2 = true;
                break;
            }
            i++;
        }
        if (!this.f198383F) {
            Pair<Boolean, Boolean> M7 = mo95043M7();
            boolean booleanValue = ((Boolean) M7.first).booleanValue();
            boolean booleanValue2 = ((Boolean) M7.second).booleanValue();
            if (!z2 || (!booleanValue && !booleanValue2)) {
                enableOptionMenu(0, false);
                if (!z) {
                    this.f198387J = false;
                    return;
                }
                return;
            }
            enableOptionMenu(0, true);
            if (!z) {
                this.f198387J = true;
            }
        } else if (z2) {
            enableOptionMenu(0, true);
            if (!z) {
                C79013a aVar = this.f198380C;
                if (aVar != null && Util.isEqual(this.f198379B.f232001H, aVar.f232001H) && Util.isEqual(this.f198379B.f232002I, this.f198380C.f232002I) && Util.isEqual(this.f198379B.f232003J, this.f198380C.f232003J)) {
                    Pair<Boolean, Boolean> M72 = mo95043M7();
                    boolean booleanValue3 = ((Boolean) M72.first).booleanValue();
                    boolean booleanValue4 = ((Boolean) M72.second).booleanValue();
                    if (!booleanValue3 && !booleanValue4) {
                        if (!z) {
                            this.f198387J = false;
                            return;
                        }
                        return;
                    }
                }
                if (!z) {
                    this.f198387J = true;
                }
            }
        } else {
            enableOptionMenu(0, false);
            if (!z) {
                this.f198387J = false;
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f198413w;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        super.dispatchTouchEvent(motionEvent);
        return false;
    }

    public void finish() {
        super.finish();
        try {
            hideVKB();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "finish() hideVKB() %s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ayr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x04e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r18 = this;
            r6 = r18
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            super.initView()
            r0 = 2131831089(0x7f112931, float:1.9295194E38)
            java.lang.String r0 = r6.getString(r0)
            r6.setMMTitle((java.lang.String) r0)
            r18.hideActionbarLine()
            android.content.res.Resources r0 = r18.getResources()
            r1 = 2131099720(0x7f060048, float:1.7811801E38)
            int r0 = r0.getColor(r1)
            r6.setActionbarColor(r0)
            r0 = 2131101833(0x7f060889, float:1.7816087E38)
            r6.setBackGroundColorResource(r0)
            com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$n r0 = new com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$n
            r0.<init>()
            r6.setBackBtn(r0)
            com.tencent.mm.ui.tools.KeyboardHeightProvider r0 = new com.tencent.mm.ui.tools.KeyboardHeightProvider
            androidx.appcompat.app.AppCompatActivity r1 = r18.getContext()
            r0.<init>(r1)
            r6.f198414x = r0
            r0.f220015b = r6
            r0 = 2131312646(0x7f094006, float:1.8243666E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r6.f198398e = r0
            r0 = 2131312635(0x7f093ffb, float:1.8243644E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r6.f198397d = r0
            r0 = 2131305759(0x7f09251f, float:1.8229698E38)
            android.view.View r0 = r6.findViewById(r0)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r0
            r6.f198399f = r0
            r0 = 2131305760(0x7f092520, float:1.82297E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f198400g = r0
            r0 = 2131305765(0x7f092525, float:1.822971E38)
            android.view.View r0 = r6.findViewById(r0)
            com.tencent.mm.ui.widget.MMEditText r0 = (com.tencent.p014mm.p136ui.widget.MMEditText) r0
            r6.f198401h = r0
            r0 = 2131305771(0x7f09252b, float:1.8229722E38)
            android.view.View r0 = r6.findViewById(r0)
            r6.f198402i = r0
            r0 = 2131305772(0x7f09252c, float:1.8229724E38)
            android.view.View r0 = r6.findViewById(r0)
            r6.f198403j = r0
            r0 = 2131305761(0x7f092521, float:1.8229702E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.f198404n = r0
            r0 = 2131305763(0x7f092523, float:1.8229706E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r6.f198405o = r0
            r0 = 2131305774(0x7f09252e, float:1.8229728E38)
            android.view.View r0 = r6.findViewById(r0)
            com.tencent.mm.ui.widget.MMEditText r0 = (com.tencent.p014mm.p136ui.widget.MMEditText) r0
            r6.f198406p = r0
            r0 = 2131305766(0x7f092526, float:1.8229712E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.f198407q = r0
            r0 = 2131305767(0x7f092527, float:1.8229714E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r6.f198408r = r0
            r0 = 2131305768(0x7f092528, float:1.8229716E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r6.f198409s = r0
            r0 = 2131305769(0x7f092529, float:1.8229718E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r6.f198410t = r0
            r0 = 2131305773(0x7f09252d, float:1.8229726E38)
            android.view.View r0 = r6.findViewById(r0)
            r6.f198411u = r0
            android.widget.RelativeLayout r0 = r6.f198408r
            yz1.r r1 = new yz1.r
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            android.widget.RelativeLayout r0 = r6.f198409s
            yz1.s r1 = new yz1.s
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            android.widget.RelativeLayout r0 = r6.f198410t
            yz1.t r1 = new yz1.t
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            r0 = 2131831081(0x7f112929, float:1.9295178E38)
            java.lang.String r2 = r6.getString(r0)
            yz1.u r3 = new yz1.u
            r3.<init>(r6)
            com.tencent.mm.ui.MMActivityController$r r5 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.GREEN
            r1 = 0
            r4 = 0
            r0 = r18
            r0.addTextOptionMenu(r1, r2, r3, r4, r5)
            boolean r0 = r6.f198383F
            r2 = 1
            if (r0 == 0) goto L_0x0118
            r6.enableOptionMenu(r1, r2)
            goto L_0x011b
        L_0x0118:
            r6.enableOptionMenu(r1, r1)
        L_0x011b:
            boolean r0 = r6.f198386I
            if (r0 == 0) goto L_0x0122
            r6.removeOptionMenu(r1)
        L_0x0122:
            yz1.v r0 = new yz1.v
            r0.<init>(r6)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMHandlerThread.isMainThread()
            if (r3 == 0) goto L_0x0131
            r0.run()
            goto L_0x0139
        L_0x0131:
            yz1.l r3 = new yz1.l
            r3.<init>(r6, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
        L_0x0139:
            xz1.a r0 = r6.f198379B
            java.util.HashMap<java.lang.Integer, xz1.b> r0 = r0.f232007N
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x016e
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3 = 1
        L_0x0149:
            xz1.a r4 = r6.f198379B
            java.util.HashMap<java.lang.Integer, xz1.b> r4 = r4.f232007N
            int r4 = r4.size()
            if (r3 > r4) goto L_0x0169
            xz1.a r4 = r6.f198379B
            java.util.HashMap<java.lang.Integer, xz1.b> r4 = r4.f232007N
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r4.get(r5)
            xz1.b r4 = (xz1.C79014b) r4
            java.lang.String r4 = r4.f232010a
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x0149
        L_0x0169:
            int r0 = r0.size()
            goto L_0x016f
        L_0x016e:
            r0 = 0
        L_0x016f:
            android.widget.TextView r3 = r6.f198400g
            r4 = 2131831091(0x7f112933, float:1.9295198E38)
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]
            xz1.a r9 = r6.f198379B
            java.lang.String r9 = r9.field_creator
            java.lang.CharSequence r9 = r6.mo95045O7(r9, r2)
            r8[r1] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = ""
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8[r2] = r9
            java.lang.String r4 = r6.getString(r4, r8)
            r3.setText(r4)
            xz1.a r3 = r6.f198379B
            java.lang.String r3 = r3.f232001H
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r4 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            if (r3 != 0) goto L_0x01f1
            xz1.a r3 = r6.f198379B
            int r9 = r3.f232005L
            if (r9 != r2) goto L_0x01f1
            java.lang.String r3 = r3.f232001H
            if (r3 == 0) goto L_0x01d3
            int r9 = wz1.C78747b.m95125y(r3)
            int r10 = wz1.C78747b.m95121u()
            int r10 = r10 * 2
            if (r9 <= r10) goto L_0x01d3
            int r9 = wz1.C78747b.m95121u()
            int r9 = r9 * 2
            int r9 = wz1.C78747b.m95112l(r3, r9)
            java.lang.String r3 = r3.substring(r1, r9)
            xz1.a r9 = r6.f198379B
            r9.f232001H = r3
        L_0x01d3:
            di3.d r9 = di3.C86312j.m106911c(r7)
            ny.h r9 = (p629ny.C76979h) r9
            com.tencent.mm.ui.widget.MMEditText r10 = r6.f198401h
            android.content.Context r10 = r10.getContext()
            com.tencent.mm.ui.widget.MMEditText r11 = r6.f198401h
            float r11 = r11.getTextSize()
            int r11 = (int) r11
            float r11 = (float) r11
            android.text.SpannableString r3 = r9.Eb0(r10, r3, r11, r2)
            com.tencent.mm.ui.widget.MMEditText r9 = r6.f198401h
            r9.setText(r3)
            goto L_0x0248
        L_0x01f1:
            boolean r3 = r6.f198383F
            if (r3 != 0) goto L_0x0240
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            r3.setVisibility(r4)
            android.view.View r3 = r6.f198402i
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r15.mo10233c(r9)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI"
            java.lang.String r12 = "initTitleAndTail"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r9 = r3
            r5 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI"
            java.lang.String r11 = "initTitleAndTail"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0248
        L_0x0240:
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            r5 = 2131831090(0x7f112932, float:1.9295196E38)
            r3.setHint(r5)
        L_0x0248:
            boolean r3 = r6.f198383F
            if (r3 == 0) goto L_0x0282
            xz1.a r3 = r6.f198379B
            java.lang.String r3 = r3.f232001H
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0282
            xz1.a r3 = r6.f198379B
            int r5 = r3.f232005L
            if (r5 != 0) goto L_0x0282
            r3.f232005L = r2
            r3.f232001H = r0
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r3.f232007N
            int r3 = r3.size()
            if (r3 < r2) goto L_0x0282
            xz1.a r3 = r6.f198379B
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r3.f232007N
            java.lang.Object r3 = r3.get(r8)
            xz1.b r3 = (xz1.C79014b) r3
            int r3 = r3.f232011b
            if (r3 != r2) goto L_0x0282
            xz1.a r3 = r6.f198379B
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r3.f232007N
            java.lang.Object r3 = r3.get(r8)
            xz1.b r3 = (xz1.C79014b) r3
            r3.f232011b = r1
        L_0x0282:
            xz1.a r3 = r6.f198379B
            java.lang.String r3 = r3.f232003J
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x02ae
            di3.d r3 = di3.C86312j.m106911c(r7)
            ny.h r3 = (p629ny.C76979h) r3
            com.tencent.mm.ui.widget.MMEditText r4 = r6.f198406p
            android.content.Context r4 = r4.getContext()
            xz1.a r5 = r6.f198379B
            java.lang.String r5 = r5.f232003J
            com.tencent.mm.ui.widget.MMEditText r9 = r6.f198406p
            float r9 = r9.getTextSize()
            int r9 = (int) r9
            float r9 = (float) r9
            android.text.SpannableString r3 = r3.Eb0(r4, r5, r9, r2)
            com.tencent.mm.ui.widget.MMEditText r4 = r6.f198406p
            r4.setText(r3)
            goto L_0x02c0
        L_0x02ae:
            boolean r3 = r6.f198383F
            if (r3 != 0) goto L_0x02b8
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198406p
            r3.setVisibility(r4)
            goto L_0x02c0
        L_0x02b8:
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198406p
            r4 = 2131831082(0x7f11292a, float:1.929518E38)
            r3.setHint(r4)
        L_0x02c0:
            boolean r3 = r6.f198383F
            r4 = 0
            r5 = 10
            if (r3 == 0) goto L_0x0320
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            r3.setFocusable(r2)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            r3.setFocusableInTouchMode(r2)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            r3.requestFocus()
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            android.view.View$OnTouchListener r9 = r6.f198396T
            r3.setOnTouchListener(r9)
            xz1.a r3 = r6.f198379B
            java.lang.String r3 = r3.f232001H
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x02f6
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            androidx.appcompat.app.AppCompatActivity r9 = r18.getContext()
            r10 = 160(0xa0, float:2.24E-43)
            int r9 = kg3.C76577a.m92151b(r9, r10)
            r3.setHeight(r9)
        L_0x02f6:
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            android.text.TextWatcher r9 = r6.f198395S
            r3.addTextChangedListener(r9)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            r3.setMaxLines(r5)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198406p
            r3.setFocusable(r2)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198406p
            r3.setFocusableInTouchMode(r2)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198406p
            android.text.TextWatcher r9 = r6.f198395S
            r3.addTextChangedListener(r9)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198406p
            android.view.View$OnTouchListener r9 = r6.f198396T
            r3.setOnTouchListener(r9)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198406p
            r3.setMaxLines(r5)
            goto L_0x0334
        L_0x0320:
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            r3.setKeyListener(r4)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            r3.setTextIsSelectable(r2)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198406p
            r3.setKeyListener(r4)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198406p
            r3.setTextIsSelectable(r2)
        L_0x0334:
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198401h
            r9 = 2131305764(0x7f092524, float:1.8229708E38)
            r3.setTag(r9, r8)
            com.tencent.mm.ui.widget.MMEditText r3 = r6.f198406p
            r8 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r3.setTag(r9, r10)
            xz1.a r3 = r6.f198379B
            java.lang.String r3 = r3.f232002I
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r10 = 2131099710(0x7f06003e, float:1.781178E38)
            r11 = 2131495933(0x7f0c0bfd, float:1.8615417E38)
            r12 = 2131305758(0x7f09251e, float:1.8229696E38)
            r13 = 2131305757(0x7f09251d, float:1.8229694E38)
            if (r3 == 0) goto L_0x0362
            boolean r3 = r6.f198383F
            if (r3 != 0) goto L_0x0362
            goto L_0x03e5
        L_0x0362:
            android.view.LayoutInflater r3 = r18.getLayoutInflater()
            android.view.View r3 = r3.inflate(r11, r4)
            android.view.View r14 = r3.findViewById(r12)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r15 = 2131831072(0x7f112920, float:1.929516E38)
            java.lang.String r15 = r6.getString(r15)
            r14.setText(r15)
            android.view.View r14 = r3.findViewById(r13)
            com.tencent.mm.ui.widget.MMEditText r14 = (com.tencent.p014mm.p136ui.widget.MMEditText) r14
            r15 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r14.setTag(r9, r8)
            xz1.a r8 = r6.f198379B
            java.lang.String r8 = r8.f232002I
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x03af
            di3.d r8 = di3.C86312j.m106911c(r7)
            ny.h r8 = (p629ny.C76979h) r8
            android.content.Context r15 = r14.getContext()
            xz1.a r9 = r6.f198379B
            java.lang.String r9 = r9.f232002I
            float r13 = r14.getTextSize()
            int r13 = (int) r13
            android.text.SpannableString r8 = r8.op0(r15, r9, r13)
            r14.setText(r8)
            r6.f198415y = r1
            goto L_0x03b7
        L_0x03af:
            r8 = 2131831071(0x7f11291f, float:1.9295157E38)
            r14.setHint(r8)
            r6.f198415y = r2
        L_0x03b7:
            boolean r8 = r6.f198383F
            if (r8 == 0) goto L_0x03c7
            r14.setFocusable(r2)
            r14.setFocusableInTouchMode(r2)
            android.text.TextWatcher r8 = r6.f198395S
            r14.addTextChangedListener(r8)
            goto L_0x03d8
        L_0x03c7:
            android.content.res.Resources r8 = r18.getResources()
            int r8 = r8.getColor(r10)
            r14.setTextColor(r8)
            r14.setKeyListener(r4)
            r14.setTextIsSelectable(r2)
        L_0x03d8:
            android.view.View$OnTouchListener r8 = r6.f198396T
            r14.setOnTouchListener(r8)
            r14.setMaxLines(r5)
            android.widget.LinearLayout r8 = r6.f198404n
            r8.addView(r3)
        L_0x03e5:
            r3 = 1
            r8 = 1
        L_0x03e7:
            xz1.a r9 = r6.f198379B
            java.util.HashMap<java.lang.Integer, xz1.b> r9 = r9.f232007N
            int r9 = r9.size()
            r13 = 3
            if (r3 > r9) goto L_0x04c5
            xz1.a r9 = r6.f198379B
            java.util.HashMap<java.lang.Integer, xz1.b> r9 = r9.f232007N
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            java.lang.Object r9 = r9.get(r14)
            xz1.b r9 = (xz1.C79014b) r9
            if (r9 != 0) goto L_0x0404
            goto L_0x04bb
        L_0x0404:
            android.view.LayoutInflater r14 = r18.getLayoutInflater()
            android.view.View r14 = r14.inflate(r11, r4)
            android.view.View r15 = r14.findViewById(r12)
            android.widget.TextView r15 = (android.widget.TextView) r15
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r15.setText(r11)
            r11 = 2131305757(0x7f09251d, float:1.8229694E38)
            android.view.View r15 = r14.findViewById(r11)
            com.tencent.mm.ui.widget.MMEditText r15 = (com.tencent.p014mm.p136ui.widget.MMEditText) r15
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11 = 2131305764(0x7f092524, float:1.8229708E38)
            r15.setTag(r11, r13)
            r13 = 2131305762(0x7f092522, float:1.8229704E38)
            r15.setTag(r13, r9)
            di3.d r13 = di3.C86312j.m106911c(r7)
            ny.h r13 = (p629ny.C76979h) r13
            android.content.Context r11 = r15.getContext()
            java.lang.String r12 = r9.f232014e
            float r5 = r15.getTextSize()
            int r5 = (int) r5
            android.text.SpannableString r5 = r13.op0(r11, r12, r5)
            r15.setText(r5)
            java.lang.String r5 = r9.f232010a
            java.lang.String r11 = eb0.C75592q0.m90789s()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r11)
            if (r5 == 0) goto L_0x0464
            r6.f198389L = r2
            goto L_0x0466
        L_0x0464:
            r6.f198389L = r1
        L_0x0466:
            java.lang.String r5 = r9.f232010a
            java.lang.String r9 = eb0.C75592q0.m90789s()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r9)
            if (r5 == 0) goto L_0x048c
            boolean r5 = r6.f198386I
            if (r5 != 0) goto L_0x048c
            r15.requestFocus()
            r15.setFocusable(r2)
            r15.setFocusableInTouchMode(r2)
            android.text.TextWatcher r5 = r6.f198395S
            r15.addTextChangedListener(r5)
            int r5 = r6.f198385H
            if (r5 != r2) goto L_0x049d
            r15.setCursorVisible(r1)
            goto L_0x049d
        L_0x048c:
            android.content.res.Resources r5 = r18.getResources()
            int r5 = r5.getColor(r10)
            r15.setTextColor(r5)
            r15.setKeyListener(r4)
            r15.setTextIsSelectable(r2)
        L_0x049d:
            android.view.View$OnTouchListener r5 = r6.f198396T
            r15.setOnTouchListener(r5)
            r5 = 10
            r15.setMaxLines(r5)
            android.widget.LinearLayout r9 = r6.f198404n
            r9.addView(r14)
            java.util.ArrayList<android.view.View> r9 = r6.f198390M
            r9.add(r14)
            yz1.p r9 = new yz1.p
            r9.<init>(r6, r15)
            r15.setOnFocusChangeListener(r9)
            int r8 = r8 + 1
        L_0x04bb:
            int r3 = r3 + 1
            r11 = 2131495933(0x7f0c0bfd, float:1.8615417E38)
            r12 = 2131305758(0x7f09251e, float:1.8229696E38)
            goto L_0x03e7
        L_0x04c5:
            r6.mo95049S7(r1)
            xz1.a r0 = r6.f198379B
            java.util.HashMap<java.lang.Integer, xz1.b> r0 = r0.f232007N
            int r0 = r0.size()
            int r3 = wz1.C78747b.m95123w()
            if (r0 < r3) goto L_0x04d7
            goto L_0x04e1
        L_0x04d7:
            android.widget.ImageButton r0 = r6.f198405o
            yz1.m r3 = new yz1.m
            r3.<init>(r6)
            r0.setOnClickListener(r3)
        L_0x04e1:
            int r0 = r6.f198385H
            r3 = 5
            r4 = 2
            if (r0 == r4) goto L_0x0508
            if (r0 == r13) goto L_0x04ef
            r4 = 4
            if (r0 != r4) goto L_0x04ed
            goto L_0x04ef
        L_0x04ed:
            r4 = 0
            goto L_0x04f0
        L_0x04ef:
            r4 = 1
        L_0x04f0:
            if (r4 == 0) goto L_0x04f8
            xz1.a r4 = r6.f198379B
            int r4 = r4.f232009Q
            if (r4 > 0) goto L_0x0508
        L_0x04f8:
            if (r0 != r3) goto L_0x04fb
            goto L_0x0508
        L_0x04fb:
            if (r0 != r2) goto L_0x051e
            android.widget.ScrollView r0 = r6.f198398e
            com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$o r1 = new com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI$o
            r1.<init>()
            r0.post(r1)
            goto L_0x051e
        L_0x0508:
            r6.mo95041K7(r2)
            boolean r0 = r6.f198383F
            if (r0 == 0) goto L_0x051e
            int r0 = r6.f198385H
            r4 = 4
            if (r0 == r4) goto L_0x0516
            if (r0 != r3) goto L_0x0517
        L_0x0516:
            r1 = 1
        L_0x0517:
            if (r1 == 0) goto L_0x051e
            com.tencent.mm.ui.widget.MMEditText r0 = r6.f198401h
            r0.requestFocus()
        L_0x051e:
            boolean r0 = r6.f198383F
            if (r0 == 0) goto L_0x052a
            xz1.a r0 = r6.f198379B
            xz1.a r0 = r0.clone()
            r6.f198380C = r0
        L_0x052a:
            r18.mo95047Q7()
            r6.mo95050T7(r2)
            com.tencent.mm.ui.widget.MMEditText r0 = r6.f198406p
            yz1.p r1 = new yz1.p
            r1.<init>(r6, r0)
            r0.setOnFocusChangeListener(r1)
            com.tencent.mm.ui.widget.MMEditText r0 = r6.f198401h
            yz1.p r1 = new yz1.p
            r1.<init>(r6, r0)
            r0.setOnFocusChangeListener(r1)
            android.view.GestureDetector r0 = new android.view.GestureDetector
            yz1.q r1 = new yz1.q
            r1.<init>(r6)
            r0.<init>(r6, r1)
            r6.f198413w = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f198392P = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f198393Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI.initView():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((MMEditText) this.f198412v).requestFocus();
        Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onActivityResult reqCode: %d, retCod: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1) {
            if (i == 4097) {
                String nullAs = Util.nullAs(intent.getStringExtra("Kwebmap_locaion"), "");
                String stringExtra = intent.getStringExtra("kPoiName");
                Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "REQUEST_CODE_POST_LOC address: %s, poiName：%s", nullAs, stringExtra);
                if (nullAs.contains(getString(C0966R.string.ff4))) {
                    nullAs = nullAs.substring(nullAs.indexOf(getString(C0966R.string.ff4)) + 1);
                }
                mo95040H7(stringExtra + "(" + nullAs + ")");
                mo95042L7(3);
            } else if (i == 4098) {
                Log.m105924i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "REQUEST_CODE_POST_CONTACT");
                C79188f fVar = this.f198394R;
                if (fVar != null) {
                    fVar.mo109202a();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            java.lang.Class<sz1.b> r9 = sz1.C77815b.class
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "key_group_solitatire_create"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r8.f198383F = r0
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "key_group_solitatire_key"
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r3 = "key_group_solitatire_chatroom_username"
            java.lang.String r1 = r1.getStringExtra(r3)
            r8.f198381D = r1
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r3 = "key_group_solitatire_scene"
            r4 = 3
            int r1 = r1.getIntExtra(r3, r4)
            r8.f198385H = r1
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r3 = "KEY_GROUP_SOLITATIRE_READ_ONLY"
            boolean r1 = r1.getBooleanExtra(r3, r2)
            r8.f198386I = r1
            int r1 = r8.f198385H
            r3 = 1
            if (r1 == r4) goto L_0x0064
            r4 = 4
            if (r1 == r4) goto L_0x004f
            r4 = 5
            if (r1 != r4) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r1 = 0
            goto L_0x0050
        L_0x004f:
            r1 = 1
        L_0x0050:
            if (r1 == 0) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            di3.d r1 = di3.C86312j.m106911c(r9)
            sz1.b r1 = (sz1.C77815b) r1
            wz1.c r1 = r1.vx0()
            java.lang.String r4 = r8.f198381D
            xz1.a r1 = r1.mo108668f(r4, r0)
            goto L_0x0098
        L_0x0064:
            di3.d r1 = di3.C86312j.m106911c(r9)
            sz1.b r1 = (sz1.C77815b) r1
            wz1.c r1 = r1.vx0()
            java.lang.String r4 = r8.f198381D
            r1.getClass()
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r4
            r5[r3] = r0
            java.lang.String r6 = "MicroMsg.groupsolitaire.GroupSolitatireManager"
            java.lang.String r7 = "getTempGroupSolitatireFromCache() username:%s key:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, xz1.a> r1 = r1.f230462d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r0)
            java.lang.String r4 = r5.toString()
            java.lang.Object r1 = r1.get(r4)
            xz1.a r1 = (xz1.C79013a) r1
        L_0x0098:
            java.lang.String r4 = "MicroMsg.groupsolitaire.GroupSolitatireEditUI"
            if (r1 != 0) goto L_0x00a9
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r2] = r0
            java.lang.String r0 = "initData() key:%s temp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r9)
            r8.finish()
            goto L_0x00ee
        L_0x00a9:
            xz1.a r1 = r1.clone()
            r8.f198379B = r1
            if (r1 != 0) goto L_0x00be
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r2] = r0
            java.lang.String r0 = "initData() key:%s mGroupSolitatire == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r9)
            r8.finish()
            goto L_0x00ee
        L_0x00be:
            di3.d r9 = di3.C86312j.m106911c(r9)
            sz1.b r9 = (sz1.C77815b) r9
            wz1.c r9 = r9.vx0()
            java.lang.String r0 = r8.f198381D
            xz1.a r1 = r8.f198379B
            java.lang.String r1 = r1.field_key
            xz1.a r9 = r9.mo108668f(r0, r1)
            r8.f198380C = r9
            java.lang.Class<a11.c> r9 = a11.C39479c.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            a11.c r9 = (a11.C39479c) r9
            eb0.m2 r9 = r9.mo62084mr()
            java.lang.String r0 = r8.f198381D
            com.tencent.mm.storage.n1 r9 = (com.tencent.p014mm.storage.C44662n1) r9
            com.tencent.mm.storage.m1 r9 = r9.mo69799Lo(r0)
            r8.f198382E = r9
            r8.setResult(r2)
            r2 = 1
        L_0x00ee:
            if (r2 != 0) goto L_0x00f1
            return
        L_0x00f1:
            r8.initView()
            android.content.res.Resources r9 = r8.getResources()
            r0 = 2131101833(0x7f060889, float:1.7816087E38)
            int r9 = r9.getColor(r0)
            r8.setNavigationbarColor(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        if (this.f198384G) {
            return true;
        }
        mo95046P7();
        return true;
    }

    public void onPause() {
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f198414x;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log.m105924i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onRequestPermissionsResult");
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                Log.m105924i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onRequestPermissionsResult OK");
                mo95048R7();
                return;
            }
            Log.m105924i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "onRequestPermissionsResult failed");
            C76879j.m92709C(getContext(), getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.hht), false, new C69032k(), (DialogInterface.OnClickListener) null);
        }
    }

    public void onResume() {
        super.onResume();
        this.f198398e.post(new C69025d());
        int i = this.f198385H;
        if (i != 2) {
            if (!(i == 3 || i == 4) && i != 5) {
                return;
            }
        }
        this.f198404n.postDelayed(new C69026e(), 200);
    }
}
