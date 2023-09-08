package com.tencent.p014mm.p136ui.conversation;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import eb0.C97625j3;
import i61.C98602h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C11184p0;
import uo3.C78253a;
import z51.C39315g;

/* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI */
public class SettingCheckUnProcessWalletConvUI extends MMActivity {

    /* renamed from: d */
    public ListView f121896d;

    /* renamed from: e */
    public List<String> f121897e;

    /* renamed from: f */
    public C44944e f121898f;

    /* renamed from: g */
    public int[] f121899g = new int[2];

    /* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$a */
    public class C44937a implements MenuItem.OnMenuItemClickListener {
        public C44937a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingCheckUnProcessWalletConvUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$b */
    public class C44938b implements View.OnTouchListener {
        public C44938b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                SettingCheckUnProcessWalletConvUI.this.hideVKB();
                SettingCheckUnProcessWalletConvUI.this.f121899g[0] = (int) motionEvent.getRawX();
                SettingCheckUnProcessWalletConvUI.this.f121899g[1] = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$c */
    public class C44939c implements AdapterView.OnItemClickListener {
        public C44939c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C72976h2 d = SettingCheckUnProcessWalletConvUI.this.f121898f.getItem(i);
            if (d == null) {
                C117292a.m165361g(this, "com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("Chat_User", d.getUsername());
            intent.putExtra("chat_from_scene", 4);
            C88144b.m109801s(SettingCheckUnProcessWalletConvUI.this, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$d */
    public class C44940d implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$d$a */
        public class C44941a implements View.OnCreateContextMenuListener {
            public C44941a(C44940d dVar) {
            }

            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(0, 1, 0, C0966R.string.gm7);
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$d$b */
        public class C44942b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ String f121904d;

            /* renamed from: e */
            public final /* synthetic */ C72976h2 f121905e;

            /* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$d$b$a */
            public class C44943a implements Runnable {
                public C44943a() {
                }

                public void run() {
                    C44942b bVar = C44942b.this;
                    SettingCheckUnProcessWalletConvUI.this.f121897e.remove(bVar.f121904d);
                    SettingCheckUnProcessWalletConvUI.this.f121898f.notifyDataSetChanged();
                }
            }

            public C44942b(String str, C72976h2 h2Var) {
                this.f121904d = str;
                this.f121905e = h2Var;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() == 1) {
                    C44965d.m49844d(this.f121904d, SettingCheckUnProcessWalletConvUI.this, this.f121905e, true, new C44943a(), false, true);
                }
            }
        }

        public C44940d() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            SettingCheckUnProcessWalletConvUI settingCheckUnProcessWalletConvUI = SettingCheckUnProcessWalletConvUI.this;
            C72976h2 d = settingCheckUnProcessWalletConvUI.f121898f.getItem(i - settingCheckUnProcessWalletConvUI.f121896d.getHeaderViewsCount());
            if (d == null) {
                return true;
            }
            String username = d.getUsername();
            C78253a aVar = new C78253a(SettingCheckUnProcessWalletConvUI.this);
            aVar.f229249r = new C44941a(this);
            SettingCheckUnProcessWalletConvUI settingCheckUnProcessWalletConvUI2 = SettingCheckUnProcessWalletConvUI.this;
            C44942b bVar = new C44942b(username, d);
            int[] iArr = settingCheckUnProcessWalletConvUI2.f121899g;
            aVar.mo108272g(view, i, j, settingCheckUnProcessWalletConvUI2, bVar, iArr[0], iArr[1]);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e */
    public class C44944e extends BaseAdapter {

        /* renamed from: d */
        public final int f121908d;

        /* renamed from: e */
        public final int f121909e;

        /* renamed from: f */
        public ColorStateList[] f121910f;

        /* renamed from: g */
        public float f121911g = -1.0f;

        /* renamed from: h */
        public float f121912h = -1.0f;

        /* renamed from: i */
        public float f121913i = -1.0f;

        /* renamed from: j */
        public HashMap<String, C44945a> f121914j;

        /* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e$a */
        public class C44945a {

            /* renamed from: a */
            public CharSequence f121916a;

            /* renamed from: b */
            public CharSequence f121917b;

            /* renamed from: c */
            public CharSequence f121918c;

            /* renamed from: d */
            public int f121919d;

            /* renamed from: e */
            public int f121920e;

            /* renamed from: f */
            public boolean f121921f;

            /* renamed from: g */
            public boolean f121922g;

            /* renamed from: h */
            public boolean f121923h;

            /* renamed from: i */
            public boolean f121924i;

            public C44945a(C44944e eVar, C44937a aVar) {
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e$b */
        public class C44946b {

            /* renamed from: a */
            public ImageView f121925a;

            /* renamed from: b */
            public NoMeasuredTextView f121926b;

            /* renamed from: c */
            public NoMeasuredTextView f121927c;

            /* renamed from: d */
            public NoMeasuredTextView f121928d;

            /* renamed from: e */
            public NoMeasuredTextView f121929e;

            /* renamed from: f */
            public ImageView f121930f;

            /* renamed from: g */
            public ImageView f121931g;

            /* renamed from: h */
            public View f121932h;

            public C44946b(C44944e eVar, C44937a aVar) {
            }
        }

        public C44944e() {
            ColorStateList[] colorStateListArr = new ColorStateList[5];
            this.f121910f = colorStateListArr;
            colorStateListArr[0] = C76577a.m92154e(SettingCheckUnProcessWalletConvUI.this, C0966R.color.f3563xt);
            this.f121910f[1] = C76577a.m92154e(SettingCheckUnProcessWalletConvUI.this, C0966R.color.a4w);
            this.f121910f[3] = C76577a.m92154e(SettingCheckUnProcessWalletConvUI.this, C0966R.color.a7f);
            this.f121910f[2] = C76577a.m92154e(SettingCheckUnProcessWalletConvUI.this, C0966R.color.a4t);
            this.f121910f[2] = C76577a.m92154e(SettingCheckUnProcessWalletConvUI.this, C0966R.color.a4t);
            this.f121910f[4] = C76577a.m92154e(SettingCheckUnProcessWalletConvUI.this, C0966R.color.a1_);
            if (C76577a.m92147C(SettingCheckUnProcessWalletConvUI.this)) {
                this.f121909e = SettingCheckUnProcessWalletConvUI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3672b2);
                this.f121908d = SettingCheckUnProcessWalletConvUI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3674b4);
            } else {
                this.f121909e = SettingCheckUnProcessWalletConvUI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3671b1);
                this.f121908d = SettingCheckUnProcessWalletConvUI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3675b5);
            }
            this.f121911g = (float) C76577a.m92157h(SettingCheckUnProcessWalletConvUI.this, C0966R.dimen.f3927j7);
            this.f121912h = (float) C76577a.m92157h(SettingCheckUnProcessWalletConvUI.this, C0966R.dimen.f3881hq);
            this.f121913i = (float) C76577a.m92157h(SettingCheckUnProcessWalletConvUI.this, C0966R.dimen.f3964lm);
            this.f121914j = new HashMap<>();
        }

        /* renamed from: a */
        public final String mo70236a(String str) {
            if (str == null || str.length() != 32) {
                return null;
            }
            return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(str);
        }

        /* renamed from: b */
        public final CharSequence mo70237b(C72976h2 h2Var) {
            return h2Var.getStatus() == 1 ? SettingCheckUnProcessWalletConvUI.this.getString(C0966R.string.gmo) : h2Var.mo108821o2() == MAlarmHandler.NEXT_FIRE_INTERVAL ? "" : C72715f.m85112e(SettingCheckUnProcessWalletConvUI.this, h2Var.mo108821o2(), true);
        }

        /* renamed from: d */
        public C72976h2 getItem(int i) {
            return ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(SettingCheckUnProcessWalletConvUI.this.f121897e.get(i));
        }

        /* renamed from: f */
        public final int mo70239f(String str) {
            if (str == null || str.length() <= 0) {
                return 1;
            }
            try {
                return Integer.valueOf(str).intValue();
            } catch (NumberFormatException unused) {
                return 1;
            }
        }

        public int getCount() {
            return SettingCheckUnProcessWalletConvUI.this.f121897e.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.text.SpannableStringBuilder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: android.text.SpannableStringBuilder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: android.text.SpannableStringBuilder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: android.text.SpannableString} */
        /* JADX WARNING: type inference failed for: r1v58 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0405  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0415  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x047f  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x04ad  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x04e1  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x0540  */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x0549  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x01e9  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x02ef  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x033b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r22, android.view.View r23, android.view.ViewGroup r24) {
            /*
                r21 = this;
                r0 = r21
                java.lang.Class<ny.h> r1 = p629ny.C76979h.class
                java.lang.Class<ln.f> r2 = p196ln.C76705f.class
                java.lang.Class<d62.i> r3 = d62.C75339i.class
                r4 = 0
                r5 = 4
                r6 = 5
                r7 = 1
                r8 = 0
                r9 = 3
                if (r23 != 0) goto L_0x00fe
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e$b r10 = new com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e$b
                r10.<init>(r0, r4)
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r11 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                boolean r11 = kg3.C76577a.m92147C(r11)
                if (r11 == 0) goto L_0x0027
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r11 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                r12 = 2131493997(0x7f0c046d, float:1.861149E38)
                android.view.View r11 = android.view.View.inflate(r11, r12, r4)
                goto L_0x0030
            L_0x0027:
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r11 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                r12 = 2131493996(0x7f0c046c, float:1.8611488E38)
                android.view.View r11 = android.view.View.inflate(r11, r12, r4)
            L_0x0030:
                r12 = 2131297474(0x7f0904c2, float:1.8212894E38)
                android.view.View r12 = r11.findViewById(r12)
                android.widget.ImageView r12 = (android.widget.ImageView) r12
                r10.f121925a = r12
                r12 = 2131310284(0x7f0936cc, float:1.8238876E38)
                android.view.View r12 = r11.findViewById(r12)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r12
                r10.f121926b = r12
                r12 = 2131314218(0x7f09462a, float:1.8246855E38)
                android.view.View r12 = r11.findViewById(r12)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r12
                r10.f121927c = r12
                r12 = 2131315971(0x7f094d03, float:1.825041E38)
                android.view.View r12 = r11.findViewById(r12)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r12
                r10.f121928d = r12
                r12 = 2131306982(0x7f0929e6, float:1.8232178E38)
                android.view.View r12 = r11.findViewById(r12)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r12
                r10.f121929e = r12
                r12 = 2131315309(0x7f094a6d, float:1.8249068E38)
                android.view.View r12 = r11.findViewById(r12)
                android.widget.TextView r12 = (android.widget.TextView) r12
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r13 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                int r13 = com.tencent.p014mm.p136ui.tools.C45081s1.m49932a(r13)
                r12.setBackgroundResource(r13)
                r12 = 2131306321(0x7f092751, float:1.8230838E38)
                android.view.View r12 = r11.findViewById(r12)
                android.widget.ImageView r12 = (android.widget.ImageView) r12
                r10.f121930f = r12
                r12 = 2131297488(0x7f0904d0, float:1.8212922E38)
                android.view.View r12 = r11.findViewById(r12)
                r10.f121932h = r12
                r12 = 2131314937(0x7f0948f9, float:1.8248313E38)
                android.view.View r12 = r11.findViewById(r12)
                android.widget.ImageView r12 = (android.widget.ImageView) r12
                r10.f121931g = r12
                r12 = 2131308093(0x7f092e3d, float:1.8234432E38)
                android.view.View r12 = r11.findViewById(r12)
                android.widget.ImageView r12 = (android.widget.ImageView) r12
                r11.setTag(r10)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121929e
                float r13 = r0.f121912h
                r12.mo153549i(r8, r13)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121928d
                float r13 = r0.f121913i
                r12.mo153549i(r8, r13)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121926b
                float r13 = r0.f121911g
                r12.mo153549i(r8, r13)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121927c
                float r13 = r0.f121912h
                r12.mo153549i(r8, r13)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121929e
                android.content.res.ColorStateList[] r13 = r0.f121910f
                r13 = r13[r8]
                r12.setTextColor((android.content.res.ColorStateList) r13)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121928d
                android.content.res.ColorStateList[] r13 = r0.f121910f
                r13 = r13[r5]
                r12.setTextColor((android.content.res.ColorStateList) r13)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121926b
                android.content.res.ColorStateList[] r13 = r0.f121910f
                r13 = r13[r9]
                r12.setTextColor((android.content.res.ColorStateList) r13)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121927c
                android.content.res.ColorStateList[] r13 = r0.f121910f
                r13 = r13[r8]
                r12.setTextColor((android.content.res.ColorStateList) r13)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121929e
                r12.setShouldEllipsize(r7)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121928d
                r12.setShouldEllipsize(r8)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121926b
                r12.setShouldEllipsize(r7)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121927c
                r12.setShouldEllipsize(r7)
                com.tencent.mm.ui.base.NoMeasuredTextView r12 = r10.f121928d
                r12.setGravity(r6)
                goto L_0x0106
            L_0x00fe:
                java.lang.Object r10 = r23.getTag()
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e$b r10 = (com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.C44944e.C44946b) r10
                r11 = r23
            L_0x0106:
                com.tencent.mm.storage.h2 r12 = r21.getItem(r22)
                if (r12 != 0) goto L_0x010d
                return r11
            L_0x010d:
                di3.d r13 = di3.C86312j.m106911c(r2)
                ln.f r13 = (p196ln.C76705f) r13
                android.widget.ImageView r14 = r10.f121925a
                java.lang.String r15 = r12.getUsername()
                r13.mo106849z(r14, r15)
                java.lang.String r13 = r12.getUsername()
                java.util.HashMap<java.lang.String, com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e$a> r14 = r0.f121914j
                java.lang.Object r14 = r14.get(r13)
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e$a r14 = (com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.C44944e.C44945a) r14
                java.lang.String r15 = "@t.qq.com"
                if (r14 != 0) goto L_0x056f
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e$a r14 = new com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e$a
                r14.<init>(r0, r4)
                java.lang.String r16 = r12.getUsername()
                boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r16)
                r14.f121923h = r6
                r14.f121924i = r8
                r14.f121920e = r8
                java.lang.String r6 = r12.mo108781B2()
                int r6 = r0.mo70239f(r6)
                r4 = 34
                java.lang.String r5 = ":"
                if (r6 != r4) goto L_0x01ec
                int r4 = r12.mo108832y2()
                if (r4 != 0) goto L_0x01ec
                java.lang.String r4 = r12.getContent()
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x01ec
                java.lang.String r4 = r12.getContent()
                java.lang.String r6 = "qmessage"
                boolean r6 = r13.equals(r6)
                if (r6 != 0) goto L_0x0171
                java.lang.String r6 = "floatbottle"
                boolean r6 = r13.equals(r6)
                if (r6 == 0) goto L_0x0199
            L_0x0171:
                java.lang.String[] r6 = r4.split(r5)
                if (r6 == 0) goto L_0x0199
                int r8 = r6.length
                if (r8 <= r9) goto L_0x0199
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r8 = r6[r7]
                r4.append(r8)
                r4.append(r5)
                r8 = 2
                r7 = r6[r8]
                r4.append(r7)
                r4.append(r5)
                r6 = r6[r9]
                r4.append(r6)
                java.lang.String r4 = r4.toString()
            L_0x0199:
                java.lang.String r6 = "\n"
                boolean r6 = r4.endsWith(r6)     // Catch:{ Exception -> 0x01df }
                if (r6 == 0) goto L_0x01ac
                int r6 = r4.length()     // Catch:{ Exception -> 0x01df }
                r7 = 1
                int r6 = r6 - r7
                r7 = 0
                java.lang.String r4 = r4.substring(r7, r6)     // Catch:{ Exception -> 0x01df }
            L_0x01ac:
                java.lang.String[] r4 = r4.split(r5)     // Catch:{ Exception -> 0x01df }
                int r6 = r4.length     // Catch:{ Exception -> 0x01df }
                r7 = 4
                if (r6 != r7) goto L_0x01bf
                r6 = 0
                r7 = r4[r6]     // Catch:{ Exception -> 0x01df }
                boolean r6 = com.tencent.p014mm.storage.C72996z1.m85811N4(r7)     // Catch:{ Exception -> 0x01df }
                if (r6 == 0) goto L_0x01bf
                r6 = 1
                goto L_0x01c0
            L_0x01bf:
                r6 = 0
            L_0x01c0:
                int r7 = r4.length     // Catch:{ Exception -> 0x01df }
                if (r7 <= r6) goto L_0x01c5
                r7 = r4[r6]     // Catch:{ Exception -> 0x01df }
            L_0x01c5:
                int r7 = r4.length     // Catch:{ Exception -> 0x01df }
                int r8 = r6 + 1
                if (r7 <= r8) goto L_0x01d1
                r7 = r4[r8]     // Catch:{ Exception -> 0x01df }
                r8 = 0
                com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r8)     // Catch:{ Exception -> 0x01df }
            L_0x01d1:
                int r7 = r4.length     // Catch:{ Exception -> 0x01df }
                r8 = 2
                int r6 = r6 + r8
                if (r7 <= r6) goto L_0x01e6
                r4 = r4[r6]     // Catch:{ Exception -> 0x01df }
                java.lang.String r6 = "1"
                boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x01df }
                goto L_0x01e7
            L_0x01df:
                java.lang.String r4 = "MicroMsg.VoiceContent"
                java.lang.String r6 = "VoiceContent parse failed."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)
            L_0x01e6:
                r4 = 0
            L_0x01e7:
                if (r4 != 0) goto L_0x01ec
                r4 = 1
                r14.f121920e = r4
            L_0x01ec:
                di3.d r4 = di3.C86312j.m106911c(r3)
                d62.i r4 = (d62.C75339i) r4
                java.lang.String r4 = r4.getDisplayName(r13)
                boolean r6 = r14.f121923h
                if (r6 == 0) goto L_0x0208
                if (r4 != 0) goto L_0x0208
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r4 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                r6 = 2131823645(0x7f110c1d, float:1.9280096E38)
                java.lang.String r4 = r4.getString(r6)
                r14.f121916a = r4
                goto L_0x0226
            L_0x0208:
                di3.d r4 = di3.C86312j.m106911c(r1)
                ny.h r4 = (p629ny.C76979h) r4
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r6 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                di3.d r7 = di3.C86312j.m106911c(r3)
                d62.i r7 = (d62.C75339i) r7
                java.lang.String r7 = r7.getDisplayName(r13)
                com.tencent.mm.ui.base.NoMeasuredTextView r8 = r10.f121926b
                float r8 = r8.getTextSize()
                android.text.SpannableString r4 = r4.yp0(r6, r7, r8)
                r14.f121916a = r4
            L_0x0226:
                java.lang.CharSequence r4 = r0.mo70237b(r12)
                r14.f121917b = r4
                com.tencent.mm.ui.base.NoMeasuredTextView r4 = r10.f121929e
                float r4 = r4.getTextSize()
                int r4 = (int) r4
                boolean r6 = r14.f121924i
                java.lang.String r7 = r12.mo108824r2()
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                java.lang.String r8 = " "
                r9 = -5569532(0xffffffffffab0404, float:NaN)
                if (r7 != 0) goto L_0x0285
                int r7 = r12.mo108818l2()
                if (r7 <= 0) goto L_0x0250
                int r7 = r12.mo108786G2()
                if (r7 > 0) goto L_0x0285
            L_0x0250:
                android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r5 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                r6 = 2131832641(0x7f112f41, float:1.9298342E38)
                java.lang.String r5 = r5.getString(r6)
                r3.<init>(r5)
                android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
                r5.<init>(r9)
                int r6 = r3.length()
                r7 = 33
                r9 = 0
                r3.setSpan(r5, r9, r6, r7)
                android.text.SpannableStringBuilder r5 = r3.append(r8)
                di3.d r1 = di3.C86312j.m106911c(r1)
                ny.h r1 = (p629ny.C76979h) r1
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r6 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                java.lang.String r7 = r12.mo108824r2()
                android.text.SpannableString r1 = r1.op0(r6, r7, r4)
                r5.append(r1)
                goto L_0x02a6
            L_0x0285:
                java.lang.String r7 = r12.mo108822p2()
                if (r7 == 0) goto L_0x02ac
                java.lang.String r9 = "<img src=\"original_label.png\"/>  "
                boolean r9 = r7.startsWith(r9)
                if (r9 == 0) goto L_0x02ac
                android.text.SpannableString r3 = new android.text.SpannableString
                di3.d r1 = di3.C86312j.m106911c(r1)
                ny.h r1 = (p629ny.C76979h) r1
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r5 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                float r4 = (float) r4
                r6 = 0
                android.text.SpannableString r1 = r1.mo107070jH(r5, r7, r4, r6)
                r3.<init>(r1)
            L_0x02a6:
                r19 = r2
                r17 = r11
                goto L_0x035c
            L_0x02ac:
                java.lang.String r7 = r12.getUsername()
                java.lang.String r9 = "qqmail"
                boolean r9 = r7.equals(r9)
                r17 = r11
                if (r9 == 0) goto L_0x02e5
                eb0.c r9 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r9 = r9.mo105906u()
                r11 = 17
                r19 = r2
                r2 = 0
                java.lang.Object r2 = r9.mo119684e(r11, r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r2)
                r9 = 1
                if (r2 != r9) goto L_0x02d6
                r2 = 1
                goto L_0x02d7
            L_0x02d6:
                r2 = 0
            L_0x02d7:
                if (r2 != 0) goto L_0x02e7
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r1 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                r2 = 2131836254(0x7f113d5e, float:1.930567E38)
                java.lang.String r1 = r1.getString(r2)
            L_0x02e2:
                r3 = r1
                goto L_0x035c
            L_0x02e5:
                r19 = r2
            L_0x02e7:
                java.lang.String r2 = "tmessage"
                boolean r2 = r7.equals(r2)
                if (r2 == 0) goto L_0x0314
                eb0.c r2 = eb0.C97625j3.m125812b()
                g62.p r2 = r2.mo105877C()
                com.tencent.mm.storage.s4 r2 = (com.tencent.p014mm.storage.C44667s4) r2
                com.tencent.mm.storage.r4 r2 = r2.mo69821jo(r15)
                if (r2 == 0) goto L_0x0307
                boolean r2 = r2.mo69814c()
                if (r2 == 0) goto L_0x0307
                r2 = 1
                goto L_0x0308
            L_0x0307:
                r2 = 0
            L_0x0308:
                if (r2 != 0) goto L_0x0314
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r1 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                r2 = 2131836254(0x7f113d5e, float:1.930567E38)
                java.lang.String r1 = r1.getString(r2)
                goto L_0x02e2
            L_0x0314:
                java.lang.String r2 = r12.mo108781B2()
                if (r2 == 0) goto L_0x0405
                java.lang.String r2 = r12.mo108781B2()
                r7 = 47
                java.lang.String r7 = java.lang.String.valueOf(r7)
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x033b
                java.lang.String r2 = r12.mo108781B2()
                r7 = 1048625(0x100031, float:1.469437E-39)
                java.lang.String r7 = java.lang.String.valueOf(r7)
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0405
            L_0x033b:
                java.lang.String r2 = r12.mo108822p2()
                java.lang.String r2 = r0.mo70236a(r2)
                java.lang.String r7 = "]"
                java.lang.String r9 = "["
                if (r2 == 0) goto L_0x0364
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r1.append(r2)
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                goto L_0x02e2
            L_0x035c:
                r18 = r10
                r20 = r13
                r16 = r15
                goto L_0x0537
            L_0x0364:
                java.lang.String r2 = r12.mo108822p2()
                java.lang.String r11 = ": "
                r16 = r15
                java.lang.String r15 = ""
                if (r2 == 0) goto L_0x03db
                java.lang.String r2 = r12.mo108822p2()
                boolean r2 = r2.contains(r5)
                if (r2 == 0) goto L_0x03db
                java.lang.String r2 = r12.mo108822p2()
                r18 = r10
                java.lang.String r10 = r12.mo108822p2()
                int r10 = r10.indexOf(r5)
                r20 = r13
                r13 = 0
                java.lang.String r2 = r2.substring(r13, r10)
                java.lang.String r10 = r12.mo108822p2()
                java.lang.String r13 = r12.mo108822p2()
                int r5 = r13.indexOf(r5)
                r13 = 1
                int r5 = r5 + r13
                java.lang.String r5 = r10.substring(r5)
                java.lang.String r5 = r5.replace(r8, r15)
                java.lang.String r5 = r0.mo70236a(r5)
                if (r5 == 0) goto L_0x03d9
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r1.append(r5)
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r3 == 0) goto L_0x03c4
                goto L_0x03d6
            L_0x03c4:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                r3.append(r11)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            L_0x03d6:
                r3 = r1
                goto L_0x0537
            L_0x03d9:
                r15 = r2
                goto L_0x03df
            L_0x03db:
                r18 = r10
                r20 = r13
            L_0x03df:
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r2 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                r5 = 2131821467(0x7f11039b, float:1.9275678E38)
                java.lang.String r2 = r2.getString(r5)
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r5 == 0) goto L_0x03ef
                goto L_0x0401
            L_0x03ef:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r15)
                r5.append(r11)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
            L_0x0401:
                r12.mo108794O2(r2)
                goto L_0x040b
            L_0x0405:
                r18 = r10
                r20 = r13
                r16 = r15
            L_0x040b:
                java.lang.String r2 = r12.mo108822p2()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x047f
                java.lang.String r2 = r12.mo108823q2()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x047a
                int r2 = r12.mo108832y2()
                if (r2 != 0) goto L_0x0442
                java.lang.String r2 = r12.getUsername()
                boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
                if (r2 == 0) goto L_0x0442
                di3.d r2 = di3.C86312j.m106911c(r3)
                d62.i r2 = (d62.C75339i) r2
                java.lang.String r3 = r12.mo108823q2()
                java.lang.String r5 = r12.getUsername()
                java.lang.String r2 = r2.mo62519pb(r3, r5)
                goto L_0x0450
            L_0x0442:
                di3.d r2 = di3.C86312j.m106911c(r3)
                d62.i r2 = (d62.C75339i) r2
                java.lang.String r3 = r12.mo108823q2()
                java.lang.String r2 = r2.getDisplayName(r3)
            L_0x0450:
                java.lang.String r3 = r12.mo108822p2()     // Catch:{ Exception -> 0x045f }
                r5 = 1
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x045f }
                r5 = 0
                r7[r5] = r2     // Catch:{ Exception -> 0x045f }
                java.lang.String r2 = java.lang.String.format(r3, r7)     // Catch:{ Exception -> 0x045f }
                goto L_0x0499
            L_0x045f:
                int r2 = r12.mo108832y2()
                java.lang.String r3 = r12.getUsername()
                java.lang.String r5 = r12.getContent()
                java.lang.String r7 = r12.mo108781B2()
                int r7 = r0.mo70239f(r7)
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r9 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                java.lang.String r2 = p875ci.C67379u.m79745j(r2, r3, r5, r7, r9)
                goto L_0x0499
            L_0x047a:
                java.lang.String r2 = r12.mo108822p2()
                goto L_0x0499
            L_0x047f:
                int r2 = r12.mo108832y2()
                java.lang.String r3 = r12.getUsername()
                java.lang.String r5 = r12.getContent()
                java.lang.String r7 = r12.mo108781B2()
                int r7 = r0.mo70239f(r7)
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r9 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                java.lang.String r2 = p875ci.C67379u.m79745j(r2, r3, r5, r7, r9)
            L_0x0499:
                r3 = 10
                r5 = 32
                java.lang.String r2 = r2.replace(r3, r5)
                int r3 = r12.mo108818l2()
                if (r3 <= 0) goto L_0x04e1
                int r3 = r12.mo108786G2()
                if (r3 <= 0) goto L_0x04e1
                android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r5 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                r6 = 2131832632(0x7f112f38, float:1.9298323E38)
                java.lang.String r5 = r5.getString(r6)
                r3.<init>(r5)
                android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
                r6 = -5569532(0xffffffffffab0404, float:NaN)
                r5.<init>(r6)
                int r6 = r3.length()
                r7 = 33
                r9 = 0
                r3.setSpan(r5, r9, r6, r7)
                android.text.SpannableStringBuilder r5 = r3.append(r8)
                di3.d r1 = di3.C86312j.m106911c(r1)
                ny.h r1 = (p629ny.C76979h) r1
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r6 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                android.text.SpannableString r1 = r1.op0(r6, r2, r4)
                r5.append(r1)
                goto L_0x0537
            L_0x04e1:
                r3 = 2131832635(0x7f112f3b, float:1.929833E38)
                if (r6 == 0) goto L_0x0504
                int r5 = r12.mo108786G2()
                r6 = 1
                if (r5 <= r6) goto L_0x0505
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r5 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                r7 = 2
                java.lang.Object[] r7 = new java.lang.Object[r7]
                int r8 = r12.mo108786G2()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r9 = 0
                r7[r9] = r8
                r7[r6] = r2
                java.lang.String r2 = r5.getString(r3, r7)
                goto L_0x052b
            L_0x0504:
                r6 = 1
            L_0x0505:
                int r5 = r12.mo108786G2()
                if (r5 <= r6) goto L_0x052b
                java.lang.String r5 = r12.mo108782C2()
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85841l5(r5)
                if (r5 == 0) goto L_0x052b
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r5 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                r7 = 2
                java.lang.Object[] r7 = new java.lang.Object[r7]
                int r8 = r12.mo108786G2()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r9 = 0
                r7[r9] = r8
                r7[r6] = r2
                java.lang.String r2 = r5.getString(r3, r7)
            L_0x052b:
                di3.d r1 = di3.C86312j.m106911c(r1)
                ny.h r1 = (p629ny.C76979h) r1
                com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI r3 = com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.this
                android.text.SpannableString r3 = r1.op0(r3, r2, r4)
            L_0x0537:
                r14.f121918c = r3
                int r1 = r12.getStatus()
                r2 = 1
                if (r1 == r2) goto L_0x0549
                r2 = 5
                if (r1 == r2) goto L_0x0545
                r1 = -1
                goto L_0x054c
            L_0x0545:
                r1 = 2131756708(0x7f1006a4, float:1.9144331E38)
                goto L_0x054c
            L_0x0549:
                r1 = 2131756709(0x7f1006a5, float:1.9144333E38)
            L_0x054c:
                r14.f121919d = r1
                boolean r1 = eb0.C45628s0.m50772f(r12)
                r14.f121921f = r1
                eb0.c r1 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v3 r1 = r1.mo105908w()
                com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
                boolean r1 = r1.mo69754Z(r12)
                r14.f121922g = r1
                com.tencent.p014mm.sdk.platformtools.LocaleUtil.isChineseAppLang()
                java.util.HashMap<java.lang.String, com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI$e$a> r1 = r0.f121914j
                r2 = r20
                r1.put(r2, r14)
                goto L_0x0578
            L_0x056f:
                r19 = r2
                r18 = r10
                r17 = r11
                r2 = r13
                r16 = r15
            L_0x0578:
                java.lang.CharSequence r1 = r14.f121917b
                if (r1 != 0) goto L_0x0582
                java.lang.CharSequence r1 = r0.mo70237b(r12)
                r14.f121917b = r1
            L_0x0582:
                boolean r1 = r14.f121924i
                if (r1 != 0) goto L_0x059f
                java.lang.String r1 = r12.mo108782C2()
                boolean r1 = com.tencent.p014mm.storage.C72996z1.m85841l5(r1)
                if (r1 == 0) goto L_0x0591
                goto L_0x059f
            L_0x0591:
                r10 = r18
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121929e
                android.content.res.ColorStateList[] r3 = r0.f121910f
                int r4 = r14.f121920e
                r3 = r3[r4]
                r1.setTextColor((android.content.res.ColorStateList) r3)
                goto L_0x05ab
            L_0x059f:
                r10 = r18
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121929e
                android.content.res.ColorStateList[] r3 = r0.f121910f
                r4 = 0
                r3 = r3[r4]
                r1.setTextColor((android.content.res.ColorStateList) r3)
            L_0x05ab:
                java.lang.String r1 = r2.toLowerCase()
                r3 = r16
                boolean r1 = r1.endsWith(r3)
                if (r1 == 0) goto L_0x05c7
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121926b
                r3 = 2131233376(0x7f080a60, float:1.8082888E38)
                r1.setCompoundRightDrawablesWithIntrinsicBounds((int) r3)
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121926b
                r3 = 1
                r1.setDrawRightDrawable(r3)
                r4 = 0
                goto L_0x05ce
            L_0x05c7:
                r3 = 1
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121926b
                r4 = 0
                r1.setDrawRightDrawable(r4)
            L_0x05ce:
                int r1 = r14.f121919d
                r5 = -1
                if (r1 == r5) goto L_0x05de
                com.tencent.mm.ui.base.NoMeasuredTextView r5 = r10.f121929e
                r5.setCompoundLeftDrawablesWithIntrinsicBounds((int) r1)
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121929e
                r1.setDrawLeftDrawable(r3)
                goto L_0x05e3
            L_0x05de:
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121929e
                r1.setDrawLeftDrawable(r4)
            L_0x05e3:
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121926b
                java.lang.CharSequence r3 = r14.f121916a
                r1.setText((java.lang.CharSequence) r3)
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121927c
                r3 = 8
                r1.setVisibility(r3)
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121928d
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                java.lang.CharSequence r4 = r14.f121917b
                int r4 = r4.length()
                r5 = 9
                if (r4 <= r5) goto L_0x060f
                int r4 = r1.width
                int r5 = r0.f121909e
                if (r4 == r5) goto L_0x061c
                r1.width = r5
                com.tencent.mm.ui.base.NoMeasuredTextView r4 = r10.f121928d
                r4.setLayoutParams(r1)
                goto L_0x061c
            L_0x060f:
                int r4 = r1.width
                int r5 = r0.f121908d
                if (r4 == r5) goto L_0x061c
                r1.width = r5
                com.tencent.mm.ui.base.NoMeasuredTextView r4 = r10.f121928d
                r4.setLayoutParams(r1)
            L_0x061c:
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r1 = r1.width
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5 = 0
                r4[r5] = r1
                java.lang.String r1 = "MicroMsg.SettingCheckUnProcessWalletConvUI"
                java.lang.String r5 = "layout update time width %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r1, r5, r4)
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121928d
                java.lang.CharSequence r4 = r14.f121917b
                r1.setText((java.lang.CharSequence) r4)
                com.tencent.mm.ui.base.NoMeasuredTextView r1 = r10.f121929e
                java.lang.CharSequence r4 = r14.f121918c
                r1.setText((java.lang.CharSequence) r4)
                boolean r1 = r14.f121923h
                android.widget.ImageView r1 = r10.f121930f
                r1.setVisibility(r3)
                di3.d r1 = di3.C86312j.m106911c(r19)
                ln.f r1 = (p196ln.C76705f) r1
                android.widget.ImageView r4 = r10.f121925a
                r1.mo106849z(r4, r2)
                boolean r1 = r14.f121921f
                if (r1 != 0) goto L_0x066a
                boolean r1 = r14.f121922g
                if (r1 == 0) goto L_0x066a
                boolean r1 = eb0.C97625j3.m125811a()
                if (r1 == 0) goto L_0x066a
                eb0.c r1 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v3 r1 = r1.mo105908w()
                com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
                r1.mo69770i0(r12)
            L_0x066a:
                boolean r1 = r14.f121922g
                r2 = 2131300457(0x7f091069, float:1.8218944E38)
                if (r1 == 0) goto L_0x0688
                long r4 = r12.mo108821o2()
                r6 = -1
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 == 0) goto L_0x0688
                r11 = r17
                android.view.View r1 = r11.findViewById(r2)
                r2 = 2131231817(0x7f080449, float:1.8079726E38)
                r1.setBackgroundResource(r2)
                goto L_0x0694
            L_0x0688:
                r11 = r17
                android.view.View r1 = r11.findViewById(r2)
                r2 = 2131231818(0x7f08044a, float:1.8079728E38)
                r1.setBackgroundResource(r2)
            L_0x0694:
                android.widget.ImageView r1 = r10.f121931g
                r1.setVisibility(r3)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.SettingCheckUnProcessWalletConvUI.C44944e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bwt;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.krh);
        setBackBtn(new C44937a());
        this.f121896d = (ListView) findViewById(C0966R.C0970id.bt_);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_conversation_list");
        this.f121897e = stringArrayListExtra;
        if (stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
            C44944e eVar = new C44944e();
            this.f121898f = eVar;
            this.f121896d.setAdapter(eVar);
            this.f121896d.setOnTouchListener(new C44938b());
            this.f121896d.setOnItemClickListener(new C44939c());
            this.f121896d.setOnItemLongClickListener(new C44940d());
        }
    }
}
