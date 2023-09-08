package com.tencent.p014mm.plugin.setting.p102ui.setting;

import an2.C0105c;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import qo3.C89779i0;
import te3.C49536ga2;
import te3.ck4;
import xm2.C15859h;
import xm2.C15861n;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI */
public class SettingsTrustFriendUI extends MMActivity implements C11385n {

    /* renamed from: n */
    public static int f20942n = 5;

    /* renamed from: d */
    public List<String> f20943d;

    /* renamed from: e */
    public GridView f20944e;

    /* renamed from: f */
    public C5332k f20945f;

    /* renamed from: g */
    public TextView f20946g;

    /* renamed from: h */
    public View f20947h;

    /* renamed from: i */
    public boolean f20948i;

    /* renamed from: j */
    public C89779i0 f20949j;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$a */
    public class C5322a implements DialogInterface.OnClickListener {
        public C5322a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SettingsTrustFriendUI.m5274H7(SettingsTrustFriendUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$b */
    public class C5323b implements DialogInterface.OnClickListener {
        public C5323b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SettingsTrustFriendUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$c */
    public class C5324c implements Runnable {
        public C5324c() {
        }

        public void run() {
            SettingsTrustFriendUI settingsTrustFriendUI = SettingsTrustFriendUI.this;
            int i = SettingsTrustFriendUI.f20942n;
            settingsTrustFriendUI.getClass();
            C15861n nVar = new C15861n();
            C86709a0.m107524d().mo123460f(nVar);
            settingsTrustFriendUI.f20949j = C76879j.m92723Q(settingsTrustFriendUI, settingsTrustFriendUI.getString(C0966R.string.f7961xj), settingsTrustFriendUI.getString(C0966R.string.gas), false, true, new C5379n3(settingsTrustFriendUI, nVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$d */
    public class C5325d implements View.OnClickListener {
        public C5325d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsTrustFriendUI settingsTrustFriendUI = SettingsTrustFriendUI.this;
            if (settingsTrustFriendUI.f20948i) {
                settingsTrustFriendUI.f20948i = false;
                settingsTrustFriendUI.f20945f.notifyDataSetChanged();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$e */
    public class C5326e implements View.OnTouchListener {
        public C5326e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (SettingsTrustFriendUI.this.f20948i && motionEvent.getAction() == 1 && SettingsTrustFriendUI.this.f20944e.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY()) == -1) {
                SettingsTrustFriendUI settingsTrustFriendUI = SettingsTrustFriendUI.this;
                settingsTrustFriendUI.f20948i = false;
                settingsTrustFriendUI.f20945f.notifyDataSetChanged();
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$f */
    public class C5327f implements AdapterView.OnItemClickListener {
        public C5327f() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (SettingsTrustFriendUI.this.f20945f.getItemViewType(i) == 1) {
                Intent intent = new Intent();
                intent.putExtra("list_type", 12);
                intent.putExtra("titile", SettingsTrustFriendUI.this.getString(C0966R.string.f7496hv));
                intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
                intent.putExtra("max_limit_num", SettingsTrustFriendUI.f20942n);
                intent.putExtra("stay_in_wechat", true);
                intent.putExtra("already_select_contact", Util.listToString(SettingsTrustFriendUI.this.f20943d, ","));
                intent.putExtra("block_contact", C75592q0.m90789s());
                C74560s1.m89276e();
                intent.putExtra("list_attr", C74560s1.f219167h & -257 & -16777217);
                intent.putExtra("KBlockOpenImFav", true);
                intent.putExtra("without_openim", true);
                intent.putExtra("too_many_member_tip_string", SettingsTrustFriendUI.this.getString(C0966R.string.f361338j12, new Object[]{Integer.valueOf(SettingsTrustFriendUI.f20942n)}));
                C88144b.m109802t(SettingsTrustFriendUI.this, ".ui.contact.SelectContactUI", intent, 1);
            } else if (SettingsTrustFriendUI.this.f20945f.getItemViewType(i) == 2) {
                SettingsTrustFriendUI settingsTrustFriendUI = SettingsTrustFriendUI.this;
                if (!settingsTrustFriendUI.f20948i) {
                    settingsTrustFriendUI.f20948i = true;
                    settingsTrustFriendUI.f20945f.notifyDataSetChanged();
                }
            } else if (SettingsTrustFriendUI.this.f20945f.getItemViewType(i) == 0) {
                SettingsTrustFriendUI settingsTrustFriendUI2 = SettingsTrustFriendUI.this;
                if (settingsTrustFriendUI2.f20948i) {
                    settingsTrustFriendUI2.f20943d.remove(settingsTrustFriendUI2.f20945f.getItem(i));
                    if (SettingsTrustFriendUI.this.f20943d.size() == 0) {
                        SettingsTrustFriendUI.this.f20948i = false;
                    }
                    SettingsTrustFriendUI.this.f20945f.notifyDataSetChanged();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$g */
    public class C5328g implements View.OnClickListener {
        public C5328g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = SettingsTrustFriendUI.this.f20947h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$h */
    public class C5329h implements View.OnClickListener {
        public C5329h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmo) + "/security/readtemplate?t=w_security_center_website/trusted_friend_guide");
            C88144b.m109791i(SettingsTrustFriendUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$i */
    public class C5330i implements MenuItem.OnMenuItemClickListener {
        public C5330i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsTrustFriendUI settingsTrustFriendUI = SettingsTrustFriendUI.this;
            int i = SettingsTrustFriendUI.f20942n;
            settingsTrustFriendUI.mo6297I7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$j */
    public class C5331j implements MenuItem.OnMenuItemClickListener {
        public C5331j() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsTrustFriendUI.m5274H7(SettingsTrustFriendUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$k */
    public class C5332k extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$k$a */
        public class C5333a {

            /* renamed from: a */
            public ImageView f20961a;

            /* renamed from: b */
            public ImageView f20962b;

            /* renamed from: c */
            public TextView f20963c;

            public C5333a(C5332k kVar, C5324c cVar) {
            }
        }

        public C5332k(C5324c cVar) {
        }

        public int getCount() {
            int size = SettingsTrustFriendUI.this.f20943d.size();
            if (SettingsTrustFriendUI.this.f20948i) {
                return size;
            }
            if (size == 0) {
                return 1;
            }
            if (size > 0 && size < SettingsTrustFriendUI.f20942n) {
                return size + 2;
            }
            if (size >= SettingsTrustFriendUI.f20942n) {
                return size + 1;
            }
            return 0;
        }

        public Object getItem(int i) {
            if (getItemViewType(i) == 0) {
                return SettingsTrustFriendUI.this.f20943d.get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            int size = SettingsTrustFriendUI.this.f20943d.size();
            if (SettingsTrustFriendUI.this.f20948i || i < size) {
                return 0;
            }
            if (size == 0) {
                return 1;
            }
            if (size >= SettingsTrustFriendUI.f20942n) {
                return 2;
            }
            if (i == size) {
                return 1;
            }
            return i == size + 1 ? 2 : -1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$k$a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
            /*
                r6 = this;
                if (r8 != 0) goto L_0x003a
                com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI r8 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsTrustFriendUI.this
                android.view.LayoutInflater r8 = r8.getLayoutInflater()
                r9 = 2131497465(0x7f0c11f9, float:1.8618524E38)
                r0 = 0
                android.view.View r8 = r8.inflate(r9, r0)
                r9 = 2131315627(0x7f094bab, float:1.8249713E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.ImageView r9 = (android.widget.ImageView) r9
                r1 = 2131315628(0x7f094bac, float:1.8249715E38)
                android.view.View r1 = r8.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r2 = 2131315632(0x7f094bb0, float:1.8249723E38)
                android.view.View r2 = r8.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$k$a r3 = new com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$k$a
                r3.<init>(r6, r0)
                r3.f20961a = r9
                r3.f20962b = r1
                r3.f20963c = r2
                r8.setTag(r3)
                goto L_0x0041
            L_0x003a:
                java.lang.Object r9 = r8.getTag()
                r3 = r9
                com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI$k$a r3 = (com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsTrustFriendUI.C5332k.C5333a) r3
            L_0x0041:
                int r9 = r6.getItemViewType(r7)
                r0 = 8
                if (r9 != 0) goto L_0x00a7
                com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI r9 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsTrustFriendUI.this
                java.util.List<java.lang.String> r9 = r9.f20943d
                java.lang.Object r9 = r9.get(r7)
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Class<f62.k0> r1 = f62.C75700k0.class
                k40.a r1 = f40.C86709a0.m107533q(r1)
                f62.k0 r1 = (f62.C75700k0) r1
                com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
                com.tencent.mm.storage.z1 r1 = r1.get(r9)
                android.widget.ImageView r2 = r3.f20961a
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_XY
                r2.setScaleType(r4)
                java.lang.Class<ln.f> r2 = p196ln.C76705f.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ln.f r2 = (p196ln.C76705f) r2
                android.widget.ImageView r4 = r3.f20961a
                r2.mo106849z(r4, r9)
                android.widget.TextView r9 = r3.f20963c
                java.lang.Class<ny.h> r2 = p629ny.C76979h.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ny.h r2 = (p629ny.C76979h) r2
                com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI r4 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsTrustFriendUI.this
                java.lang.String r1 = r1.mo62898f()
                android.widget.TextView r5 = r3.f20963c
                float r5 = r5.getTextSize()
                android.text.SpannableString r1 = r2.yp0(r4, r1, r5)
                r9.setText(r1)
                com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI r9 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsTrustFriendUI.this
                boolean r9 = r9.f20948i
                if (r9 == 0) goto L_0x00a1
                android.widget.ImageView r9 = r3.f20962b
                r0 = 0
                r9.setVisibility(r0)
                goto L_0x00d8
            L_0x00a1:
                android.widget.ImageView r9 = r3.f20962b
                r9.setVisibility(r0)
                goto L_0x00d8
            L_0x00a7:
                android.widget.TextView r9 = r3.f20963c
                r1 = 4
                r9.setVisibility(r1)
                android.widget.ImageView r9 = r3.f20962b
                r9.setVisibility(r0)
                android.widget.ImageView r9 = r3.f20961a
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
                r9.setScaleType(r0)
                int r9 = r6.getItemViewType(r7)
                r0 = 1
                if (r9 != r0) goto L_0x00c9
                android.widget.ImageView r9 = r3.f20961a
                r0 = 2131231180(0x7f0801cc, float:1.8078434E38)
                r9.setImageResource(r0)
                goto L_0x00d8
            L_0x00c9:
                int r9 = r6.getItemViewType(r7)
                r0 = 2
                if (r9 != r0) goto L_0x00d8
                android.widget.ImageView r9 = r3.f20961a
                r0 = 2131231181(0x7f0801cd, float:1.8078436E38)
                r9.setImageResource(r0)
            L_0x00d8:
                android.widget.ImageView r9 = r3.f20961a
                r0 = 2131313254(0x7f094266, float:1.82449E38)
                int r7 = r6.getItemViewType(r7)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r9.setTag(r0, r7)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsTrustFriendUI.C5332k.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: H7 */
    public static void m5274H7(SettingsTrustFriendUI settingsTrustFriendUI) {
        if (settingsTrustFriendUI.f20943d.size() <= 0 || settingsTrustFriendUI.f20943d.size() >= 3) {
            C15859h hVar = new C15859h(settingsTrustFriendUI.f20943d);
            C86709a0.m107524d().mo123460f(hVar);
            C89779i0 i0Var = settingsTrustFriendUI.f20949j;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            settingsTrustFriendUI.f20949j = C76879j.m92723Q(settingsTrustFriendUI, settingsTrustFriendUI.getString(C0966R.string.f7961xj), settingsTrustFriendUI.getString(C0966R.string.a2w), false, true, new C5374m3(settingsTrustFriendUI, hVar));
            return;
        }
        C76879j.m92748s(settingsTrustFriendUI, settingsTrustFriendUI.getString(C0966R.string.f361339j13, new Object[]{3}), settingsTrustFriendUI.getString(C0966R.string.a3h));
    }

    /* renamed from: I7 */
    public final void mo6297I7() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(352277, (Object) null);
        ArrayList<String> arrayList = new ArrayList<>();
        if (!Util.isNullOrNil(str)) {
            arrayList = Util.stringsToList(str.split(","));
        }
        if (this.f20943d.size() != arrayList.size() || !this.f20943d.containsAll(arrayList)) {
            C76879j.m92709C(this, getString(C0966R.string.ian), getString(C0966R.string.a3h), getString(C0966R.string.a2n), getString(C0966R.string.a15), true, new C5322a(), new C5323b());
            return;
        }
        finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.by7;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f361336j10);
        this.f20944e = (GridView) findViewById(C0966R.C0970id.kuh);
        this.f20945f = new C5332k((C5324c) null);
        this.f20944e.setColumnWidth(getResources().getDimensionPixelSize(C0966R.dimen.f3921j0));
        this.f20944e.setNumColumns(-1);
        this.f20944e.setStretchMode(1);
        this.f20944e.setHorizontalSpacing(getResources().getDimensionPixelSize(C0966R.dimen.aaw) * 2);
        this.f20944e.setVerticalSpacing(getResources().getDimensionPixelSize(C0966R.dimen.aax));
        this.f20944e.setAdapter(this.f20945f);
        ((ViewGroup) this.f20944e.getParent()).setOnClickListener(new C5325d());
        this.f20944e.setOnTouchListener(new C5326e());
        this.f20944e.setHorizontalScrollBarEnabled(false);
        this.f20944e.setVerticalScrollBarEnabled(false);
        this.f20944e.setOnItemClickListener(new C5327f());
        this.f20946g = (TextView) findViewById(C0966R.C0970id.kug);
        String stringExtra = getIntent().getStringExtra("trust_friend_show_tips");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f20946g.setText(stringExtra);
        } else {
            this.f20946g.setText(getResources().getString(C0966R.string.f361340j14, new Object[]{3}));
        }
        View findViewById = findViewById(C0966R.C0970id.kuk);
        this.f20947h = findViewById;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) this.f20947h.findViewById(C0966R.C0970id.lki)).setText(getString(C0966R.string.f361339j13, new Object[]{3}));
        this.f20947h.findViewById(C0966R.C0970id.bem).setOnClickListener(new C5328g());
        findViewById(C0966R.C0970id.kui).setOnClickListener(new C5329h());
        setBackBtn(new C5330i());
        addTextOptionMenu(1, getString(C0966R.string.f8014z_), new C5331j(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        showOptionMenu(true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            if (!Util.isNullOrNil(stringExtra)) {
                this.f20943d.clear();
                this.f20943d.addAll(Util.stringsToList(stringExtra.split(",")));
                this.f20945f.notifyDataSetChanged();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(352277, (Object) null);
        if (!Util.isNullOrNil(str)) {
            this.f20943d = Util.stringsToList(str.split(","));
        }
        if (this.f20943d == null) {
            this.f20943d = new ArrayList();
        }
        getContentView().post(new C5324c());
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        mo6297I7();
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = str;
        boolean z = true;
        Log.m105919d("MicroMsg.SettingsTrustFriendUI", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str2);
        C89779i0 i0Var = this.f20949j;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (i == 0 && i2 == 0) {
            if (yVar.getType() == 869) {
                C49536ga2 ga22 = (C49536ga2) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
                f20942n = ga22.f133945e;
                LinkedList<ck4> linkedList = ga22.f133944d;
                if (linkedList.size() == this.f20943d.size()) {
                    if (linkedList.size() != 0) {
                        Iterator<ck4> it = linkedList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!this.f20943d.contains(it.next().f131801d)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    this.f20943d.clear();
                    for (ck4 ck4 : linkedList) {
                        this.f20943d.add(ck4.f131801d);
                    }
                    this.f20945f.notifyDataSetChanged();
                }
                if (this.f20943d.size() > 0 && this.f20943d.size() < 3) {
                    View view = this.f20947h;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C86709a0.m107535s().mo121142i().mo119676J(352277, Util.listToString(this.f20943d, ","));
            } else if (yVar.getType() == 583) {
                C86709a0.m107535s().mo121142i().mo119676J(352277, Util.listToString(this.f20943d, ","));
                finish();
            }
        } else if (!Util.isNullOrNil(str)) {
            C76879j.m92726T(this, str2);
        }
    }

    public void onStart() {
        super.onStart();
        C86709a0.m107524d().mo123455a(869, this);
        C86709a0.m107524d().mo123455a(583, this);
    }

    public void onStop() {
        super.onStop();
        C86709a0.m107524d().mo123470p(869, this);
        C86709a0.m107524d().mo123470p(583, this);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C0105c.class);
    }
}
