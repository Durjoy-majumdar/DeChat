package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74536o1;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kv1.C99254i;
import lv1.C99667f;
import p242ti.C13926b;

/* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI */
public class SelectMemberUI extends MMActivity implements C74493g1, C74498h1.C44878a {

    /* renamed from: d */
    public ListView f108215d;

    /* renamed from: e */
    public MMEditText f108216e;

    /* renamed from: f */
    public View f108217f;

    /* renamed from: g */
    public View f108218g;

    /* renamed from: h */
    public SelectMemberScrollBar f108219h;

    /* renamed from: i */
    public C74536o1 f108220i;

    /* renamed from: j */
    public C40250g f108221j;

    /* renamed from: n */
    public C44661m1 f108222n;

    /* renamed from: o */
    public String f108223o;

    /* renamed from: p */
    public String f108224p;

    /* renamed from: q */
    public HashSet<String> f108225q;

    /* renamed from: r */
    public boolean f108226r;

    /* renamed from: s */
    public boolean f108227s;

    /* renamed from: t */
    public TextView f108228t;

    /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$a */
    public class C40243a implements VerticalScrollBar.C6756b {
        public C40243a() {
        }

        /* renamed from: S0 */
        public void mo5638S0(String str) {
            if ("↑".equals(str)) {
                SelectMemberUI.this.f108215d.setSelection(0);
                return;
            }
            C40250g gVar = SelectMemberUI.this.f108221j;
            int intValue = gVar.f108247n.containsKey(str) ? gVar.f108247n.get(str).intValue() : -1;
            if (intValue != -1) {
                SelectMemberUI.this.f108215d.setSelection(intValue);
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$b */
    public class C40244b implements TextWatcher {

        /* renamed from: d */
        public MTimerHandler f108230d = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C40245a(), false);

        /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$b$a */
        public class C40245a implements MTimerHandler.CallBack {
            public C40245a() {
            }

            public boolean onTimerExpired() {
                C72996z1 z1Var;
                C44673z4 Lo;
                String str;
                Log.m105918d("MicroMsg.SelectMemberUI", "searchEvent onTimerExpired");
                if (SelectMemberUI.this.mo62779P7()) {
                    SelectMemberUI selectMemberUI = SelectMemberUI.this;
                    selectMemberUI.f108220i.mo103590v(selectMemberUI.f108216e.getText().toString());
                } else {
                    SelectMemberUI selectMemberUI2 = SelectMemberUI.this;
                    C40250g gVar = selectMemberUI2.f108221j;
                    String obj = selectMemberUI2.f108216e.getText().toString();
                    gVar.getClass();
                    Log.m105925i("MicroMsg.SelectMemberAdapter", "search:%s isLoading:%s", Util.secPrint(obj), Boolean.valueOf(gVar.f108246j));
                    if (!gVar.f108246j) {
                        Log.m105924i("MicroMsg.SelectMemberAdapter", "[setMemberListBySearch]");
                        ArrayList arrayList = new ArrayList();
                        if (!Util.isNullOrNil(obj)) {
                            for (C40249f next : gVar.f108244h) {
                                if (!(next == null || (z1Var = next.f108239b) == null || next.f108238a != 1)) {
                                    if (z1Var.mo73969n2() != null && z1Var.mo73969n2().contains(obj)) {
                                        arrayList.add(next);
                                    } else if (!Util.isNullOrNil(SeeRoomMemberUI.m80283I7(gVar.f108241e, z1Var.getUsername())) && SeeRoomMemberUI.m80283I7(gVar.f108241e, z1Var.getUsername()).contains(obj)) {
                                        arrayList.add(next);
                                    } else if (z1Var.mo62909j3() != null && z1Var.mo62909j3().contains(obj)) {
                                        arrayList.add(next);
                                    } else if (z1Var.mo62942y2() != null && z1Var.mo62942y2().contains(obj)) {
                                        arrayList.add(next);
                                    } else if (z1Var.mo62913l2() != null && z1Var.mo62913l2().contains(obj)) {
                                        arrayList.add(next);
                                    } else if (z1Var.getUsername() != null && z1Var.getUsername().contains(obj)) {
                                        arrayList.add(next);
                                    } else if (!z1Var.mo62927s3() && (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mm0()).mo69630Lo(z1Var.getUsername())) != null && (str = Lo.field_conRemark) != null && str.contains(obj)) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                            gVar.f108245i = arrayList;
                        } else {
                            gVar.f108245i = gVar.f108244h;
                        }
                        MMHandlerThread.postToMainThread(new C40259d2(gVar));
                    }
                }
                return false;
            }
        }

        public C40244b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f108230d.stopTimer();
            this.f108230d.startTimer(500);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$c */
    public class C40246c implements MenuItem.OnMenuItemClickListener {
        public C40246c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectMemberUI.this.setResult(0, new Intent());
            SelectMemberUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$d */
    public class C40247d implements AdapterView.OnItemClickListener {
        public C40247d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/SelectMemberUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            ListAdapter adapter = SelectMemberUI.this.f108215d.getAdapter();
            SelectMemberUI selectMemberUI = SelectMemberUI.this;
            if (adapter == selectMemberUI.f108220i) {
                selectMemberUI.mo62762N7(view, i, j);
            }
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$e */
    public class C40248e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f108235d;

        /* renamed from: e */
        public final /* synthetic */ int f108236e;

        public C40248e(String str, int i) {
            this.f108235d = str;
            this.f108236e = i;
        }

        public void run() {
            if (Util.isNullOrNil(this.f108235d)) {
                SelectMemberUI selectMemberUI = SelectMemberUI.this;
                selectMemberUI.f108215d.setAdapter(selectMemberUI.f108221j);
                SelectMemberUI.this.f108228t.setVisibility(8);
                return;
            }
            SelectMemberUI selectMemberUI2 = SelectMemberUI.this;
            selectMemberUI2.f108215d.setAdapter(selectMemberUI2.f108220i);
            if (this.f108236e > 0) {
                SelectMemberUI.this.f108228t.setVisibility(8);
                return;
            }
            SelectMemberUI selectMemberUI3 = SelectMemberUI.this;
            TextView textView = selectMemberUI3.f108228t;
            String string = selectMemberUI3.getString(C0966R.string.igo);
            String string2 = SelectMemberUI.this.getString(C0966R.string.ign);
            String str = this.f108235d;
            textView.setText(C99254i.m129307d(string, string2, C99667f.m130088a(str, str, false, false)).f292107a);
            SelectMemberUI.this.f108228t.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$f */
    public class C40249f {

        /* renamed from: a */
        public int f108238a;

        /* renamed from: b */
        public C72996z1 f108239b;

        public C40249f(SelectMemberUI selectMemberUI, int i, C72996z1 z1Var) {
            this.f108238a = i;
            this.f108239b = z1Var;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$g */
    public class C40250g extends BaseAdapter {

        /* renamed from: d */
        public final String f108240d = new String(Character.toChars(91));

        /* renamed from: e */
        public C44661m1 f108241e;

        /* renamed from: f */
        public Context f108242f;

        /* renamed from: g */
        public String f108243g = null;

        /* renamed from: h */
        public List<C40249f> f108244h = new ArrayList(0);

        /* renamed from: i */
        public List<C40249f> f108245i = new ArrayList();

        /* renamed from: j */
        public volatile boolean f108246j = false;

        /* renamed from: n */
        public HashMap<String, Integer> f108247n = new HashMap<>();

        /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$g$a */
        public class C40251a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C40254h f108249d;

            public C40251a(C40250g gVar, C40254h hVar) {
                this.f108249d = hVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f108249d.f108259f.performClick();
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$g$b */
        public class C40252b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ View f108250d;

            /* renamed from: e */
            public final /* synthetic */ C40254h f108251e;

            public C40252b(View view, C40254h hVar) {
                this.f108250d = view;
                this.f108251e = hVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int intValue = ((Integer) view.getTag()).intValue();
                C40249f b = C40250g.this.getItem(intValue);
                if (b == null) {
                    Log.m105920e("MicroMsg.SelectMemberAdapter", "item is null");
                    C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                SelectMemberUI selectMemberUI = SelectMemberUI.this;
                View view2 = this.f108250d;
                C40254h hVar = this.f108251e;
                selectMemberUI.mo62776O7(view2, hVar.f108260g, hVar.f108258e, intValue, b.f108239b.getUsername());
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$g$c */
        public class C40253c implements View.OnClickListener {
            public C40253c() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SelectMemberUI.this.mo62762N7(view, ((C40254h) view.getTag()).f108261h, (long) view.getId());
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C40250g(Context context, C44661m1 m1Var, String str, String str2) {
            this.f108241e = m1Var;
            this.f108243g = str2;
            this.f108242f = context;
        }

        /* renamed from: a */
        public final String mo62796a(C72996z1 z1Var) {
            String str;
            C44673z4 Lo;
            if (!Util.isNullOrNil(z1Var.mo73969n2())) {
                str = z1Var.mo73969n2();
            } else {
                SelectMemberUI selectMemberUI = SelectMemberUI.this;
                C44661m1 m1Var = this.f108241e;
                String username = z1Var.getUsername();
                selectMemberUI.getClass();
                str = m1Var == null ? null : m1Var.mo69789q2(username);
            }
            if (Util.isNullOrNil(str)) {
                str = z1Var.mo62909j3();
            }
            return (z1Var.mo62927s3() || (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mm0()).mo69630Lo(z1Var.getUsername())) == null || Util.isNullOrNil(Lo.field_conRemark)) ? str : Lo.field_conRemark;
        }

        /* renamed from: b */
        public C40249f getItem(int i) {
            if (this.f108245i.size() > i) {
                return this.f108245i.get(i);
            }
            return null;
        }

        public int getCount() {
            if (this.f108245i == null || this.f108246j) {
                return 0;
            }
            return this.f108245i.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.tencent.mm.chatroom.ui.SelectMemberUI$h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r21, android.view.View r22, android.view.ViewGroup r23) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Class<ny.h> r1 = p629ny.C76979h.class
                r2 = 2131231750(0x7f080406, float:1.807959E38)
                r3 = 2131755390(0x7f10017e, float:1.9141658E38)
                r4 = 2
                r5 = 0
                r6 = 2131300289(0x7f090fc1, float:1.8218603E38)
                if (r22 != 0) goto L_0x00e2
                android.content.Context r7 = r0.f108242f
                r8 = 2131497370(0x7f0c119a, float:1.8618331E38)
                android.view.View r7 = android.view.View.inflate(r7, r8, r5)
                com.tencent.mm.chatroom.ui.SelectMemberUI$h r8 = new com.tencent.mm.chatroom.ui.SelectMemberUI$h
                r8.<init>()
                r9 = 2131306586(0x7f09285a, float:1.8231375E38)
                android.view.View r9 = r7.findViewById(r9)
                android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
                r8.f108260g = r9
                r9 = 2131313109(0x7f0941d5, float:1.8244605E38)
                android.view.View r9 = r7.findViewById(r9)
                com.tencent.mm.ui.base.MaskLayout r9 = (com.tencent.p014mm.p136ui.base.MaskLayout) r9
                r8.f108255b = r9
                r9 = 2131313111(0x7f0941d7, float:1.824461E38)
                android.view.View r10 = r7.findViewById(r9)
                com.tencent.mm.ui.base.EllipsizeTextView r10 = (com.tencent.p014mm.p136ui.base.EllipsizeTextView) r10
                r8.f108256c = r10
                android.view.View r9 = r7.findViewById(r9)
                android.widget.TextView r9 = (android.widget.TextView) r9
                r8.f108256c = r9
                r9 = 2131298464(0x7f0908a0, float:1.8214902E38)
                android.view.View r9 = r7.findViewById(r9)
                android.widget.ImageButton r9 = (android.widget.ImageButton) r9
                r8.f108258e = r9
                r9 = 2131298465(0x7f0908a1, float:1.8214904E38)
                android.view.View r9 = r7.findViewById(r9)
                android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
                r8.f108259f = r9
                android.content.Context r9 = r0.f108242f
                java.lang.String r10 = "window"
                java.lang.Object r9 = r9.getSystemService(r10)
                android.view.WindowManager r9 = (android.view.WindowManager) r9
                android.widget.TextView r10 = r8.f108256c
                android.view.Display r11 = r9.getDefaultDisplay()
                int r11 = r11.getWidth()
                int r11 = r11 * 2
                int r11 = r11 / 3
                r10.setMaxWidth(r11)
                r10 = 2131313110(0x7f0941d6, float:1.8244608E38)
                android.view.View r10 = r7.findViewById(r10)
                android.widget.TextView r10 = (android.widget.TextView) r10
                r8.f108257d = r10
                android.view.Display r9 = r9.getDefaultDisplay()
                int r9 = r9.getWidth()
                int r9 = r9 * 2
                int r9 = r9 / 3
                r10.setMaxWidth(r9)
                r7.setTag(r8)
                com.tencent.mm.chatroom.ui.SelectMemberUI$f r9 = r20.getItem(r21)
                if (r9 == 0) goto L_0x00c5
                com.tencent.mm.chatroom.ui.SelectMemberUI r10 = com.tencent.p014mm.chatroom.p015ui.SelectMemberUI.this
                java.util.HashSet<java.lang.String> r10 = r10.f108225q
                com.tencent.mm.storage.z1 r9 = r9.f108239b
                java.lang.String r9 = r9.getUsername()
                boolean r9 = r10.contains(r9)
                if (r9 == 0) goto L_0x00b9
                android.widget.ImageButton r9 = r8.f108258e
                r9.setImageResource(r2)
                android.widget.LinearLayout r9 = r8.f108260g
                java.lang.Boolean r10 = java.lang.Boolean.FALSE
                r9.setTag(r6, r10)
                goto L_0x00c5
            L_0x00b9:
                android.widget.ImageButton r9 = r8.f108258e
                r9.setImageResource(r3)
                android.widget.LinearLayout r9 = r8.f108260g
                java.lang.Boolean r10 = java.lang.Boolean.TRUE
                r9.setTag(r6, r10)
            L_0x00c5:
                android.widget.ImageButton r9 = r8.f108258e
                com.tencent.mm.chatroom.ui.SelectMemberUI$g$a r10 = new com.tencent.mm.chatroom.ui.SelectMemberUI$g$a
                r10.<init>(r0, r8)
                r9.setOnClickListener(r10)
                android.widget.LinearLayout r9 = r8.f108259f
                com.tencent.mm.chatroom.ui.SelectMemberUI$g$b r10 = new com.tencent.mm.chatroom.ui.SelectMemberUI$g$b
                r10.<init>(r7, r8)
                r9.setOnClickListener(r10)
                com.tencent.mm.chatroom.ui.SelectMemberUI$g$c r9 = new com.tencent.mm.chatroom.ui.SelectMemberUI$g$c
                r9.<init>()
                r7.setOnClickListener(r9)
                goto L_0x00eb
            L_0x00e2:
                java.lang.Object r7 = r22.getTag()
                r8 = r7
                com.tencent.mm.chatroom.ui.SelectMemberUI$h r8 = (com.tencent.p014mm.chatroom.p015ui.SelectMemberUI.C40254h) r8
                r7 = r22
            L_0x00eb:
                com.tencent.mm.chatroom.ui.SelectMemberUI$f r9 = r20.getItem(r21)
                android.widget.LinearLayout r10 = r8.f108259f
                java.lang.Integer r11 = java.lang.Integer.valueOf(r21)
                r10.setTag(r11)
                r10 = 1
                r11 = 0
                if (r9 != 0) goto L_0x0116
                java.lang.Object[] r1 = new java.lang.Object[r4]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
                r1[r11] = r2
                int r2 = r20.getCount()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r10] = r2
                java.lang.String r2 = "MicroMsg.SelectMemberAdapter"
                java.lang.String r3 = "null == item! position:%s, count:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r1)
                return r7
            L_0x0116:
                com.tencent.mm.storage.z1 r4 = r9.f108239b
                com.tencent.mm.ui.base.MaskLayout r12 = r8.f108255b
                android.view.View r12 = r12.getContentView()
                android.widget.ImageView r12 = (android.widget.ImageView) r12
                java.lang.Class<ln.f> r13 = p196ln.C76705f.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                ln.f r13 = (p196ln.C76705f) r13
                java.lang.String r14 = r4.getUsername()
                r13.mo106849z(r12, r14)
                int r12 = r4.mo73953E2()
                if (r12 == 0) goto L_0x013b
                com.tencent.mm.ui.base.MaskLayout r12 = r8.f108255b
                r12.setMaskDrawable(r5)
                goto L_0x0140
            L_0x013b:
                com.tencent.mm.ui.base.MaskLayout r12 = r8.f108255b
                r12.setMaskDrawable(r5)
            L_0x0140:
                java.lang.String r5 = r0.mo62796a(r4)
                boolean r12 = r4.mo62927s3()
                java.lang.String r13 = ""
                if (r12 == 0) goto L_0x014f
                java.lang.String r12 = r4.f149513S0
                goto L_0x0150
            L_0x014f:
                r12 = r13
            L_0x0150:
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                r15 = 8
                if (r14 != 0) goto L_0x0175
                android.widget.TextView r13 = r8.f108257d
                r13.setVisibility(r11)
                android.widget.TextView r13 = r8.f108257d
                di3.d r14 = di3.C86312j.m106911c(r1)
                ny.h r14 = (p629ny.C76979h) r14
                android.content.Context r2 = r0.f108242f
                android.widget.TextView r6 = r8.f108257d
                float r6 = r6.getTextSize()
                android.text.SpannableString r2 = r14.yp0(r2, r12, r6)
                r13.setText(r2)
                goto L_0x017f
            L_0x0175:
                android.widget.TextView r2 = r8.f108257d
                r2.setVisibility(r15)
                android.widget.TextView r2 = r8.f108257d
                r2.setText(r13)
            L_0x017f:
                java.lang.String r2 = r4.getUsername()
                boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
                if (r2 == 0) goto L_0x01b0
                java.lang.Class<he0.j> r1 = he0.C76158j.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                r13 = r1
                he0.j r13 = (he0.C76158j) r13
                android.content.Context r14 = r0.f108242f
                android.widget.TextView r1 = r8.f108256c
                java.lang.String r17 = r4.mo73980x2()
                java.lang.String r18 = r4.mo73976t2()
                android.widget.TextView r2 = r8.f108256c
                float r2 = r2.getTextSize()
                int r2 = (int) r2
                r6 = 8
                r15 = r1
                r16 = r5
                r19 = r2
                r13.mo106359LW(r14, r15, r16, r17, r18, r19)
                goto L_0x01c9
            L_0x01b0:
                r6 = 8
                android.widget.TextView r2 = r8.f108256c
                di3.d r1 = di3.C86312j.m106911c(r1)
                ny.h r1 = (p629ny.C76979h) r1
                android.content.Context r12 = r0.f108242f
                android.widget.TextView r13 = r8.f108256c
                float r13 = r13.getTextSize()
                android.text.SpannableString r1 = r1.yp0(r12, r5, r13)
                r2.setText(r1)
            L_0x01c9:
                com.tencent.mm.chatroom.ui.SelectMemberUI r1 = com.tencent.p014mm.chatroom.p015ui.SelectMemberUI.this
                boolean r1 = r1.mo62775L7()
                if (r1 == 0) goto L_0x0245
                android.widget.ImageButton r1 = r8.f108258e
                r1.setVisibility(r11)
                android.widget.LinearLayout r1 = r8.f108259f
                r1.setVisibility(r11)
                com.tencent.mm.chatroom.ui.SelectMemberUI r1 = com.tencent.p014mm.chatroom.p015ui.SelectMemberUI.this
                java.util.HashSet r1 = r1.mo62773J7()
                java.lang.String r2 = r4.getUsername()
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L_0x0208
                android.widget.LinearLayout r1 = r8.f108259f
                r1.setEnabled(r11)
                android.widget.ImageButton r1 = r8.f108258e
                r1.setEnabled(r11)
                android.widget.ImageButton r1 = r8.f108258e
                boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r2 == 0) goto L_0x0201
                r2 = 2131755400(0x7f100188, float:1.9141678E38)
                goto L_0x0204
            L_0x0201:
                r2 = 2131755399(0x7f100187, float:1.9141676E38)
            L_0x0204:
                r1.setImageResource(r2)
                goto L_0x024f
            L_0x0208:
                android.widget.LinearLayout r1 = r8.f108259f
                r1.setEnabled(r10)
                android.widget.ImageButton r1 = r8.f108258e
                r1.setEnabled(r10)
                com.tencent.mm.chatroom.ui.SelectMemberUI r1 = com.tencent.p014mm.chatroom.p015ui.SelectMemberUI.this
                java.util.HashSet<java.lang.String> r1 = r1.f108225q
                com.tencent.mm.storage.z1 r2 = r9.f108239b
                java.lang.String r2 = r2.getUsername()
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L_0x0232
                android.widget.ImageButton r1 = r8.f108258e
                r1.setImageResource(r3)
                android.widget.LinearLayout r1 = r8.f108260g
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r3 = 2131300289(0x7f090fc1, float:1.8218603E38)
                r1.setTag(r3, r2)
                goto L_0x024f
            L_0x0232:
                r3 = 2131300289(0x7f090fc1, float:1.8218603E38)
                android.widget.ImageButton r1 = r8.f108258e
                r2 = 2131231750(0x7f080406, float:1.807959E38)
                r1.setImageResource(r2)
                android.widget.LinearLayout r1 = r8.f108260g
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r1.setTag(r3, r2)
                goto L_0x024f
            L_0x0245:
                android.widget.ImageButton r1 = r8.f108258e
                r1.setVisibility(r6)
                android.widget.LinearLayout r1 = r8.f108259f
                r1.setVisibility(r6)
            L_0x024f:
                r8.f108254a = r9
                r1 = r21
                r8.f108261h = r1
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.SelectMemberUI.C40250g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectMemberUI$h */
    public static class C40254h {

        /* renamed from: a */
        public C40249f f108254a;

        /* renamed from: b */
        public MaskLayout f108255b;

        /* renamed from: c */
        public TextView f108256c;

        /* renamed from: d */
        public TextView f108257d;

        /* renamed from: e */
        public ImageButton f108258e;

        /* renamed from: f */
        public LinearLayout f108259f;

        /* renamed from: g */
        public LinearLayout f108260g;

        /* renamed from: h */
        public int f108261h;
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        return false;
    }

    /* renamed from: H7 */
    public BaseAdapter mo62784H7() {
        return this.f108221j;
    }

    /* renamed from: I7 */
    public HashSet<String> mo62778I7() {
        return new HashSet<>();
    }

    /* renamed from: J7 */
    public HashSet<String> mo62773J7() {
        return new HashSet<>();
    }

    /* renamed from: K7 */
    public void mo62774K7() {
        String stringExtra = getIntent().getStringExtra("RoomInfo_Id");
        this.f108223o = stringExtra;
        Log.m105925i("MicroMsg.SelectMemberUI", "[getIntentParams] roomId:%s", stringExtra);
        this.f108222n = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(this.f108223o);
        getIntent().getIntExtra("from_scene", 0);
        this.f108224p = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f108226r = getIntent().getBooleanExtra("is_show_owner", true);
        this.f108227s = getIntent().getBooleanExtra("is_mulit_select_mode", false);
        this.f108225q = new HashSet<>();
    }

    /* renamed from: L7 */
    public boolean mo62775L7() {
        return this.f108227s;
    }

    /* renamed from: M7 */
    public List<String> mo62785M7() {
        return this.f108222n.mo69790r2();
    }

    /* renamed from: N7 */
    public void mo62762N7(View view, int i, long j) {
    }

    /* renamed from: O7 */
    public void mo62776O7(View view, LinearLayout linearLayout, ImageButton imageButton, int i, String str) {
        if (!mo62773J7().contains(str)) {
            if (this.f108225q.contains(str)) {
                this.f108225q.remove(str);
                imageButton.setImageResource(C0966R.C0969drawable.f4823ny);
                linearLayout.setTag(C0966R.C0970id.bp8, Boolean.FALSE);
                return;
            }
            this.f108225q.add(str);
            imageButton.setImageResource(C0966R.raw.checkbox_selected);
            linearLayout.setTag(C0966R.C0970id.bp8, Boolean.TRUE);
        }
    }

    /* renamed from: P7 */
    public boolean mo62779P7() {
        return !(this instanceof SelectAddRoomManagerUI);
    }

    /* renamed from: f6 */
    public ListView mo7831f6() {
        return this.f108215d;
    }

    public Activity getActivity() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bw8;
    }

    public void initView() {
        setMMTitle(Util.nullAsNil(this.f108224p));
        this.f108215d = (ListView) findViewById(C0966R.C0970id.gri);
        this.f108217f = findViewById(C0966R.C0970id.j_d);
        this.f108218g = findViewById(C0966R.C0970id.j_f);
        this.f108228t = (TextView) findViewById(C0966R.C0970id.cjf);
        C44661m1 m1Var = this.f108222n;
        this.f108221j = new C40250g(this, m1Var, this.f108223o, m1Var.field_roomowner);
        HashSet hashSet = new HashSet();
        if (!(this instanceof SeeMemberRecordUI)) {
            hashSet.add(C75592q0.m90789s());
        }
        C74536o1 o1Var = new C74536o1(this, this.f108223o, 0, mo62775L7(), hashSet);
        this.f108220i = o1Var;
        o1Var.f219051i = this;
        this.f108215d.setAdapter(mo62784H7());
        SelectMemberScrollBar selectMemberScrollBar = (SelectMemberScrollBar) findViewById(C0966R.C0970id.grk);
        this.f108219h = selectMemberScrollBar;
        selectMemberScrollBar.setOnScrollBarTouchListener(new C40243a());
        if (!(this instanceof SelectDelRoomManagerUI)) {
            this.f108219h.setVisibility(0);
        } else {
            this.f108219h.setVisibility(8);
        }
        MMEditText mMEditText = (MMEditText) findViewById(C0966R.C0970id.j_b);
        this.f108216e = mMEditText;
        mMEditText.addTextChangedListener(new C40244b());
        C40250g gVar = this.f108221j;
        View view = SelectMemberUI.this.f108218g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C86709a0.m107525e().postToWorker(new C40256c2(gVar));
        setBackBtn(new C40246c());
        if (mo62779P7()) {
            this.f108215d.setOnItemClickListener(new C40247d());
        }
    }

    /* renamed from: n1 */
    public String mo7833n1(C75922b bVar) {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.SelectMemberUI", "[onCreate]");
        mo62774K7();
        initView();
    }

    public void onDestroy() {
        this.f108220i.mo7851i();
        super.onDestroy();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C13926b.class);
    }

    /* renamed from: t6 */
    public void mo62789t6(String str, int i, boolean z) {
        runOnUiThread(new C40248e(str, i));
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        return false;
    }
}
